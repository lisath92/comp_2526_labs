package collection;

import data.*;
import java.util.EmptyStackException;;

public class Queue {
    private Stack primary;
    private Stack temp;

    /**
     * public constructor
     */
    public Queue() {
        this.primary = new Stack();
        this.temp = new Stack();
    }

    /**
     * Add new StackNode to end of list
     * @param d
     */
    public void add(int d) {
        if (primary != null) {
            primary.reverseStack(primary, temp);
        }
        temp.push(d);
        primary.reverseStack(temp, primary);
    }

    /**
     * Remove the first item of the queue
     * @return StackNode
     */
    public StackNode remove() {
       try {
            StackNode resultNode = primary.pop();
            return resultNode;
       } catch (EmptyStackException e) {
           System.out.println("the stack is empty");
           throw e;
       }
    }
    
    /**
     * Return true if queue is empty
     * @return boolean
     */
    public boolean isEmpty() {
        if (primary == null) {
            return false;
        }
        return true;
    }

    /**
     * Return primary item of the queue without removing it
     * @return StackNode
     */
    public StackNode peek() {
        return primary.peek();
    }

    /**
     * Displays the queue
     */
    public void display() {
        primary.reverseStack(primary, temp);
        temp.display();
        primary.reverseStack(temp, primary);
    }
}