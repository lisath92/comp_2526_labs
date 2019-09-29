package data;

public class Node {
    private int data;
    private Node next;

    /**
     * Default constructor
     */
    public Node() {

    }

    /**
     * @param data
     *      integer stored in node
     */
    public Node(int d) {
        setData(d);
    }

    /**
     * get next node
     * @return Node
     */
    public Node getNext() {
        return this.next;
    }

    /**
     * get data
     * @return int data
     */
    public int getData() {
        return this.data;
    }

    /**
     * set following node
     * @param Node nextNode
     */
    public void setNext(Node nextNode) {
        this.next = nextNode;
    }

    /**
     * set data of node
     * @param int data
     */
    public void setData(int data) {
        this.data = data;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
	public String toString() {
        String stringData = "";
        if (this.next != null) {
            stringData += data + "->";
        } else {
            stringData += data;
        }
		return stringData;
	}

}