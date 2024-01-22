package observer;

import java.util.ArrayList;

public interface Observer {
  /**
   * Called by a Subject when notifyObservers is called
   * 
   * @param location String representing the location
   * @param description String representing the description
   * @param accomplices ArrayList representing the accomplices in this update
   */
  void update(String location, String description, ArrayList<String> accomplices);

  /**
   * Returns a String representing all of the locations, descriptions, and accomplices that are seen
   * 
   * @return String representation of the log of everything
   */
  String getLog();
}
