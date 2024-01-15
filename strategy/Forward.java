package strategy;

public class Forward extends Player {
    /**
     * Constructor for the forward that takes a first and last name.
     * @param firstName String for the first name
     * @param lastName String for the last name
     */
    public Forward(String firstName, String lastName) {
        super(firstName, lastName);
    }

    /**
     * Sets the offence behavior randomly based on two options, PassBehavior and ShootBehavior
     */
    public void setOffenceBehavior() {
        int choice = rand.nextInt(2);
        switch (choice) {
            case 0:
                offenceBehavior = new PassBehavior();
                break;
            case 1:
                offenceBehavior = new ShootBehavior();
                break;
        }
    }

    /**
     * Sets the defence behavior randomly based on two options, ChasePuckBehavior and BlockBehavior
     */
    public void setDefenceBehavior() {
        int choice = rand.nextInt(2);
        switch (choice) {
            case 0:
                defenceBehavior = new ChasePuckBehavior();
                break;
            case 1:
                defenceBehavior = new BlockBehavior();
                break;
        }
    }

    /**
     * String describing the position being played
     * @return String describing the position being played
     */
    public String toString() {
        String output = super.toString() + " plays the position: Forward";
        return output;
    }
    
}
