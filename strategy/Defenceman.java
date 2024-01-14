package strategy;

// child of class Player
public class Defenceman extends Player {

    // creates a Defenceman object
    Defenceman(String firstName, String lastName) {
        super(firstName, lastName);
        setOffenseBehavior();
        setDefenseBehavior();
    }

    // 10% chance to set offense behavior to slapshot, otherwise set to pass
    @Override
    public void setOffenseBehavior() {
        int randInt = rand.nextInt(10) + 1;
        if (randInt < 10) {
            offenseBehavior = new PassBehavior();
        }else if (randInt == 10) {
            offenseBehavior = new SlapShotBehavior();
        }
    }

    // 50% of the time behavior is set to chase puck otherwise set to block
    @Override
    public void setDefenseBehavior() {
        int randInt = rand.nextInt(2) + 1;
        if (randInt == 1) {
            defenceBehavior = new ChasePuckBehavior();
        } else if (randInt == 2) {
            defenceBehavior = new BlockBehavior();
        }
    }

    // basic toString, adds the position this object plays
    public String toString() {
        return super.toString() + " plays the position DEFENCEMAN";
    }
}
