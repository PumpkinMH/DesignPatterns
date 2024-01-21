package observer;

import java.util.ArrayList;

public class Police implements Observer {
    private Subject cook;
    private ArrayList<String> locations;
    private String notes;
    private ArrayList<String> people;

    public Police(Subject cook) {
        this.cook = cook;
        locations = new ArrayList<String>();
        people = new ArrayList<String>();
        notes = "";
    }

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
                sb.append('\n');
            }
        }

        return sb.toString();
    }
    
}
