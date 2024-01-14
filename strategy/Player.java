package strategy;

import java.util.Random;

public abstract class Player {
    // Variables
    private String firstName;
    private String lastName;
    protected DefenceBehavior defenceBehavior;
    protected OffenceBehavior offenceBehavior;
    protected Random rand;

    // Methods
    public Player(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        rand = new Random();
        setOffenceBehavior();
        setDefenceBehavior();
    }

    public abstract void setDefenceBehavior();
    public abstract void setOffenceBehavior();
    
    public String play(boolean possession) {
        if(possession) {
            return offenceBehavior.play();
        } else {
            return defenceBehavior.play();
        }
    }

    public String toString() {
        String output = firstName + " " + lastName;
        return output;
    }
}
