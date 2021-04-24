#include <jni.h>
#include <stdio.h>
#include <string.h>

#define MAXC 2048
const char *arr[] = {"model name", "cpu cores", "cpu MHz", "cache size"};

JNIEXPORT jobject JNICALL
Java_ru_nsu_fit_ojp_ushaev_jni_SystemInfo_getCpuInfo(JNIEnv *env, jobject obj)
{
    jclass mapClass = (*env)->FindClass(env, "java/util/HashMap");

    if(mapClass == NULL) {
        return NULL;
    }

    jsize map_len = 1;

    jmethodID init = (*env)->GetMethodID(env, mapClass, "<init>", "(I)V");
    jobject hashMap = (*env)->NewObject(env, mapClass, init, map_len);

    jmethodID put = (*env)->GetMethodID(env, mapClass, "put",
                "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;");

    char buf[MAXC];
    FILE *fp = fopen ("/proc/cpuinfo", "r");

    if (!fp) {
        perror ("file open failed");
        return NULL;
    }

    while (fgets (buf, MAXC, fp)) {

        size_t len = sizeof(arr)/sizeof(arr[0]);
        for (int i = 0; i < len; i++) {
            char *cmpstr = arr[i];
            size_t cmplen = strlen (cmpstr);
            if (strncmp (buf, cmpstr, cmplen) == 0) {

                char *token = strtok(buf, ":");
                token = strtok(NULL, ":");
                token[strcspn(token, "\n")] = 0;

                jstring keyJava = (*env)->NewStringUTF(env, cmpstr);
                jstring valueJava = (*env)->NewStringUTF(env, token);

                (*env)->CallObjectMethod(env, hashMap, put, keyJava, valueJava);

                (*env)->DeleteLocalRef(env, keyJava);
                (*env)->DeleteLocalRef(env, valueJava);
            }
        }
    }
    fclose (fp);

    jobject hashMapGlobal = (*env)->NewGlobalRef(env, hashMap);
    (*env)->DeleteLocalRef(env, hashMap);
    (*env)->DeleteLocalRef(env, mapClass);

    return hashMapGlobal;
}