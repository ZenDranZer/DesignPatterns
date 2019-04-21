package structural_pattern.decorator_pattern;

public class Huawei extends SmartPhone {
    @Override
    public float getPrice() {
        return 500;
    }

    @Override
    public String getModel() {
        return "Huawei Honor view 20 ";
    }
}
