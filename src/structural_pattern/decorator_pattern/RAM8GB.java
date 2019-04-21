package structural_pattern.decorator_pattern;

public class RAM8GB extends PhoneConfiguration{

    public RAM8GB(SmartPhone smartPhone) {
        super(smartPhone);
    }

    @Override
    public float getPrice() {
        return smartPhone.getPrice() + 50.99f;
    }

    @Override
    public String getModel() {
        return smartPhone.getModel() + ", RAM = 8GB";
    }
}
