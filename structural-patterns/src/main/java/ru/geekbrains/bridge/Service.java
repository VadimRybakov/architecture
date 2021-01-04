package ru.geekbrains.bridge;

public abstract class Service {
  Database database;

  public Service(Database database) {
    this.database = database;
  }
}
