package state;

import java.util.ArrayList;
import java.util.Random;

public abstract class State {
  /**
   * SpellingList that will be used when changing to a new state
   */
  protected SpellingList spellingList;

  /**
   * ArrayList that will be randomly selected from by getNextWord(). Intended to be properly filled by children
   */
  protected ArrayList<String> words;

  /**
   * Random object used by getNextWord()
   */
  private Random rand;

  /**
   * Constructor for State. Intended to be overriden
   * @param spellingList SpellingList that will be used when changing to a new state
   */
  public State(SpellingList spellingList) {
    this.spellingList = spellingList;
    words = new ArrayList<String>();
    rand = new Random();

  }

  /**
   * Randomly selects a word from the words ArrayList
   * @return String representing the randomly selected word
   */
  public String getNextWord() {
    return words.get(rand.nextInt(words.size()));
  }

  /**
   * Changes to the next grade based on the current one
   */
  public abstract void increaseGrade();

  /**
   * Changes to the previous grade based on the current one
   */
  public abstract void decreaseGrade();
}
