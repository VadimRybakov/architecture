package ru.geekbrains.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Directory implements Data {

  private List<Data> data = new ArrayList<>();

  @Override
  public String info() {
    List<String> strings = new ArrayList<>();
    for (Data d : data) {
      strings.add(d.info());
    }
    return String.join(", ", strings);
  }

  public Data add(Data... data) {
    this.data.addAll(Arrays.asList(data));
    return this;
  }
}
