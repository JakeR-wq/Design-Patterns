package decorator;

public class Armor extends PlayerDecorator{

    public Armor(Player player) {
        super(player);
        super.IntegrateDecor(FileReader.getLines("decoratorTextFiles/armor.txt"));
    }
}
