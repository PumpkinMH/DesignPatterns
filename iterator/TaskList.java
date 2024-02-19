package iterator;

public class TaskList {
  /**
   * List of tickets in this list
   */
  private Ticket[] tickets;

  /**
   * Number of tickets in this list
   */
  private int count;

  /**
   * String representation of the name of the list
   */
  private String name;
  
  /**
   * Initialzes all of the private members
   * @param name String representation of the name of the list
   */
  public TaskList(String name) {
    this.name = name;
    tickets = new Ticket[0];
    count = 0;
  }

  /**
   * Adds the ticket by calling the overloaded addTicket method with an object containing the parameters
   * @param name String representation of the name of the ticket
   * @param teamMember String representation of the name of the member
   * @param difficulty int representation of the difficulty of the ticket
   */
  public void addTicket(String name, String teamMember, int difficulty) {
    addTicket(new Ticket(name, teamMember, difficulty));
  }

  /**
   * Adds the ticket object to this TaskList and resizes tickets[] accordingly
   * @param ticket Ticket to be added to the list
   */
  public void addTicket(Ticket ticket) {
    if(count < tickets.length) {
      tickets[count++] = ticket;
    } else {
      Ticket[] tempTickets = new Ticket[tickets.length + 1];
      for(int i = 0; i < count; i++) {
        tempTickets[i] = tickets[i];
      }
      tickets = tempTickets;
      addTicket(ticket);
    }
  }

  /**
   * Returns the Ticket identified by the name String. If it doesn't exist, null will be returned
   * @param name String that will be used to identify the ticket, case insensitive
   * @return The Ticket, or null if it wasn't found
   */
  public Ticket getTicket(String name) {
    for(int i = 0; i < count; i++) {
      if(tickets[i].getName().equalsIgnoreCase(name)) {
        return tickets[i];
      }
    }
    return null;
  }

  /**
   * Creates a new iterator for this list
   * @return New iterator for the list
   */
  public TaskListIterator createIterator() {
    return new TaskListIterator(tickets);
  }

  /** 
   * Returns the String representation of the list, with each ticket on a new line
   * @return String representation of the list
   */
  public String toString() {
    String output = name;
    output += ":\n";

    for(int i = 0; i < count; i++) {
      output += tickets[i].toString();
      if(i < count - 1) {
        output += '\n';
      }
    }
    return output;
  }
}