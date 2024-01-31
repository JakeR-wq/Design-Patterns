package state;
/**
 * Represents a spelling list with different grade states.
 * Written by : Jacob Robertson
 */
public class SpellingList {
    private State state;
    private FirstGradeState firstGradeState;
    private SecondGradeState secondGradeState;
    private ThirdGradeState thirdGradeState;

    /**
     * Constructs a SpellingList object and initializes it to the first grade state.
     */
    public SpellingList() {
        firstGradeState = new FirstGradeState(this);
        secondGradeState = new SecondGradeState(this);
        thirdGradeState = new ThirdGradeState(this);
        state = firstGradeState;
    }

    /**
     * Retrieves the next word from the current state.
     *
     * @return the next word from the current state
     */
    public String getNextWord() {
        return state.getNextWord();
    }

    /**
     * Increases the grade level.
     */
    public void increaseGrade() {
        state.increaseGrade();
    }

    /**
     * Decreases the grade level.
     */
    public void decreaseGrade() {
        state.decreaseGrade();
    }

    /**
     * Gets the first grade state.
     *
     * @return the first grade state
     */
    public State getFirstGradeState() {
        return firstGradeState;
    }

    /**
     * Gets the second grade state.
     *
     * @return the second grade state
     */
    public State getSecondGradeState() {
        return secondGradeState;
    }

    /**
     * Gets the third grade state.
     *
     * @return the third grade state
     */
    public State getThirdGradeState() {
        return thirdGradeState;
    }

    /**
     * Sets the current state.
     *
     * @param state the state to set
     */
    public void setState(State state) {
        this.state = state;
    }
}
