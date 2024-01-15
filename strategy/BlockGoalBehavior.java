package strategy;

import java.util.Random;

public class BlockGoalBehavior implements DefenceBehavior, OffenceBehavior {

  /**
   * Chooses one of 4 plays randomly. "Hand blocks the puck", "catches the puck", "blocks puck with
   * knee pads", or "blocks puck with stick"
   *
   * @return String representing the play
   */
  public String play() {
    Random random = new Random();
    int choice = random.nextInt(4);

    switch (choice) {
      case 0:
        return "Hand blocks the puck";
      case 1:
        return "Catches the puck";
      case 2:
        return "Blocks puck with knee pads";
      case 3:
        return "Blocks puck with stick";
      default:
        return "This should never appear";
    }
  }

}
