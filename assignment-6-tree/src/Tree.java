public class Tree{
    Node root;
    public void add(Node root, int data) {
        if (data < root.data) {
            if (root.left != null) {
                add(root.left, data);
            } else {
                System.out.println("Added " + data + " to left of " + root.data);
                root.left = new Node(data);
            }
        } else if (data > root.data) {
            if (root.right != null) {
                add(root.right, data);
            } else {
                System.out.println("   Added " + data + " to right of "
                        + root.data);
                root.right = new Node(data);
            }
        }
    }

    public void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(" " + node.data);
            inOrder(node.right);
        }
    }

}