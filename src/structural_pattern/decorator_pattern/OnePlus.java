package structural_pattern.decorator_pattern;

public class OnePlus extends SmartPhone {
    @Override
    public float getPrice() {
        return 600;
    }

    @Override
    public String getModel() {
        return "OnePlus 7";
    }
}
