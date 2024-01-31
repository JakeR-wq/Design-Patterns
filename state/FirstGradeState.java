package state;

/**
 * Represents the state of being in the first grade level.
 * Written by : Jacob Robertson
 */
public class FirstGradeState extends State{
    public FirstGradeState(SpellingList spellingList) {
        super(spellingList);
        super.words = FileReader.getWords("state/txt/first.txt");
    }

    /**
     * Constructs a FirstGradeState object with the specified spelling list.
     *
     * @param spellingList the spelling list associated with this state
     */
    @Override
    public void increaseGrade() {
        System.out.println("当前已经是第二级了， SECOND GRADE!!!");
        spellingList.setState(new SecondGradeState(spellingList)); // 状态转换为“第二级”
    }

    /**
     * Increases the grade level to the second grade.
     */
    @Override
    public void decreaseGrade() {
        System.out.println("当前已经是第一级了，不能再降级了, FIRST GRADE IS LOWEST GRADE");
    }
}
