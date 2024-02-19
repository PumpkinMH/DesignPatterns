package iterator;

public class SCRUMBoard {
  /**
   * String representing the name of the project / board
   */
  private String projectName;

  /**
   * Three lists necessary for a SCRUMBoard
   */
  private TaskList todo, doing, done;

  /**
   * Initializes all of the private members
   * @param projectName String representation of the name of the project / board
   */
  public SCRUMBoard(String projectName) {
    this.projectName = projectName;
    todo = new TaskList("ToDo");
    doing = new TaskList("Doing");
    done = new TaskList("Done");
  }

  /**
   * Adds a ticket to the ToDo list
   * @param name String representation of the name of the ticket
   * @param teamMember String representation of the name of the person who made the ticket
   * @param difficulty int representation of the difficulty of the ticket
   */
  public void addTicket(String name, String teamMember, int difficulty) {
    todo.addTicket(name, teamMember, difficulty);
  }

  /**
   * Moves a ticket from todo to doing
   * @param name Name of the ticket that will be moved, case insensitive
   * @return True if successful, false if not
   */
  public boolean startTicket(String name) {
    if(todo.getTicket(name) == null) {
      return false;
    } else {
      doing.addTicket(todo.getTicket(name));
      TaskListIterator todoIterator = todo.createIterator();
      TaskList newTodo = new TaskList("ToDo");
      while(todoIterator.hasNext()) {
        Ticket tempTicket = todoIterator.next();
        if(!tempTicket.getName().equalsIgnoreCase(name)) {
          newTodo.addTicket(tempTicket);
        }
      }
      todo = newTodo;
      return true;
    }
  }

  /**
   * Moves a ticket from doing to done
   * @param name Name of the ticket that will be moved, case insensitive
   * @return True if succesful, false if not
   */
  public boolean finishTicket(String name) {
    if(doing.getTicket(name) == null) {
      return false;
    } else {
      done.addTicket(doing.getTicket(name));
      TaskListIterator doingIterator = doing.createIterator();
      TaskList newDoing = new TaskList("Doing");
      while(doingIterator.hasNext()) {
        Ticket tempTicket = doingIterator.next();
        if(!tempTicket.getName().equalsIgnoreCase(name)) {
          newDoing.addTicket(tempTicket);
        }
      }
      doing = newDoing;
      return true;
    }
  }

  /**
   * Returns the String represntation of this board with the name, and three lists all separated by newLines
   */
  public String toString() {
    String output = "*****";
    output += projectName;
    output += "*****\n";

    output += todo.toString();
    output += "\n\n";

    output += doing.toString();
    output += "\n\n";

    output += done.toString();
    return output;
  }
}
