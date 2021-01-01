package ru.geekbrains.patterns.prototype;

public class Palm extends Tree {
  public int leaves;

  public Palm() {}

  public Palm(Palm target) {
    super(target);
    this.leaves = target.leaves;
  }

  @Override
  public Tree clone() {
    return new Palm(this);
  }

  @Override
  public boolean equals(Object obj) {
    if(!(obj instanceof Palm)) return false;
    Palm anotherPalm = (Palm) obj;
    return anotherPalm.leaves == leaves;
  }
}
