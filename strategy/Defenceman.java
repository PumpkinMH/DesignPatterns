package strategy;

public class Defenceman extends Player {
    public Defenceman(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void setOffenceBehavior() {
        int choice = rand.nextInt(10);
        if(choice == 0) {
            offenceBehavior = new SlapShotBehavior();
        } else {
            offenceBehavior = new PassBehavior();
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
        String output = super.toString() + " plays the position: Defenceman";
        return output;
    }
    
}
