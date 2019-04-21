package structural_pattern.decorator_pattern;

public abstract class PhoneConfiguration extends SmartPhone{
    protected final SmartPhone smartPhone;

    public PhoneConfiguration(SmartPhone smartPhone) {
        this.smartPhone = smartPhone;
    }

    @Override
    public float getPrice() {
        return smartPhone.getPrice();
    }

    @Override
    public String getModel() {
        return smartPhone.getModel();
    }
}
