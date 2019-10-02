package data;

public class QueueNode {
    private int data;
    private QueueNode next;
   
    /**
     * Default constructor
     */
    public QueueNode() {
        
    }

    /**
     * Constructor
     */
    public QueueNode(int d) {
        setData(d);
    }

    /**
     * Set data of the QueueNode
     * @param d as an int
     */
    public void setData(int d) {
        this.data = d;
    }

    /**
     * @param QueueNode next node
     */
    public void setNext(QueueNode nextNode) {
        this.next = nextNode;
    }

    /**
     * @return int data
     */
    public int getData(){
        return this.data;
    }

    /**
     * get the next QueueNode
     * @return the next QueueNode
     */
    public QueueNode getNext() {
        return this.next;
    }
} 