package decorator;

public class Warrior extends Player {
  /**
   * Uses the lines from a text file to create a Player representing a Warrior
   * @param name
   */
  public Warrior(String name) {
    super(FileReader.getLines("decorator/warrior.txt"), name);
  }  
}
