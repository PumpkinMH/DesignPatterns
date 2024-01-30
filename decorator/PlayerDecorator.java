package decorator;

import java.util.ArrayList;

public abstract class PlayerDecorator extends Player {
  /**
   * Player representing the Player that will be decorated
   */
  private Player player;

  /**
   * Constructor for PlayerDecorator
   * @param player Player representing the Player that will be decorated
   */
  public PlayerDecorator(Player player) {
    super(player.lines, player.name);
    this.player = player;
  }

  /**
   * Overwrites the lines of the Player with the lines of the decor when appropriate. 
   * If the character in the decor is not a blank space, it will overwrite the respective character in the Player
   * @param decor ArrayList of Strings representing the lines of the decorator.
   */
  protected void integrateDecor(ArrayList<String> decor) {
    ArrayList<String> temp = new ArrayList<String>();
    ArrayList<String> biggestArray, smallestArray;
    if(lines.size() > decor.size()) {
      biggestArray = lines;
      smallestArray = decor;
    } else {
      biggestArray = decor;
      smallestArray = lines;
    }

    for(int i = 0; i < biggestArray.size(); i++) {
      if(i < smallestArray.size()) {
        StringBuilder sb = new StringBuilder("");
        String biggestLine, smallestLine;

        if(biggestArray.get(i).length() > smallestArray.get(i).length()) {
          biggestLine = biggestArray.get(i);
          smallestLine = smallestArray.get(i);
        } else {
          biggestLine = smallestArray.get(i);
          smallestLine = biggestArray.get(i);
        }

        for(int j = 0; j < biggestLine.length(); j++) {
          if(j < smallestLine.length()) {
            if(decor.get(i).charAt(j) == ' ') {
              sb.append(lines.get(i).charAt(j));
            } else {
              sb.append(decor.get(i).charAt(j));
            }
          } else {
            sb.append(biggestLine.charAt(j));
          }
        }
        temp.add(sb.toString());
      } else {
        temp.add(biggestArray.get(i));
      }
    }
    lines = temp;
  }
}
