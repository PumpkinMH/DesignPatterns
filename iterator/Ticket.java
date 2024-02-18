package iterator;

public class Ticket {
  private String name;
  private String teamMember;
  private int difficulty;

  public Ticket(String name, String teamMember, int difficulty) {
    this.name = name;
    this.teamMember = teamMember;
    this.difficulty = difficulty;
  }

  public String getName() {
    return name;
  }

  public String toString() {
    String output = "- ";
    output += name;
    output += "(";
    output += difficulty;
    output += ") - ";
    output += teamMember;
    return output;
  }
  
}
