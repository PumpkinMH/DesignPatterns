package strategy;

public class Defenceman extends Player {

  /**
   * Constructor for the defenceman that takes a first and last name.
   *
   * @param firstName String for the first name
   * @param lastName  String for the last name
   */
  public Defenceman(String firstName, String lastName) {
    super(firstName, lastName);
  }

  /**
   * Sets the offence behavior. 90% chance of it being PassBehavior, 10% chance of SlapShotBehavior
   */
  public void setOffenceBehavior() {
    int choice = rand.nextInt(10);
    if (choice == 0) {
      offenceBehavior = new SlapShotBehavior();
    } else {
      offenceBehavior = new PassBehavior();
    }
  }

  /**
   * Sets the defence behavior Randomly chooses ChasePuckBehavior or BlockBehavior
   */
  public void setDefenceBehavior() {
    int choice = rand.nextInt(2);
    switch (choice) {
      case 0:
        defenceBehavior = new ChasePuckBehavior();
        break;
      case 1:
        defenceBehavior = new BlockBehavior();
        break;
    }
  }

  /**
   * Describes what position is played
   *
   * @return String describing the position being played
   */
  public String toString() {
    String output = super.toString() + " plays the position: Defenceman";
    return output;
  }

}
