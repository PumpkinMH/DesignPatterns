package state;

public class FirstGradeState extends State {
  /**
   * Constructor for FirstGradeState
   * @param spellingList SpellingList that will be used for changing states
   */
  public FirstGradeState(SpellingList spellingList) {
    super(spellingList);
    words = FileReader.getWords("state/first.txt");
  }

  /**
   * Changes to the second grade State of the spellingList
   */
  public void increaseGrade() {
    spellingList.setState(spellingList.getSecondGradeState());
    System.out.println("Currently in second grade");
  }

  /**
   * Prints an error message
   */
  public void decreaseGrade() {
    System.out.println("Can't go below first grade");
    
  }
  
}
