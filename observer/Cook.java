package observer;

import java.util.ArrayList;

public class Cook implements Subject {
    private ArrayList<Observer> observers;
    private String name;

    public Cook(String name) {
        this.name = name;
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String location, String description, ArrayList<String> accomplices) {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(location, description, accomplices);
        }
    }

    public void enterSighting(String location, String description, String accomplices) {
        String[] tempArray = accomplices.split(", ");
        ArrayList<String> tempList = new ArrayList<String>();
        for (String temp : tempArray) {
            tempList.add(temp);
        }
        notifyObservers(location, description, tempList);
    }

    public String getName() {
        return name;
    }
}
