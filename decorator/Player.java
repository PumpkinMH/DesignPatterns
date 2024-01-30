package decorator;

import java.util.ArrayList;

public abstract class Player {
  /**
   * String representing the desired name for this Player
   */
  protected String name;

  /**
   * ArrayList holding Strings that represent each line of this Player
   */
  protected ArrayList<String> lines;

  /**
   * Constructor for the Player class
   * @param lines ArrayList of Strings that each represent a specific line of this Player
   * @param name String representing the name of this Player
   */
  public Player(ArrayList<String> lines, String name) {
    this.name = name;
    this.lines = lines;
  }

  /**
   * Returns the String representation of this Player's name
   * @return String representing the name
   */
  public String getName() {
    return name;
  }

  /**
   * Returns the lines of this Player formatted neatly into one String. 
   * Each element of the ArrayList is added one-by-one with a newline character between them
   * @return String representing the lines
   */
  public String toString() {
    StringBuilder sb = new StringBuilder("");
    for(int i = 0; i < lines.size(); i++) {
      sb.append(lines.get(i));
      if(i < lines.size() - 1) {
        sb.append("\n");
      }
    }
    return sb.toString();
  }
}
