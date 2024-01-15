package strategy;

public class Goalie extends Player {
    /**
     * Constructor for the goalie that takes a first and last name.
     * @param firstName String for the first name
     * @param lastName String for the last name
     */
    public Goalie(String firstName, String lastName) {
        super(firstName, lastName);
    }

    /**
     * Sets the offence behavior to BlockGoalBehavior
     */
    public void setOffenceBehavior() {
        offenceBehavior = new BlockGoalBehavior();
    }

    /**
     * Sets the defence behavior to BlockGoalBehavior
     */
    public void setDefenceBehavior() {
        defenceBehavior = new BlockGoalBehavior();
    }

    /**
     * String describing the position being played
     * @return String describing the position being played
     */
    public String toString() {
        String output = super.toString() + " plays the position: Goalie";
        return output;
    }
    
}
