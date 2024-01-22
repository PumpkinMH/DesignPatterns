package observer;

import java.util.ArrayList;

public class Cartel implements Observer {
    /**
     * The Subject that will be monitoed
     */
    private Subject cook;

    /**
     * ArrayList of all the Sightings. 
     * A sighting is the location, notes, and accomplices all in one object.
     */
    private ArrayList<Sighting> sightings;

    /**
     * Constructor for Cartel
     * @param cook The Subject that will be monitored
     */
    public Cartel(Subject cook) {
        this.cook = cook;
        this.cook.registerObserver(this);
        sightings = new ArrayList<Sighting>();
    }

    /**
     * Called by the Subject. 
     * Creates a new sighting with all of the parameters stored in it. Repeats are allowed.
     * @param location String representation of the location
     * @param details String representation of the details
     * @param accomplices ArrayList of all of the people as Strings in this particular update
     */
    public void update(String location, String details, ArrayList<String> accomplices) {
        Sighting tempSighting = new Sighting(location, details, accomplices);
        sightings.add(tempSighting);
    }

    /**
     * Returns a log of all of the sightings. Each sighting has its own line
     * @return String representation of the log
     */
    public String getLog() {
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < sightings.size(); i++) {
            sb.append(sightings.get(i).getLocation());
            sb.append(" (");

            sb.append(sightings.get(i).getDetails());
            sb.append("), with ");

            sb.append(sightings.get(i).getAccomplices());

            if(i < sightings.size() - 1) {
                sb.append('\n');
            }
        }
        return sb.toString();
    }
}
