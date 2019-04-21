package structural_pattern.decorator_pattern;

public class RAM6GB extends PhoneConfiguration{

    public RAM6GB(SmartPhone smartPhone) {
        super(smartPhone);
    }

    @Override
    public float getPrice() {
        return smartPhone.getPrice() + 40.99f;
    }

    @Override
    public String getModel() {
        return smartPhone.getModel() + ", RAM = 6GB";
    }

}
