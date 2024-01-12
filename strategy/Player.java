package strategy;

import java.util.Random;

public abstract class Player implements DefenceBehavior, OffenceBehavior {
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

    }

    public String toString() {

    }


}
