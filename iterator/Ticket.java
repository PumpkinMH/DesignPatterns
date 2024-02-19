package iterator;

public class Ticket {
  /**
   * String representing the name of the Ticket
   */
  private String name;

  /**
   * String representing the name of the person who made it
   */
  private String teamMember;
  
  /**
   * int representing the difficulty of this ticket
   */
  private int difficulty;

  /**
   * Initializes all of the private members of this Ticket
   * @param name String representing the name of the Ticket
   * @param teamMember String representing the name of the person who made it
   * @param difficulty int representing the difficulty of this ticket
   */
  public Ticket(String name, String teamMember, int difficulty) {
    this.name = name;
    this.teamMember = teamMember;
    this.difficulty = difficulty;
  }

  /**
   * Returns the String representation of the name of this Ticket
   * @return String representation of the name of this Ticket
   */
  public String getName() {
    return name;
  }

  /**
   * Returns the String representation of this Ticket
   * @return String representation of this Ticket
   */
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
