import java.util.ArrayList;
import java.util.Random;

public class FlashCards {
    private Random rand;
    private static FlashCards flashCards;
    private ArrayList<Word> words;
    private Word currentWord;

    public FlashCards() {
        this.rand = new Random();
        words = new ArrayList<Word>(FileReader.getWords());
        getWord();
    }

    public static FlashCards getInstance() {
        if (flashCards == null) {
            flashCards = new FlashCards();
        }
        return flashCards;
    }

    public Word getWord() {
        this.currentWord = this.words.get(this.rand.nextInt(this.words.size()));
        return this.currentWord;
    }
}
