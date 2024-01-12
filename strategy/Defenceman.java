package strategy;

import java.util.Random;

public class Defenceman extends Player {

    Defenceman(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void setOffenseBehavior() {
        Random rand = new Random();
        int randInt = rand.nextInt(10) + 1;
        if (randInt < 10) {
            PassBehavior passStyle = new PassBehavior();
            passStyle.play();
        }else if (randInt == 10) {
            SlapShotBehavior slapStyle = new SlapShotBehavior();
            slapStyle.play();
        }else {
            System.out.println("u messed up rand dude"); // DELETE
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
