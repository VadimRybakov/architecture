package ru.geekbrains.patterns.builder;

public final class UserDto {

  private final Long id;
  private final String login;
  private final String password;
  private final String address;
  private final String email;
  private final String phone;

  public static class Builder {
    private Long id;
    private String login;
    private String password;
    private String address;
    private String email;
    private String phone;

    public Builder id(Long id) {
      this.id = id;
      return this;
    }

    public Builder login(String login) {
      this.login = login;
      return this;
    }

    public Builder password(String password) {
      this.password = password;
      return this;
    }

    public Builder address(String address) {
      this.address = address;
      return this;
    }

    public Builder email(String email) {
      this.email = email;
      return this;
    }

    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    public UserDto build() {
      return new UserDto(this);
    }
  }

  public UserDto(Builder builder) {
    id = builder.id;
    login = builder.login;
    password = builder.password;
    address = builder.address;
    email = builder.email;
    phone = builder.phone;
  }

  // only for tests
  public Long getId() {
    return id;
  }

  public String getLogin() {
    return login;
  }

  public String getPassword() {
    return password;
  }

  public String getAddress() {
    return address;
  }

  public String getEmail() {
    return email;
  }

  public String getPhone() {
    return phone;
  }
}
