package driver;

import collection.*;

public class QueueDriver {
    public static void main(String[] args) {
        Queue newQueue = new Queue();
        newQueue.add(5);
        newQueue.add(3);
        newQueue.add(7);
        newQueue.add(4);
        newQueue.add(3);
        newQueue.add(11);
        newQueue.display();
        newQueue.remove();
        newQueue.remove();
        newQueue.display();
        newQueue.add(66);
        newQueue.display();
    }
}