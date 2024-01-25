package decorator;

/**
 * A concrete class representing a warrior player.
 * Extends the functionality of the Player class.
 * written by : Jacob Robertson
 */
public class Warrior extends Player {
    
    /**
     * Constructs a new Warrior player with the specified name.
     *
     * @param name The name of the warrior player.
     */
    public Warrior(String name) {
        super(FileReader.getLines("decorator/txt/warrior.txt"), "#### "+name+" ####");
    }
}
