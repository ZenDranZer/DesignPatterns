package behavioural_patterns.strategy_pattern;

public class Release implements Hand {

    @Override
    public void performAction() {
        System.out.println("Releasing.... ;)");
    }
}
