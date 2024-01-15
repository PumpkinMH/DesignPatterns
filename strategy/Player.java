package strategy;

import java.util.Random;

public abstract class Player {
    /**
     * String that represents the firstName
     */
    private String firstName;
    /**
     * String that represents the lastName
     */
    private String lastName;
    /**
     * Determines the actions when play() is called. Uses an implementation of the DefenceBehavior interface
     */
    protected DefenceBehavior defenceBehavior;
    /**
     * Determines the actions when play() is called. Uses an implementation of the OffenceBehavior interface
     */
    protected OffenceBehavior offenceBehavior;
    /**
     * Used for when randomness is needed by children
     */
    protected Random rand;

    /**
     * Constructor for Player.
     * @param firstName The desired first name String
     * @param lastName The desired last name String
     */
    public Player(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        rand = new Random();
        setOffenceBehavior();
        setDefenceBehavior();
    }

    /**
     * Sets the defenceBehavior using one of the children of DefenceBehavior.
     * Predetermined for each different kind of Player.
     */
    public abstract void setDefenceBehavior();

    /**
     * Sets the offenceBehavior using one of the children of OffenceBehavior.
     * Predetermined for each different kind of Player.
     */
    public abstract void setOffenceBehavior();

    /**
     * Makes a play based on the set offenceBehavior and defenceBehavior.
     * If possession is true, then it uses offenceBehavior.
     * If possession is false, then it uses defenceBehavior.
     * @param possession True means in possession of the puck, false means not in possession of the puck
     * @return String describing the play with a sentence
     */
    public String play(boolean possession) {
        if(possession) {
            return offenceBehavior.play();
        } else {
            return defenceBehavior.play();
        }
    }

    /**
     * Returns a String with the first and last name of the player.
     * Intended to be added on to by children.
     * @return String with the first and last name separated by a space
     */
    public String toString() {
        String output = firstName + " " + lastName;
        return output;
    }
}
