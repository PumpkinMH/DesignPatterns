package singleton;

public class Word {
  private String word, type, definition, sentence;
  
  public Word(String word, String type, String definition, String sentence) {
    this.word = word;
    this.type = type;
    this.definition = definition;
    this.sentence = sentence;
  }

  public String getWord() {
    return word;
  }

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
