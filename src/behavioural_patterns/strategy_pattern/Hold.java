package behavioural_patterns.strategy_pattern;

public class Hold implements Hand {

    @Override
    public void performAction() {
        System.out.println("Held.... :)");
    }
}
