package decorator;

public class Warrior extends Player {
    
    public Warrior(String name) {
        super(FileReader.getLines("decoratorFiles/warrior.txt"), name);
    }
    
}
