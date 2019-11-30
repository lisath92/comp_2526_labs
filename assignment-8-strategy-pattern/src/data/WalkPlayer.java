package data;

/**
 * Player that walks
 */
public class WalkPlayer extends Player {

  public WalkPlayer(String firstName, String lastName) {
    super(firstName, lastName);
    setMovement(new Walk());
    setSwimBehaviour(new NoSwim());
  }
}