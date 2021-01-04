package ru.geekbrains.composite;

public class File implements Data {

  private final String name;

  public File(String name) {
    this.name = name;
  }

  @Override
  public String info() {
    return name;
  }

}
