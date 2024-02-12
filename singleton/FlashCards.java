import java.util.ArrayList;
import java.util.Random;

/**
 * The FlashCards class represents a set of flashcards containing words and their definitions.
 * It allows users to retrieve a random word from the set.
 */
public class FlashCards {
    private Random rand;
    private static FlashCards flashCards;
    private ArrayList<Word> words;
    private Word currentWord;

    /**
     * Constructs a FlashCards object and initializes it with a list of words.
     * The list of words is obtained from a file using the FileReader class.
     * The FlashCards object also retrieves the first word from the list.
     */
    public FlashCards() {
        this.rand = new Random();
        words = new ArrayList<Word>(FileReader.getWords());
        getWord();
    }

    /**
     * Returns the instance of FlashCards. If it doesn't exist, a new instance is created.
     *
     * @return The instance of FlashCards.
     */
    public static FlashCards getInstance() {
        if (flashCards == null) {
            flashCards = new FlashCards();
        }
        return flashCards;
    }

    /**
     * retrieves a random word from the arrayList returned from filereader
     * 
     * @return the randomly selected word object
     */
    public Word getWord() {
        this.currentWord = this.words.get(this.rand.nextInt(this.words.size()));
        return this.currentWord;
    }
}
