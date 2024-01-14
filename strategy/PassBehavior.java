package strategy;

// implementation of the pass type of offence behavior
public class PassBehavior implements OffenceBehavior {
    public String play() {
        return "Passes to a forward";
    }
}
