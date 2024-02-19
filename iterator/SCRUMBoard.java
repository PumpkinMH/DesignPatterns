package iterator;

public class SCRUMBoard {
  private String projectName;
  private TaskList todo, doing, done;

  public SCRUMBoard(String projectName) {
    this.projectName = projectName;
    todo = new TaskList("ToDo");
    doing = new TaskList("Doing");
    done = new TaskList("Done");
  }

  public void addTicket(String name, String teamMember, int difficulty) {
    todo.addTicket(name, teamMember, difficulty);
  }

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
