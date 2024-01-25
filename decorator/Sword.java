package decorator;


public class Sword extends PlayerDecorator {

    public Sword(Player player) {
        super(player);
        super.IntegrateDecor(FileReader.getLines("decoratorTextFiles/sword.txt"));
    }
}
