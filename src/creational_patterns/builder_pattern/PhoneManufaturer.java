package creational_patterns.builder_pattern;

public abstract class PhoneManufaturer {
    protected Phone smartPhone;

    public Phone getSmartPhone() {
        return smartPhone;
    }

    public void buildPhone(){
        smartPhone = new Phone();
    }

    abstract void buildModel();
    abstract void buildRAM();
    abstract void buildStorage();
}
