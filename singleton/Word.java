/**
 * The Word class represents a word along with its type, definition, and an example sentence.
 */

public class Word {
    private String word;
    private String type;
    private String definition;
    private String sentence;

    /**
     * Constructs a Word object with the specified word, type, definition, and sentence.
     *
     * @param word The word itself.
     * @param type The part of speech or type of the word.
     * @param definition The definition of the word.
     * @param sentence An example sentence demonstrating the usage of the word.
     */
    public Word(String word, String type, String definition, String sentence) {
        this.word = word;
        this.type = type;
        this.definition = definition;
        this.sentence = sentence;
    }

    /**
     * Gets the word itself.
     *
     * @return The word.
     */
    public String getWord() {
        return word;
    }

    /**
     * Constructs and returns a description of the word, including its type, definition, and an example sentence.
     *
     * @return A string containing the part of speech, definition, and example sentence of the word.
     */
    public String getDescription() {
        StringBuilder sb = new StringBuilder();
        sb.append("Part of speech: ").append(this.type).append("\n")
        .append("Definition: ").append(this.definition).append("\n")
        .append(this.sentence);
        return sb.toString();
    }
}
