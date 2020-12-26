package ru.geekbrains.patterns.singletons;

public class LazyInitSingleton {

  private static volatile LazyInitSingleton instance;

  private LazyInitSingleton() {}

  public static LazyInitSingleton getInstance() {
    if(instance == null) {
      synchronized (LazyInitSingleton.class) {
        if(instance == null) {
          instance = new LazyInitSingleton();
        }
      }
    }
    return instance;
  }

}
