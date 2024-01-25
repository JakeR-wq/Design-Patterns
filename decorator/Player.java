package decorator;

import java.util.ArrayList;

public abstract class Player {
    protected String name;
    protected ArrayList<String> lines;

    public Player(ArrayList<String> lines, String name) {
        this.name = name;
        this.lines = lines;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name).append("\n");
        for (String line : this.lines) {
            sb.append(line).append("\n");
        }
        
        return sb.toString();
    }
}
