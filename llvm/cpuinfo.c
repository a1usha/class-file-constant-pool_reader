#include <graalvm/llvm/polyglot.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#define MAXC 2048
const char *arr[] = {"model name", "cpu cores", "cpu MHz", "cache size"};

void* cpuinfo() {

    void *mapClass = polyglot_java_type("java.util.HashMap");
	if (mapClass == NULL) {
        return NULL;
    } 

	void *hashMap = polyglot_new_instance(mapClass);
	if (hashMap == NULL) {
        return NULL;
    }

    char buf[MAXC];
    FILE *fp = fopen ("/proc/cpuinfo", "r");

    if (!fp) {
        perror ("file open failed");
    }

    while (fgets (buf, MAXC, fp)) {

        size_t len = sizeof(arr)/sizeof(arr[0]);
        for (int i = 0; i < len; i++) {
            const char *cmpstr = arr[i];
            size_t cmplen = strlen(cmpstr);
            if (strncmp (buf, cmpstr, cmplen) == 0) {

                char *token = strtok(buf, ":");
                token = strtok(NULL, ":");
                token[strcspn(token, "\n")] = 0;

                void *key = polyglot_from_string(cmpstr, "UTF-8");
			    void *value = polyglot_from_string(token, "UTF-8");

                polyglot_invoke(hashMap, "put", key, value);
            }
        }
    }
    fclose (fp);
    return hashMap;
}