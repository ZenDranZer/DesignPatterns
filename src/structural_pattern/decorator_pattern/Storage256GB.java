package structural_pattern.decorator_pattern;

public class Storage256GB extends PhoneConfiguration {

    public Storage256GB(SmartPhone smartPhone) {
        super(smartPhone);
    }

    @Override
    public float getPrice() {
        return smartPhone.getPrice() + 100.01f;
    }

    @Override
    public String getModel() {
        return smartPhone.getModel() + ", Storage = 256GB";
    }

}
