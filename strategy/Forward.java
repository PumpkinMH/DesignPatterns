package strategy;

public class Forward extends Player {
    public Forward(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void setOffenceBehavior() {}

    public void setDefenceBehavior() {}

    public String toString() {
        String output = super.toString() + " plays the position: Forward";
        return output;
    }
    
}
