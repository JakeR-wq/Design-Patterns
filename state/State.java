package state;

import java.util.ArrayList;
import java.util.Random;

/**
 * Represents a state in the spelling list.
 * Written by : Jacob Robertson
 */
public abstract class State {

    protected SpellingList spellingList;
    protected ArrayList<String> words;
    protected Random rand;

    /**
     * Constructs a State object with the specified spelling list.
     *
     * @param spellingList the spelling list associated with this state
     */
    public State(SpellingList spellingList) {
        this.spellingList = spellingList;
        this.rand = new Random();
    }

    /**
     * Retrieves the next word from the state's word list.
     *
     * @return the next word
     */
    public String getNextWord() {
        return words.get(rand.nextInt(words.size()));
    }

    /**
     * Increases the grade level. Subclasses must implement this method.
     */
    public abstract void increaseGrade();

    /**
     * Decreases the grade level. Subclasses must implement this method.
     */
    public abstract void decreaseGrade();
}
