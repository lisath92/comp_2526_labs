package data;

/**
 * Implement cannot swim behaviour
 */
public class NoSwim implements SwimBehaviour {
  public String swim() {
    return "cannot swim!";
  }
}