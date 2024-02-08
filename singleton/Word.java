public class Word {
    private String word;
    private String type;
    private String definition;
    private String sentence;

    public Word(String word, String type, String definition, String sentence) {
        this.word = word;
        this.type = type;
        this.definition = definition;
        this.sentence = sentence;
    }

    public String getWord() {
        return word;
    }

    public String getDescription() {
        StringBuilder sb = new StringBuilder();
        sb.append("Part of speech: ").append(this.type).append("\n")
        .append("Definition: ").append(this.definition).append("\n")
        .append(this.sentence);
        return sb.toString();
    }
}
