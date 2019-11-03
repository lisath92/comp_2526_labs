package collection;

import data.Node;

public class Tree {
  public Node root;

  static final int COUNT = 5;

  /**
   * Default constructor
   */
  public Tree() {

  }

  /**
   * insert node
   */
  public void insert(int d) {
    Node newNode = new Node(d);
    if (root == null) {
      root = newNode;
    } else {
      root.insert(d);
    }
  }

  /**
   * helper to print tree from right to left
   */
  public void inOrderHelper(Node root, int spaces) {
    String finalString = "";
    if (root == null) {
      return;
    }
    spaces += COUNT;
    inOrderHelper(root.getRightChild(), spaces);
    finalString = finalString + root.toString(spaces);
    System.out.println(finalString);
    inOrderHelper(root.getLeftChild(), spaces);
  }

  /**
   * Print binary tree
   */
  public void inOrder() {
    inOrderHelper(root, 0);
  }
}