package ru.geekbrains.patterns.singletons;

public class EagerInitSingleton {

  private static final EagerInitSingleton instance = new EagerInitSingleton();

  private EagerInitSingleton() {}

  public static EagerInitSingleton getInstance() {
    return instance;
  }

}
