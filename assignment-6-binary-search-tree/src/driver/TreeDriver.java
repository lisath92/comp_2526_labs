package driver;

import collection.*;

public class TreeDriver {
  public static void main(String[] args) {
    Tree tree = new Tree();
    tree.insert(8);
    tree.insert(10);
    tree.insert(9);
    tree.insert(12);
    tree.insert(5);
    tree.insert(6);
    tree.insert(3);
    tree.inOrder();
  }
}
