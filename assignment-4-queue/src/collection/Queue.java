package collection;

import data.*;
import java.util.NoSuchElementException;

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
        QueueNode newItem = new QueueNode(d);
        if (last != null) {
            last.setNext(newItem);
        }
        if (first == null) {
            first = newItem;
        }
        last = newItem;
    }

    public boolean isEmpty() {
        return (first ==null && last == null);
    }

    /**
     * remove the first item
     * @return first item in the queue
     */
    public QueueNode remove() throws NoSuchElementException {
        QueueNode resultNode = first;
        if (resultNode != null) {
            first = first.getNext();
            if (first == null) {
                last = null;
            }
            return resultNode;
        } else {
            throw new NoSuchElementException();
        }
    }

    /**
     * Look at the first item of the queue
     * @return first of the queue
     */
    public QueueNode peekFirst() {
        return first;
    }

    /**
     * Look at the last item of the queue
     * @return last of the queue
     */
    public QueueNode peekLast() {
        return last;
    }

    /**
     * Helper method for replacing original queue
     */
    private void replaceQueue(Queue tempQueue, Queue sourceQueue) {
        while (!tempQueue.isEmpty()) {
            QueueNode tempNode = tempQueue.remove();
            sourceQueue.add(tempNode.getData());
        }
    }
    /**
     * Display the queue
     */
    public void display() {
        StringBuilder displayString = new StringBuilder("");
        Queue tempQueue = new Queue();
        while (!isEmpty()) {
            QueueNode tempNode = this.remove();
            tempQueue.add(tempNode.getData());
            displayString.insert(0, tempNode.getData());
            if (tempNode.getNext() != null) {
                displayString.insert(0, "->");
            }
        }
        replaceQueue(tempQueue, this);
        System.out.println(displayString);
    }
}