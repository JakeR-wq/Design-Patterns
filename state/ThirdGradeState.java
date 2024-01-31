package state;

/**
 * Represents the state of being in the third grade level.
 * Written by : Jacob Robertson
 */
public class ThirdGradeState extends State {

    /**
     * Constructs a ThirdGradeState object with the specified spelling list.
     *
     * @param spellingList the spelling list associated with this state
     */
    public ThirdGradeState(SpellingList spellingList) {
        super(spellingList);
        super.words = FileReader.getWords("state/txt/third.txt");
    }
    /**
     * Indicates that the grade level is already at the maximum.
     */
    @Override
    public void increaseGrade() {
        System.out.println("you are in the max grade, NO GOING HIGHER");
    }

    /**
     * Decreases the grade level to the second grade.
     */
    @Override
    public void decreaseGrade() {
        System.out.println("SECOND GRADE!!!");
        spellingList.setState(new SecondGradeState(spellingList));
    }
}
