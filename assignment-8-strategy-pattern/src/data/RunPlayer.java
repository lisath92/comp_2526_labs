package data;

/**
 * Player that runs
 */
public class RunPlayer extends Player {
  public RunPlayer(String firstName, String lastName) {
    super(firstName, lastName);
    setMovement(new Run());;
    setSwimBehaviour(new Swim());
  }
}