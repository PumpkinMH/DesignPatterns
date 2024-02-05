package state;

public class SecondGradeState extends State {
  /**
   * Constructor for SecondGradeState
   * @param spellingList SpellingList that will be used for changing states
   */
  public SecondGradeState(SpellingList spellingList) {
    super(spellingList);
    words = FileReader.getWords("state/second.txt");
  }

  /**
   * Changes to the third grade State of the spellingList
   */
  public void increaseGrade() {
    spellingList.setState(spellingList.getThirdGradeState());
    System.out.println("Currently in third grade");
  }

  /**
   * Changes to the first grade State of the spellingList
   */
  public void decreaseGrade() {
    spellingList.setState(spellingList.getFirstGradeState());
    System.out.println("Currently in first grade");
  }
}
