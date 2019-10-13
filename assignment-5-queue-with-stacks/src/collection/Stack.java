package collection;

import data.*;
import java.util.EmptyStackException;

public class Stack {
    private StackNode top;

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
        newItem.setMin(d);
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
     * Find the minimum num of the stack
     * @return
     */
    public int min() {

        return this.peek().getMin();
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
        reverseStack(tempStack, this);
        System.out.println(displayResult);
    }
    
    /**
     * helper method for replacing the original stack
     */
    public void reverseStack(Stack tempStack, Stack sourceStack) {
        while (!tempStack.isEmpty()) {
            StackNode tempNode = tempStack.pop();
            sourceStack.push(tempNode.getData());
        }
    }
    
    /**
     * Sort the stack from min to max
     */
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
                if (tempData >= tempStack.peek().getData()) {
                    tempStack.push(tempData);
                    sorted = true;
                } else {
                    do {
                        sortedInside = false;
                        int counter = 0;
                        StackNode popped = tempStack.pop();
                        if (tempData < popped.getData()) {
                            this.push(popped.getData());
                            counter++;
                        }
                        
                        if (tempStack.isEmpty() || tempData >= tempStack.peek().getData()) {
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
        reverseStack(tempStack, this);
    }

}