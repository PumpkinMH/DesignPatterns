package singleton;

public class Word {
  /**
   * Strings representing the word, part of speech, definition, and an example sentence
   */
  private String word, type, definition, sentence;
  
  /**
   * Constructor that initializes all of the members
   * @param word String representing the word
   * @param type String representing the part of speech
   * @param definition String representing the definition
   * @param sentence String representing the example sentence
   */
  public Word(String word, String type, String definition, String sentence) {
    this.word = word;
    this.type = type;
    this.definition = definition;
    this.sentence = sentence;
  }

  /**
   * Returns a String representation of the word
   * @return String representation of the word
   */
  public String getWord() {
    return word;
  }

  /**
   * Returns a String representation of the part of speech, definition, and the sentence.
   * @return String representation of the Word excluding the actual word itself
   */
  public String getDescription() {
    String temp = "";
    temp += "Part of Speech: ";
    temp += type;
    temp += '\n';

    temp += "Definition: ";
    temp += definition;
    temp += '\n';

    temp += "Example: ";
    temp += sentence;
    
    return temp;
  }
}
