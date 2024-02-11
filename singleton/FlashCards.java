package singleton;

import java.util.ArrayList;
import java.util.Random;

public class FlashCards {
  private Random rand;
  private static FlashCards flashCards;
  private ArrayList<Word> words;  
  private Word currentWord;

  private FlashCards() {
    rand = new Random();
    words = FileReader.getWords();
    currentWord = words.get(rand.nextInt(words.size()));
  }

  public static FlashCards getInstance() {
    if(flashCards == null) {
      flashCards = new FlashCards();
    }
    return flashCards;
  }

  public Word getWord() {
    currentWord = words.get(rand.nextInt(words.size()));
    return currentWord;
  }
}
