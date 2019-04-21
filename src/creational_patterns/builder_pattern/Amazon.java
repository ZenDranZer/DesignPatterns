package creational_patterns.builder_pattern;

public class Amazon {

    private PhoneManufaturer manufaturer;

    public void setManufaturer(PhoneManufaturer manufaturer) {
        this.manufaturer = manufaturer;
    }

    public void orderPhone(){
        manufaturer.buildPhone();
        manufaturer.buildModel();
        manufaturer.buildRAM();
        manufaturer.buildStorage();
    }

    public Phone deliverPhone(){
        return manufaturer.smartPhone;
    }
}
