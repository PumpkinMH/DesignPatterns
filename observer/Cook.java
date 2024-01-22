package observer;

import java.util.ArrayList;

public class Cook implements Subject {
  /**
   * ArrayList of all the Observers of this Cook
   */
  private ArrayList<Observer> observers;

  /**
   * String representation of the name
   */
  private String name;

  /**
   * Constructor for the Cook class
   * 
   * @param name String representation of the name
   */
  public Cook(String name) {
    this.name = name;
    observers = new ArrayList<Observer>();
  }

  /**
   * Registers the Observer object as an observer of this Cook
   * 
   * @param observer Observer that will be registered
   */
  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  /**
   * Removes the Observer object as an observer of this Cook, if applicable.
   * 
   * @param observer Observer that will be removed
   */
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  /**
   * Notifies all of the Observers that are registered by calling update() (called from
   * enterSighting)
   * 
   * @param location String representation of the location
   * @param description String representation of the description
   * @param accomplices ArrayList containing all of the String representations of the accomplices
   */
  public void notifyObservers(String location, String description, ArrayList<String> accomplices) {
    for (int i = 0; i < observers.size(); i++) {
      observers.get(i).update(location, description, accomplices);
    }
  }

  /**
   * Sends the sighting to the Observers by notifying the Observers. The Strings are converted into
   * an ArrayList by using comma separated values with spaces.
   * 
   * @param location String represenation of the location
   * @param description String representation of the description
   * @param accomplices String representation of the accomplices. Use a comma and a space to
   *        separate the accomplices
   */
  public void enterSighting(String location, String description, String accomplices) {
    String[] tempArray = accomplices.split(", ");
    ArrayList<String> tempList = new ArrayList<String>();
    for (String temp : tempArray) {
      tempList.add(temp);
    }
    notifyObservers(location, description, tempList);
  }

  /**
   * Returns the String representation of the Name
   * 
   * @return String representation of the Name
   */
  public String getName() {
    return name;
  }
}
