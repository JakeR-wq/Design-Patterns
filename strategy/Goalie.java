package strategy;

// child of class Player
public class Goalie extends Player{

    // creates a goalie object
    Goalie(String firstName, String lastName) {
        super(firstName, lastName);
        setOffenseBehavior();
        setDefenseBehavior();
    }

    // both defense and offense behavior is set to block goal 
    @Override
    public void setOffenseBehavior() {
        offenseBehavior = new BlockGoalBehavior();
    }

    @Override
    public void setDefenseBehavior() {
        defenceBehavior = new BlockGoalBehavior();
    }

    // basic toString, adds the position of goalie
    public String toString() {
        return super.toString() + " plays the position GOALIE";
    }
}
