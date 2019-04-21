package structural_pattern.decorator_pattern;

public class Storage128GB extends PhoneConfiguration {
    public Storage128GB(SmartPhone smartPhone) {
        super(smartPhone);
    }

    @Override
    public float getPrice() {
        return smartPhone.getPrice() + 80.01f;
    }

    @Override
    public String getModel() {
        return smartPhone.getModel() + ", Storage = 128GB";
    }

}
