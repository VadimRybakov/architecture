package ru.geekbrains.bridge;

public class Postgresql implements Database {

  @Override
  public String connect() {
    return "Connected to PostgreSQL";
  }
}
