package driver;

import data.*;
import collection.*;

public class StackDriver {
    public static void main(String[] args) {
        Stack newStack = new Stack();
        System.out.println("Is stack empty? " + newStack.isEmpty());
        newStack.push(5);
        newStack.push(3);
        newStack.push(7);
        newStack.push(4);
        newStack.push(3);
        newStack.push(11);
        newStack.display();

        //Pop the top one
        StackNode pop1 = newStack.pop();
        System.out.println("popped Stack: " + pop1.getData());

        //Pop the top one
        StackNode pop2 = newStack.pop();
        System.out.println("popped Stack: " + pop2.getData());

        newStack.display();
        StackNode peek1 = newStack.peek();
        System.out.println("peek top of stack " + peek1.getData());
        
        newStack.push(66);
        newStack.display();
        boolean stackEmpty = newStack.isEmpty();
        System.out.println("Is stack empty? " + stackEmpty);

        int smallestNum = newStack.min();
        System.out.println("Min of stack: " + smallestNum);

        newStack.sort();
        System.out.print("Stack sorted: ");
        newStack.display();

    }
}