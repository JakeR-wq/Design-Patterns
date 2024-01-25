package decorator;

public class Warrior extends Player {
    
    public Warrior(String name) {
        super(FileReader.getLines("decoratorTextFiles/warrior.txt"), name);
    }
}
