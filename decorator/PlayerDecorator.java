package decorator;

import java.util.ArrayList;

public abstract class PlayerDecorator extends Player {
  private Player player;

  public PlayerDecorator(Player player) {
    super(player.lines, player.name);
    this.player = player;
  }

  protected void integrateDecor(ArrayList<String> decor) {
    ArrayList<String> temp = new ArrayList<String>();
    ArrayList<String> biggest, smallest;
    if(lines.size() > decor.size()) {
      biggest = lines;
      smallest = decor;
    } else {
      biggest = decor;
      smallest = lines;
    }

    for(int i = 0; i < biggest.size(); i++) {
      if(i < smallest.size()) {
        StringBuilder sb = new StringBuilder("");
        String biggestLine, smallestLine;

        if(biggest.get(i).length() > smallest.get(i).length()) {
          biggestLine = biggest.get(i);
          smallestLine = smallest.get(i);
        } else {
          biggestLine = smallest.get(i);
          smallestLine = biggest.get(i);
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
        temp.add(biggest.get(i));
      }
    }
    lines = temp;
  }
  
}
