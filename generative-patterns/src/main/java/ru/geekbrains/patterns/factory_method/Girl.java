package ru.geekbrains.patterns.factory_method;

public class Girl extends Buyer {

  public Console buyConsole() {
    return new XboxConsole();
  }
}
