package strategy;

import java.util.Random;

public abstract class Player {
    private String firstName;
    private String lastName;
    protected DefenceBehavior defenceBehavior;
    protected OffenceBehavior offenseBehavior;
    protected Random rand;

    Player(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public abstract void setDefenseBehavior();

    public abstract void setOffenseBehavior();

    public String play(boolean possession) {
        if(possession) {
            return "Has possession";
        }
        return "Doesn't have Possession";
    }

    public String toString() {
        return this.firstName + " " + this.lastName;
    }


}
