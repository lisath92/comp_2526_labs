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
        replaceStack(tempStack, this);
        System.out.println(displayResult);
    }

    /**
     * Private helper method for sorting the stack;
     */
    private void replaceStack(Stack tempStack, Stack sourceStack) {
        while (!tempStack.isEmpty()) {
            StackNode tempNode = tempStack.pop();
            sourceStack.push(tempNode.getData());
        }
    }

    /**
     * Sort the stack from min to large data
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
                if (tempData > tempStack.peek().getData()) {
                    tempStack.push(tempData);
                    sorted = true;
                } else {
                    Stack secondTempStack = new Stack();
                    do {
                        sortedInside = false;
                        StackNode popped = tempStack.pop();
                        if (tempData <= popped.getData()) {
                            secondTempStack.push(popped.getData());
                        }
                        
                        if (tempStack.isEmpty() || tempData > tempStack.peek().getData()) {
                            tempStack.push(tempData);
                            replaceStack(secondTempStack, tempStack);
                            sortedInside = true;
                        }
                    } while (!sortedInside);
                    sorted = true;
                }
            } while(!sorted);
        }
        replaceStack(tempStack, this);
    }

}