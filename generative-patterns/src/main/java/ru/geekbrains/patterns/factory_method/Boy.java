package ru.geekbrains.patterns.factory_method;

public class Boy extends  Buyer {

  public Console buyConsole() {
    return new PSConsole();
  }
}
