package strategy;

public class Defenceman extends Player {

    Defenceman(String firstName, String lastName) {
        super(firstName, lastName);
        setOffenseBehavior();
        setDefenseBehavior();
    }

    @Override
    public void setOffenseBehavior() {
        int randInt = rand.nextInt(10) + 1;
        System.out.println(randInt);
        if (randInt < 10) {
            offenseBehavior = new PassBehavior();
        }else if (randInt == 10) {
            offenseBehavior = new SlapShotBehavior();
        }
    }

    @Override
    public void setDefenseBehavior() {
        int randInt = rand.nextInt(2) + 1;
        System.out.println(randInt);
        if (randInt == 1) {
            defenceBehavior = new ChasePuckBehavior();
        } else if (randInt == 2) {
            defenceBehavior = new BlockBehavior();
        }
    }

    public String toString() {
        return super.toString() + " plays the position DEFENCEMAN";
    }
}
