package behavioural_patterns.strategy_pattern;

public class Human {
    private Hand rightHand;

    public void setRightHand(Hand rightHand) {
        this.rightHand = rightHand;
    }

    public void performAction(){
        rightHand.performAction();
    }
}
