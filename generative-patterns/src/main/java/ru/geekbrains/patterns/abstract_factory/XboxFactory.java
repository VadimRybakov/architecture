package ru.geekbrains.patterns.abstract_factory;

public class XboxFactory implements GameShopFactory{

  public Game sellGame() {
    return new XboxGame();
  }

  public Console sellConsole() {
    return new XboxConsole();
  }
}
