package iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class TaskListIterator implements Iterator {
  private Ticket[] tickets;
  private int position;

  public TaskListIterator(Ticket[] tickets) {
    this.tickets = tickets;
    position = 0;

  }

  public boolean hasNext() {
    return position < tickets.length - 1;
  }

  public Ticket next() {
    if(hasNext()) {
      return tickets[position++];
    } else {
      throw new NoSuchElementException();
    }
  }
}
