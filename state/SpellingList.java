package state;

public class SpellingList {
  /**
   * Represents the current state
   */
  private State state;
  
  /**
   * State that represents the first grade state
   */
  private FirstGradeState firstGradeState;
  
  /**
   * State that represents the second grade state
   */
  private SecondGradeState secondGradeState;
  
  /**
   * State that represents the third grade state
   */
  private ThirdGradeState thirdGradeState;

  /**
   * Constructor for the SpellingList. Initializes all of the states
   */
  public SpellingList() {
    state = firstGradeState = new FirstGradeState(this);
    secondGradeState = new SecondGradeState(this);
    thirdGradeState = new ThirdGradeState(this);
  }

  /**
   * Returns a String representing a random word depending on the state
   * @return String representing a random word
   */
  public String getNextWord() {
    return state.getNextWord();
  }

  /**
   * Increases the grade based upon the current state
   */
  public void increaseGrade() {
    state.increaseGrade();
  }

  /**
   * Decreases the grade based upon the current state
   */
  public void decreaseGrade() {
    state.decreaseGrade();
  }

  /**
   * Returns the state representing the first grade state
   * @return State representing the first grade state
   */
  public State getFirstGradeState() {
    return firstGradeState;    
  }
  
  /**
   * Returns the state representing the second grade state
   * @return State representing the second grade state
   */
  public State getSecondGradeState() {
    return secondGradeState;
  }

  /**
   * Returns the state representing the third grade state
   * @return State representing the third grade state
   */
  public State getThirdGradeState() {
    return thirdGradeState;
  }

  /**
   * Sets the current state to a new one. Intended to be used with one of the states already in the class.
   * @param state State representing the new one
   */
  public void setState(State state) {
    this.state = state;
  }
}
