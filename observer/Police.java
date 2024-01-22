package observer;

import java.util.ArrayList;

public class Police implements Observer {
    /**
     * Subject that will be observed by this object
     */
    private Subject cook;

    /**
     * ArrayList of all the locations that were seen
     */
    private ArrayList<String> locations;

    /**
     * String representing the notes. Each note is stored on it's own separate line
     */
    private String notes;

    /**
     * ArrayList storing every person that was seen
     */
    private ArrayList<String> people;

    /**
     * Constructor that initializes all of the members
     * @param cook The subject that will be monitored
     */
    public Police(Subject cook) {
        this.cook = cook;
        this.cook.registerObserver(this);
        locations = new ArrayList<String>();
        people = new ArrayList<String>();
        notes = "";
    }

    /**
     * Called by the subject. 
     * Stores each location, description, and accomplices in their respective places with no repeats
     * @param location String representation of the location
     * @param description String representation of the description
     * @param accomplices ArrayList of all the accomplices spotted in this update
     */
    public void update(String location, String description, ArrayList<String> accomplices) {
        if(location != null && !location.equals("") && !locations.contains(location)) {
            locations.add(location);
        }
        
        String[] tempNotes = notes.split("\n");
        boolean isAvailable;
        if(description == null || description.equals("")) {
            isAvailable = false;
        } else {
            isAvailable = true;
        }
        for(int i = 0; i < tempNotes.length && isAvailable; i++) {
            if(tempNotes[i].equals(description)) {
                isAvailable = false;
            }
        }
        if(isAvailable) {
            notes += description;
            notes += '\n';
        }
        
        if(accomplices != null) {
            String[] tempAccomplices = new String[accomplices.size()];
            tempAccomplices = accomplices.toArray(tempAccomplices);
            for(String temp : tempAccomplices) {
                if(!people.contains(temp) && !temp.equals("")) {
                    people.add(temp);
                }
        }
        }
        
    }

    /**
     * Returns a log that shows every single location, note, and accomplice.
     * All are grouped into their respective category with no repeats.
     * @return String representation of the log
     */
    public String getLog() {
        StringBuilder sb = new StringBuilder("");
        sb.append("Locations:\n");
        if(locations.isEmpty()) {
            sb.append("None\n");
        } else {
            for(int i = 0; i < locations.size(); i++) {
                sb.append("- ");
                sb.append(locations.get(i));
                sb.append('\n');
            }
        }
        sb.append('\n');

        sb.append("Notes:\n");
        if(notes.isEmpty()) {
            sb.append("None\n");
        } else {
            String[] tempNotes = notes.split("\n");
            for(String temp : tempNotes) {
                if(!temp.equals("")) {
                    sb.append("- ");
                    sb.append(temp);
                    sb.append('\n');
                }
            }
        }
        sb.append('\n');

        sb.append("Accomplices\n");
        if(people.isEmpty()) {
            sb.append("None\n");
        } else {
            for(int i = 0; i < people.size(); i++) {
                sb.append("- ");
                sb.append(people.get(i));
                if(i < people.size() - 1) {
                    sb.append('\n');
                }
            }
        }

        return sb.toString();
    }
    
}
