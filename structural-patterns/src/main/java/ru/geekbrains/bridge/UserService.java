package ru.geekbrains.bridge;

public class UserService extends Service{

  public UserService(Database database) {
    super(database);
  }

  public String connect() {
    return database.connect();
  }
}
