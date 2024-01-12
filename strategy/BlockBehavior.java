package strategy;

import java.util.Random;

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
                playStyle = "dont get here plsplsplsplspls";

        }
        return playStyle;
    }
}

