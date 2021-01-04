package ru.geekbrains.bridge;

public class NewsService extends Service {

  public NewsService(Database database) {
    super(database);
  }

  public String connect() {
    return database.connect();
  }
}
