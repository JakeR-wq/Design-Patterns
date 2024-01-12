package strategy;

public class Goalie extends Player{

    Goalie(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void setOffenseBehavior() {
        BlockGoalBehavior goalieStyle = new BlockGoalBehavior();
        goalieStyle.play();
    }

    @Override
    public void setDefenseBehavior() {
        BlockGoalBehavior goalieStyle = new BlockGoalBehavior();
        goalieStyle.play();
    }

    public String toString() {
        return super.toString();
    }
}
