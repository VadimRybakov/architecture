package ru.geekbrains.bridge;

public class MongoDb implements Database {

  @Override
  public String connect() {
    return "Connected to MongoDb";
  }
}
