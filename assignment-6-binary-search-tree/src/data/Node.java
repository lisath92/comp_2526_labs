package data;

public class Node {
    private int data = 0;
    private Node left, right;

    /**
     * default constructor
     */
    public Node() {

    }

    /**
     * Constructor
     * @param int d
     */
    public Node(int d) {
        setData(d);
    }

    /**
     * @param int d, set data
     */
    public void setData(int d) {
        data = d;
    }

    /**
     * Insert data at the correct level
     * @param int
     */
    public void insert(int d) {
      if (d >= data) {
        if (right == null) {
          right = new Node(d);
        } else {
          right.insert(d);
        }
      } else {
        if (left == null) {
          left = new Node(d);
        } else {
          left.insert(d);
        }
      }
    }

    /**
     * @return int data
     */
    public int getData() {
        return this.data;
    }

    /**
     * @return Node left
     */
    public Node getLeftChild() {
        return this.left;
    }
    
    /**
     * @return Node right
     */
    public Node getRightChild() {
      return this.right;
    }

    public String toString(int spaces) {
      String totalSpaces= "\n";
      for (int i = 0; i <= spaces; i++) {
        totalSpaces = totalSpaces + " ";
      }
      return totalSpaces + data;
    }
}