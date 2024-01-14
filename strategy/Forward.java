package strategy;

// child of class Player
public class Forward extends Player{

    // constructs a forward object
    Forward(String firstName, String lastName) {
        super(firstName, lastName);
        setOffenseBehavior();
        setDefenseBehavior();
    }

    // 50% chance to either set offense behavior to pass or shoot behavior
    @Override
    public void setOffenseBehavior() {
        int randInt = rand.nextInt(2) + 1;
        if (randInt == 1) {
            offenseBehavior = new PassBehavior();
        } else if (randInt == 2) {
            offenseBehavior = new ShootBehavior();
        }
    }

    // 50% chance to set defense behavior to chase puck or block
    @Override
    public void setDefenseBehavior() {
        int randInt = rand.nextInt(2) + 1;
        if (randInt == 1) {
            defenceBehavior= new ChasePuckBehavior();
        } else if (randInt == 2) {
            defenceBehavior = new BlockBehavior();
        }
    }

    // basic toString, adds the position they play
    public String toString() {
        return super.toString() + " plays the position FORWARD";
    }
}
