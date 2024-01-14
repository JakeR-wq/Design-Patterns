package strategy;

import java.util.Random;

public abstract class Player {
    private String firstName;
    private String lastName;
    protected DefenceBehavior defenceBehavior;
    protected OffenceBehavior offenseBehavior;
    protected Random rand;

    // constructor for the player object
    // random is contructed her so that it does not have to be init. in each child
    Player(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rand = new Random();
    }

    // abstract functions for setDefenseBehaivor setOffense Behaivor
    // will be used in child classes
    public abstract void setDefenseBehavior();

    public abstract void setOffenseBehavior();

    // play function, will setOffenseBehaivor & setDefenseBehavior then
    // depending on possesion execute play
    public String play(boolean possession) {
        setOffenseBehavior();
        setDefenseBehavior();
        if (possession) {
            return offenseBehavior.play();
        }
        return defenceBehavior.play();
    }

    // basic toString
    public String toString() {
        return this.firstName + " " + this.lastName;
    }
}
