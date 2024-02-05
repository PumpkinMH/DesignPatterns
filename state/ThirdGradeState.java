package state;

public class ThirdGradeState extends State {
  public ThirdGradeState(SpellingList spellingList) {
    super(spellingList);
    words = FileReader.getWords("state/third.txt");
  }

  public void increaseGrade() {
    System.out.println("Grades beyond third are not available");
  }

  public void decreaseGrade() {
    spellingList.setState(spellingList.getSecondGradeState());
    System.out.println("Currently in second grade");
  }
  
}
