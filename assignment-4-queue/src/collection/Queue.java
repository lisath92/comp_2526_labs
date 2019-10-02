package collection;

import data.*;

public class Queue {
    private QueueNode first;
    private QueueNode last;

    /**
     * Default constructor
     */
    public Queue() {

    }

    /**
     * Add to the end of the queue
     * @param d
     */
    public void add(int d) {
        QueueNode newItem = QueueNode(d);
        if (first != null) {
            first.setNext(newItem);
        }
        if (first == null) {
            first = newItem;
        }
        last = newItem;
    }

    public boolean isEmpty() {
        if (first == null && last == null) {
            return true;
        }
        return false;
    }

    /**
     * remove the first item
     * @return first item in the queue
     */
    public QueueNode remove() {
        if (first != null) {
            QueueNode resultNode = first;
            first = first.getNext();
            return resultNode;
        } else {
            throw new NoSuchElementException();
        }
    }

    /**
     * Look at the first item of the queue
     * @return first of the queue
     */
    public QueueNode peek() {
        return first;
    }

    public void display() {
        String displayString = "";
        Queue tempQueue = new Queue();
        while (!this.isEmpty()) {
            QueueNode tempNode = this.pop();
            
        }
    }
}