package decorator;

/**
 * A concrete decorator class representing armor for a player.
 * Extends the functionality of the PlayerDecorator class.
 * written by : Jacob Robertson
 */
public class Armor extends PlayerDecorator{
    
    /**
     * Constructs a new Armor decorator for a player.
     *
     * @param player The player object to be decorated with armor.
     */
    public Armor(Player player) {
        super(player);
        super.IntegrateDecor(FileReader.getLines("decorator/txt/armor.txt"));
    }
}
