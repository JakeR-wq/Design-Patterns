package decorator;

public class Shield extends PlayerDecorator{

    public Shield(Player player) {
        super(player);
        super.IntegrateDecor(FileReader.getLines("decoratorTextFiles/shield.txt"));
    }
}
