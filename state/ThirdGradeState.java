package state;

public class ThirdGradeState extends State {
  /**
   * Constructor for ThirdGradeState
   * @param spellingList SpellingList that will be used for changing states
   */
  public ThirdGradeState(SpellingList spellingList) {
    super(spellingList);
    words = FileReader.getWords("state/third.txt");
  }

  /**
   * Prints an error message
   */
  public void increaseGrade() {
    System.out.println("Grades beyond third are not available");
  }

  /**
   * Changes to the second grade State of the spellingList
   */
  public void decreaseGrade() {
    spellingList.setState(spellingList.getSecondGradeState());
    System.out.println("Currently in second grade");
  }
  
}
