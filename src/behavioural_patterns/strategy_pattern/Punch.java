package behavioural_patterns.strategy_pattern;

public class Punch implements Hand {

    @Override
    public void performAction() {
        System.out.println("Punching.... :D");
    }
}
