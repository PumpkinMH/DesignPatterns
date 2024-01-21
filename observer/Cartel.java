package observer;

import java.util.ArrayList;

public class Cartel implements Observer {
    private Subject cook;
    private ArrayList<Sighting> sightings;

    public Cartel(Subject cook) {
        this.cook = cook;
        this.cook.registerObserver(this);
        sightings = new ArrayList<Sighting>();
    }

    public void update(String location, String details, ArrayList<String> accomplices) {
        Sighting tempSighting = new Sighting(location, details, accomplices);
        sightings.add(tempSighting);
    }

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
