package observer;

import java.util.ArrayList;

public class Sighting {
    private String location;
    private String details;
    private ArrayList<String> accomplices;

    public Sighting(String location, String details, ArrayList<String> accomplices) {
        this.location = location;
        this.details = details;
        this.accomplices = accomplices;
    }

    public String getLocation() {
        return location;
    }

    public String getDetails() {
        return details;
    }

    public String getAccomplices() {
        if(accomplices.size() == 0) {
            return null;
        } else {
            StringBuilder sb = new StringBuilder("");
            for(int i = 0; i < accomplices.size(); i++) {
                if(!accomplices.get(i).equals("")) {
                    sb.append(accomplices.get(i));
                }
                if(i < accomplices.size() - 1) {
                    sb.append(", ");
                }
            }
            return sb.toString();
        }
    }
}
