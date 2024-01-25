package decorator;

import java.util.ArrayList;

public abstract class PlayerDecorator extends Player {
    private Player player;

    public PlayerDecorator(Player player) {
        super(player.lines, player.getName());
        this.player = player;
    }

    protected void IntegrateDecor(ArrayList<String> decor) {
        player.lines.addAll(decor);
    }
}
