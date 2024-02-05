package state;

public class FirstGradeState extends State {
  public FirstGradeState(SpellingList spellingList) {
    super(spellingList);
    words = FileReader.getWords("state/first.txt");
  }

  public void increaseGrade() {
    spellingList.setState(spellingList.getSecondGradeState());
    System.out.println("Currently in second grade");
  }

  public void decreaseGrade() {
    System.out.println("Can't go below first grade");
    
  }
  
}
