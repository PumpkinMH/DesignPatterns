package strategy;

public class Forward extends Player {
    public Forward(String firstName, String lastName) {
        super(firstName, lastName);
    }

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

    public String toString() {
        String output = super.toString() + " plays the position: Forward";
        return output;
    }
    
}
