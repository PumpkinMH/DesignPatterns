package strategy;

public class Defenceman extends Player {
    public Defenceman(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void setOffenceBehavior() {}

    public void setDefenceBehavior() {}

    public String toString() {
        String output = super.toString() + " plays the position: Defenceman";
        return output;
    }
    
}
