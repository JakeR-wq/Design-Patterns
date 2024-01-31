package state;

/**
 * Represents the state of being in the second grade level.
 * Written by : Jacob Robertson
 */
public class SecondGradeState extends State {

    /**
     * Constructs a SecondGradeState object with the specified spelling list.
     *
     * @param spellingList the spelling list associated with this state
     */
    public SecondGradeState(SpellingList spellingList) {
        super(spellingList);
        super.words = FileReader.getWords("state/txt/second.txt");
    }

    /**
     * Increases the grade level to the third grade.
     */
    @Override
    public void increaseGrade() {
        System.out.println("当前已经是第二级了， THIRD GRADE!!!");
        spellingList.setState(new ThirdGradeState(spellingList)); 
    }

    /**
     * Decreases the grade level to the first grade.
     */
    @Override
    public void decreaseGrade() {
        System.out.println("降级到第一级 FIRST GRADE!!!");
        spellingList.setState(new FirstGradeState(spellingList)); 
    }
}




