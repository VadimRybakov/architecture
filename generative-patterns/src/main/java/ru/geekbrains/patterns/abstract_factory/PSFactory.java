package ru.geekbrains.patterns.abstract_factory;

public class PSFactory implements GameShopFactory{

  public Game sellGame() {
    return new PSGame();
  }

  public Console sellConsole() {
    return new PSConsole();
  }
}
