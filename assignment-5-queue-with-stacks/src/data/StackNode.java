package data;

public class StackNode {
    private int data;
    private StackNode next;
    private int min;

    /**
     * default constructor
     */
    public StackNode() {

    }

    /**
     * 
     */
    public StackNode(int d) {
        setData(d);
    }

    /**
     * @param int d, set data
     */
    public void setData(int d) {
        this.data = d;
    }

    /**
     * Set next stack node
     * @param StackNode next
     */
    public void setNext(StackNode nextNode) {
        this.next = nextNode;
    }

    public void setMin(int min) {
        if (min < this.min) {
            this.min = min;
        }
    }

    public int getMin() {
        return min;
    }

    public int getData() {
        return this.data;
    }

    public StackNode getNext() {
        return this.next;
    }
}