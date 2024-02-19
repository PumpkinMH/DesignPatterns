package iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class TaskListIterator implements Iterator {
  /**
   * List of tickets that the iterator will iterate on
   */
  private Ticket[] tickets;
  
  /**
   * int representing the current position of this Iterator
   */
  private int position;

  /**
   * Initializes all of the private members of this Ticket
   * @param tickets List of tickets that will be iterated on
   */
  public TaskListIterator(Ticket[] tickets) {
    this.tickets = tickets;
    position = 0;

  }

  /**
   * Returns true or false based upon whether there are tickets left in this Iterator
   */
  public boolean hasNext() {
    return position < tickets.length && tickets[position] != null;
  }

  /**
   * Returns the next Ticket, or throws an exception if it doesn't exist
   * @return The next Ticket
   */
  public Ticket next() {
    if(hasNext()) {
      return tickets[position++];
    } else {
      throw new NoSuchElementException();
    }
  }
}
