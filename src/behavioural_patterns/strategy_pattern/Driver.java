package behavioural_patterns.strategy_pattern;

public class Driver {
    public static void main(String[] args) {
        Human human = new Human();

        human.setRightHand(new Hold());
        human.performAction();

        human.setRightHand(new Punch());
        human.performAction();

        human.setRightHand(new Release());
        human.performAction();

        human.setRightHand(new Slap());
        human.performAction();


    }
}
