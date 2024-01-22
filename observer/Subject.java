package observer;

import java.util.ArrayList;

public interface Subject {
  /**
   * Registers the Observer object as an observer of this object
   * 
   * @param observer Observer object that will be registered
   */
  void registerObserver(Observer observer);

  /**
   * Removes the Observer object as an observer of this object
   * 
   * @param observer Observer object that will be removed if it exists
   */
  void removeObserver(Observer observer);

  /**
   * Notifies all of the registered observers with a location, description, and accomplices
   * 
   * @param location String representation of the location
   * @param description String representation of the description
   * @param accomplices ArrayList representation of the people in this specific notification
   */
  void notifyObservers(String location, String description, ArrayList<String> accomplices);
}
