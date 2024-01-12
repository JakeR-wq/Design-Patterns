package strategy;

import java.util.Random;

public class BlockGoalBehavior implements DefenceBehavior, OffenceBehavior {
    public String play() {
        Random rand = new Random();
        int randNum = rand.nextInt(4) + 1;
        String playStyle = null;
        switch(randNum) {
            case 1:
                playStyle = "hand blocks the puck";
                break;
            case 2:
                playStyle = "catches the puck";
                break;
            case 3:
                playStyle = "blocks puck with knee pads";
                break;
            case 4:
                playStyle = "blocks puck with stick";
                break;
            default:
                playStyle = "praying it doesnt get to this :pray:";
        }
        return playStyle;
    }
}
