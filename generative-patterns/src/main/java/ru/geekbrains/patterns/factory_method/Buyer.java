package ru.geekbrains.patterns.factory_method;

public abstract class Buyer {
  public Buyer() {
    Console console = buyConsole();
  }

  public abstract Console buyConsole();
}
