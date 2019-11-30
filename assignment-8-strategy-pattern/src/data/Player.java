package data;

/**
 * Player
 */
public class Player {
  private String firstName;
  private String lastName;
  private Movement movement;
  private SwimBehaviour swimBehaviour;

  public Player(String firstName, String lastName) {
    setFirstName(firstName);
    setLastName(lastName);
  }

  /**
   * @param firstName the firstName to set
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * @param lastName the lastName to set
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * @return the firstName
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * @return the lastName
   */
  public String getLastName() {
    return lastName;
  }

  public String fullName() {
    return firstName + " " + lastName;
  }

  /**
   * @param movement the movement to set
   */
  public void setMovement(Movement movement) {
    this.movement = movement;
  }

  /**
   * @param swimBehaviour the swimBehaviour to set
   */
  public void setSwimBehaviour(SwimBehaviour swimBehaviour) {
    this.swimBehaviour = swimBehaviour;
  }

  /**
   * Make player move
   */
  public void performMovement() {
    System.out.println(fullName() + " is " + movement.move());
  }

  public void performSwim() {
    System.out.println(fullName() + " " + swimBehaviour.swim());
  }
}