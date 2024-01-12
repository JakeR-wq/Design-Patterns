package strategy;

public class Goalie extends Player{

    Goalie(String firstName, String lastName) {
        super(firstName, lastName);
        setOffenseBehavior();
        setDefenseBehavior();
    }

    @Override
    public void setOffenseBehavior() {
        offenseBehavior = new BlockGoalBehavior();
    }

    @Override
    public void setDefenseBehavior() {
        defenceBehavior = new BlockGoalBehavior();
    }

    public String toString() {
        return super.toString() + " plays the position GOALIE";
    }
}
