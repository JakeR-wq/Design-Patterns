package strategy;

import java.util.Random;

public class Forward extends Player{

    Forward(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void setOffenseBehavior() {
        Random rand = new Random();
        int randInt = rand.nextInt(2) + 1;
        if (randInt == 1) {
            PassBehavior passStyle = new PassBehavior();
            passStyle.play();
        } else if (randInt == 2) {
            ShootBehavior shootStyle = new ShootBehavior();
            shootStyle.play();
        } else {
            System.out.println("u messed up rand"); // DELETE
        }
    }

    @Override
    public void setDefenseBehavior() {
        Random rand = new Random();
        int randInt = rand.nextInt(2) + 1;
        if (randInt == 1) {
            ChasePuckBehavior chaseStyle = new ChasePuckBehavior();
            chaseStyle.play();
        } else if (randInt == 2) {
            BlockBehavior blockStyle = new BlockBehavior();
            blockStyle.play();
        } else {
            System.out.println("You messed up random");  //DELETE
        }
    }

    public String toString() {
        return super.toString();
    }
}
