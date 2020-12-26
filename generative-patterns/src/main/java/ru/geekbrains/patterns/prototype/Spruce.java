package ru.geekbrains.patterns.prototype;

public class Spruce extends Tree{
  private int branches;

  public Spruce() {}

  public Spruce(Spruce target) {
    super(target);
    this.branches = target.branches;
  }

  @Override
  public Tree clone() {
    return new Spruce(this);
  }

  @Override
  public boolean equals(Object obj) {
    if(!(obj instanceof Spruce)) return false;
    Spruce anotherSpruce = (Spruce) obj;
    return anotherSpruce.branches == branches;
  }
}
