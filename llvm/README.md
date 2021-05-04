# Интеграция нативного LLVM кода с JVM

Осуществляется компиляция `C` кода в биткод для `LLVM`, который вызывается в `java` программе при помощи `Polyglot API`. Результатом работы программы является вывод информации о CPU.

Компиляция
```
make
```

Запуск
```
java Main
```

Пример компиляции и запуска
```
$ make
$ java Main

model name      : Intel(R) Core(TM) i3-7100U CPU @ 2.40GHz
cpu MHz         : 2400.000
cache size      : 256 KB
cpu cores       : 2
model name      : Intel(R) Core(TM) i3-7100U CPU @ 2.40GHz
cpu MHz         : 2400.000
cache size      : 256 KB
cpu cores       : 2
model name      : Intel(R) Core(TM) i3-7100U CPU @ 2.40GHz
cpu MHz         : 2400.000
cache size      : 256 KB
cpu cores       : 2
model name      : Intel(R) Core(TM) i3-7100U CPU @ 2.40GHz
cpu MHz         : 2400.000
cache size      : 256 KB
cpu cores       : 2
```