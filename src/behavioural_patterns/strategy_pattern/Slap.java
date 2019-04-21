package behavioural_patterns.strategy_pattern;

public class Slap implements Hand {

    @Override
    public void performAction() {
        System.out.println("Slapping.... :(");
    }
}