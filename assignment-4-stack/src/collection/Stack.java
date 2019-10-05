package collection;

import data.*;
import java.util.EmptyStackException;

public class Stack {
    private StackNode top;
    private int min;

    /**
     * Default constructor
     */
    public Stack() {
        
    }

    /**
     * Pop the top item
     * @return top stack node
     */
    public StackNode pop() {
        StackNode resultNode = this.top;
        if (resultNode != null) {
            this.top = top.getNext();
            return resultNode;
        } else {
            throw new EmptyStackException();
        }
    }

    /**
     * Push the latest item to the top
     */
    public void push(int d) {
        StackNode newItem = new StackNode(d);
        if (this.top != null) {
            newItem.setNext(this.top);
        }
        setMin(d);
        this.top = newItem;
    }

    /**
     * @return top item of the stack
     */
    public StackNode peek() {
        return this.top;
    }

    /**
     * @return true if stack is empty
     */
    public boolean isEmpty() {
        if (this.top != null) {
            return false;
        }
        return true;
    }
    
    /**
     * Set the smallest number of the stack
     * @param d
     */
    public void setMin(int d) {
        if (this.top == null || d < this.min) {
            this.min = d;
        }
    }

    /**
     * Find the minimum num of the stack
     * @return
     */
    public int min() {
        return this.min;
    }
    /**
     * Display the entire stack
     */
    public void display() {
        String displayResult = "";
        Stack tempStack = new Stack();
        while (!isEmpty()) {
            StackNode tempNode = this.pop();
            tempStack.push(tempNode.getData());
            displayResult += tempNode.getData();
            if (tempNode.getNext() != null) {
                displayResult += "->";
            }
        }
        while (!tempStack.isEmpty()) {
            StackNode tempNode = tempStack.pop();
            this.push(tempNode.getData());
        }
        System.out.println(displayResult);
    }

    public void sort() {
        boolean sorted;
        boolean sortedInside;
        Stack tempStack = new Stack();
        while (!isEmpty()) {
            do {
                StackNode tempNode = this.pop();
                int tempData = tempNode.getData();
                sorted = false;
                if (tempStack.isEmpty()) {
                    tempStack.push(tempData);
                    sorted = true;
                    continue;
                }
                if (tempData <= tempStack.peek().getData()) {
                    tempStack.push(tempData);
                    sorted = true;
                } else {
                    do {
                        sortedInside = false;
                        int counter = 0;
                        StackNode popped = tempStack.pop();
                        if (tempData > popped.getData()) {
                            this.push(popped.getData());
                            counter++;
                        }
                        
                        if (tempData <= tempStack.peek().getData()) {
                            tempStack.push(tempData);
                            sortedInside = true;
                            for (int i=0; i < counter; i++) {
                                StackNode tempPopped = this.pop();
                                tempStack.push(tempPopped.getData());
                            }
                        }
                    } while (!sortedInside);
                }
            } while(!sorted);
        }
        tempStack.display();
    }

}