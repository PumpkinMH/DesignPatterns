package state;

public class SecondGradeState extends State {
  public SecondGradeState(SpellingList spellingList) {
    super(spellingList);
    words = FileReader.getWords("state/second.txt");
  }

  public void increaseGrade() {
    spellingList.setState(spellingList.getThirdGradeState());
    System.out.println("Currently in third grade");
  }

  public void decreaseGrade() {
    spellingList.setState(spellingList.getFirstGradeState());
    System.out.println("Currently in first grade");
  }
  
}
