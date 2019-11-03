public class Driver {
    public static void main(String args[])
    {
        Tree tree = new Tree();
        Node root = new Node(8);
        System.out.println("Building tree with root value " + root.data);
        tree.add(root, 8);
        tree.add(root, 4);
        tree.add(root, 13);
        tree.add(root, 1);
        tree.add(root, 6);
        tree.add(root, 14);
        tree.add(root, 7);
        tree.add(root, 3);
        tree.add(root, 10);
        System.out.println("Tree in order");
        tree.inOrder(root);

    }
}
