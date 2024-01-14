package strategy;

import java.util.Random;

// implementation of the play function for blocking defense behavior
// 33% chance for each string to be returned
public class BlockBehavior implements DefenceBehavior {
    public String play() {
        Random rand = new Random();
        int randInt = rand.nextInt(3) + 1;
        String playStyle = null;
        switch(randInt) {
            case 1:
                playStyle = "blocks player from passing";
                break;
            case 2:
                playStyle = "blocks player from shooting";
                break;
            case 3:
                playStyle = "checks player with puck";
                break;
            default:
                playStyle = "blocks player from shooting";

        }
        return playStyle;
    }
}

