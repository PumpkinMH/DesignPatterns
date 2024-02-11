package singleton;

import java.util.ArrayList;
import java.util.Random;

public class FlashCards {
  /**
   * Random variable used for picking the next word
   */
  private Random rand;

  /**
   * Static member used for a singleton
   */
  private static FlashCards flashCards;

  /**
   * Represents all of the words from the word file
   */
  private ArrayList<Word> words;

  /**
   * The current word that will be used in getWord
   */
  private Word currentWord;

  /**
   * Private constructor for FlashCards available via getInstance
   */
  private FlashCards() {
    rand = new Random();
    words = FileReader.getWords();
    currentWord = words.get(rand.nextInt(words.size()));
  }

  /**
   * Returns a the same instance of FlashCards each time. If it doesn't exist, it will make it exactly once
   * @return Singleton FlashCard object 
   */
  public static FlashCards getInstance() {
    if(flashCards == null) {
      flashCards = new FlashCards();
    }
    return flashCards;
  }

  /**
   * Returns the current Word that was randomly selected
   * @return Word representing the current Word
   */
  public Word getWord() {
    currentWord = words.get(rand.nextInt(words.size()));
    return currentWord;
  }
}
