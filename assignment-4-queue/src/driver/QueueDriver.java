package driver;

import collection.*;
import data.*;

public class QueueDriver {
    public static void main(String[] args) {
        Queue newQueue = new Queue();
        newQueue.add(11);
        newQueue.add(3);
        newQueue.add(4);
        newQueue.add(7);
        newQueue.add(3);
        newQueue.add(5);
        newQueue.display();

        System.out.println("Remove first two nodes");
        newQueue.remove();
        newQueue.remove();
        newQueue.display();

        QueueNode firstNode = newQueue.peekFirst();
        QueueNode lastNode = newQueue.peekLast();
        System.out.println("The first item of the queue: " + firstNode.getData());
        System.out.println("The last item of the queue: " + lastNode.getData());
        
        System.out.println("Add 66");
        newQueue.add(66);
        newQueue.display();
    }
}