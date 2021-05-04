#include <stdio.h>
#include <string.h>

#define MAXC 2048
const char *arr[] = {"model name", "cpu cores", "cpu MHz", "cache size"};

void cpuinfo() {

    char buf[MAXC];
    FILE *fp = fopen ("/proc/cpuinfo", "r");

    if (!fp) {
        perror ("file open failed");
    }

    while (fgets (buf, MAXC, fp)) {

        size_t len = sizeof(arr)/sizeof(arr[0]);
        for (int i = 0; i < len; i++) {
            const char *cmpstr = arr[i];
            size_t cmplen = strlen (cmpstr);
            if (strncmp (buf, cmpstr, cmplen) == 0) {
                printf("%s", buf);
            }
        }
    }
    fclose (fp);
}