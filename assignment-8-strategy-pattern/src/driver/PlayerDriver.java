package driver;

import data.*;

/**
 * PlayerDriver
 */
public class PlayerDriver {
  public static void main(String[] args) {
    Player p1 = new RunPlayer("Jane", "Smith");
    Player p2 = new WalkPlayer("John", "Doe");
    
    p1.performMovement();
    p2.performMovement();

    p1.performSwim();
    p2.performSwim();
  }
}