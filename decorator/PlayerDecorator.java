package decorator;

import java.util.ArrayList;

/**
 * The abstract base class for player decorators.
 * Extends the functionality of the Player class using the decorator class.
 * written by : Jacob Robertson
 */
public abstract class PlayerDecorator extends Player {

    private Player player;

    /**
     * Constructs a new PlayerDecorator with the specified decorated player.
     *
     * @param player The player object to be decorated.
     */
    public PlayerDecorator(Player player) {
        super(player.lines, player.getName());
        this.player = player;
    }

    /**
     * The function `IntegrateDecor` integrates a list of decorative strings into another list of
     * strings by replacing whitespace characters in each line with the corresponding character from
     * the decorative string.
     * 
     * @param decor An ArrayList of Strings representing the decoration lines. Each String in the
     * ArrayList represents a line of decoration to be integrated with the existing lines.
     */
    protected void IntegrateDecor(ArrayList<String> decor) {
        int targetLength = 35;
        for (int i = 0; i < lines.size(); i++) {
            lines.set(i, padString(lines.get(i), targetLength));
            decor.set(i, padString(decor.get(i), targetLength));
        }

        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            String decorLine = decor.get(i);

            StringBuilder updatedLine = new StringBuilder();

            for (int j = 0; j < targetLength; j++) {
                char decorChar = decorLine.charAt(j);


                if (!Character.isWhitespace(decorChar)) {
                    updatedLine.append(decorChar);
                } else {
                    updatedLine.append(line.charAt(j));
                }
            }

            lines.set(i, updatedLine.toString());
        }
    }

    /**
     * The function pads a given string with spaces on the right side to reach a target length.
     * 
     * @param input The input parameter is a String that represents the input value that needs to be
     * padded.
     * @param targetLength The targetLength parameter is an integer that specifies the desired length
     * of the output string.
     * @return The method returns a padded string.
     */
    private static String padString(String input, int targetLength) {
        if (input.length() >= targetLength) {
            return input.substring(0, targetLength);
        } else {
            return String.format("%-" + targetLength + "s", input);
        }
    }
}
