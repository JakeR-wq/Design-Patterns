package decorator;

/**
 * A concrete decorator class representing a shield for a player.
 * Extends the functionality of the PlayerDecorator class.
 * written by : Jacob Robertson
 */
public class Shield extends PlayerDecorator{

    /**
     * Constructs a new Shield decorator for a player.
     *
     * @param player The player object to be decorated with a shield.
     */
    public Shield(Player player) {
        super(player);
        super.IntegrateDecor(FileReader.getLines("decorator/txt/shield.txt"));
    }
}
