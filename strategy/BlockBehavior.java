package strategy;

import java.util.Random;

public class BlockBehavior implements DefenceBehavior {

  /**
   * Chooses one of three plays randomly. "Blocks player from passing", "blocks player from
   * shooting", or "checks player with puck"
   *
   * @return String describing the play
   */
  public String play() {
    Random random = new Random();
    int choice = random.nextInt(3);

    switch (choice) {
      case 0:
        return "Blocks player from passing";
      case 1:
        return "Blocks player from shooting";
      case 2:
        return "Checks player with puck";
      default:
        return "This should never appear";
    }
  }
}
