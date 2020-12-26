package ru.geekbrains.patterns.abstract_factory;

public interface GameShopFactory {
  Game sellGame();
  Console sellConsole();
}
