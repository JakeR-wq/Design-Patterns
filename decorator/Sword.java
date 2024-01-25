package decorator;

/**
 * A concrete decorator class representing a sword for a player.
 * Extends the functionality of the PlayerDecorator class.
 * written by : Jacob Robertson
 */
public class Sword extends PlayerDecorator {

    /**
     * Constructs a new Sword decorator for a player.
     *
     * @param player The player object to be decorated with a sword.
     */
    public Sword(Player player) {
        super(player);
        super.IntegrateDecor(FileReader.getLines("decorator/txt/sword.txt"));
    }
}
