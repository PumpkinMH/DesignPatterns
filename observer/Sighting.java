package observer;

import java.util.ArrayList;

public class Sighting {
  /**
   * String representation of the location in this sighting
   */
  private String location;

  /**
   * String representation of the details in this sighting
   */
  private String details;

  /**
   * ArrayList representation
   */
  private ArrayList<String> accomplices;

  /**
   * Constructor for this Sighting
   * 
   * @param location String representation of the location
   * @param details String representation of the details of this sighting
   * @param accomplices ArrayList of all the Strings
   */
  public Sighting(String location, String details, ArrayList<String> accomplices) {
    this.location = location;
    this.details = details;
    this.accomplices = accomplices;
  }

  /**
   * Returns the String representation of the Location
   * 
   * @return String representation of the Location
   */
  public String getLocation() {
    return location;
  }

  /**
   * Returns the String representation of the Details
   * 
   * @return String representation of the Details
   */
  public String getDetails() {
    return details;
  }

  /**
   * Returns the String representation of the Accomplices as a comma-separated list
   * 
   * @return String representation of the Accomplices
   */
  public String getAccomplices() {
    if (accomplices.size() == 0) {
      return null;
    } else {
      StringBuilder sb = new StringBuilder("");
      for (int i = 0; i < accomplices.size(); i++) {
        if (!accomplices.get(i).equals("")) {
          sb.append(accomplices.get(i));
        }
        if (i < accomplices.size() - 1) {
          sb.append(", ");
        }
      }
      return sb.toString();
    }
  }
}
