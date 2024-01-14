package strategy;

public class Goalie extends Player {
    public Goalie(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void setOffenceBehavior() {}

    public void setDefenceBehavior() {}

    public String toString() {
        String output = super.toString() + " plays the position: Goalie";
        return output;
    }
    
}
