package decorator;

import java.util.ArrayList;

/**
 * The base class representing a player.
 * Provides basic functionality for handling player information.
 * written by : Jacob Robertson
 */
public abstract class Player {
    
    protected String name;
    protected ArrayList<String> lines;

    /**
     * Constructs a new player with the specified lines of text and name.
     *
     * @param lines The lines of text associated with the player.
     * @param name  The name of the player.
     */
    public Player(ArrayList<String> lines, String name) {
        this.name = name;
        this.lines = lines;
    }

    /**
     * The getName() function returns the name of an object.
     * 
     * @return The function is returning the value of the variable "name".
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns a string representation of the player, including the name and lines of text.
     *
     * @return A string representation of the player.
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name).append("\n");
        for (String line : this.lines) {
            sb.append(line).append("\n");
        }
        return sb.toString();
    }
}
