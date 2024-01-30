package decorator;

import java.util.ArrayList;

public abstract class Player {
  protected String name;
  protected ArrayList<String> lines;

  public Player(ArrayList<String> lines, String name) {
    this.name = name;
    this.lines = lines;
  }

  public String getName() {
    return name;
  }

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
