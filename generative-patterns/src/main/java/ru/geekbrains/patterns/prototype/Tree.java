package ru.geekbrains.patterns.prototype;

public abstract class Tree {
  public int mass;
  public int height;

  public Tree() {}

  public Tree(Tree target) {
    if(target != null) {
      this.mass = target.mass;
      this.height = target.height;
    } else throw new RuntimeException("Target is null");
  }

  public abstract Tree clone();

  @Override
  public boolean equals(Object obj) {
    if(!(obj instanceof Tree)) return false;
    Tree anotherTree = (Tree) obj;
    return anotherTree.mass == mass
        && anotherTree.height == height;
  }
}
