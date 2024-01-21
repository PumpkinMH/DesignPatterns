package observer;

import java.util.ArrayList;

public interface Observer {
    void update(String location, String description, ArrayList<String> accomplices);

    String getLog();
}
