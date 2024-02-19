package iterator;

public class TaskList {
  private Ticket[] tickets;
  private int count;
  private String name;
  
  public TaskList(String name) {
    this.name = name;
    tickets = new Ticket[0];
    count = 0;
  }

  public void addTicket(String name, String teamMember, int difficulty) {
    addTicket(new Ticket(name, teamMember, difficulty));
  }

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

  public Ticket getTicket(String name) {
    for(int i = 0; i < count; i++) {
      if(tickets[i].getName().equalsIgnoreCase(name)) {
        return tickets[i];
      }
    }
    return null;
  }

  public TaskListIterator createIterator() {
    return new TaskListIterator(tickets);
  }

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