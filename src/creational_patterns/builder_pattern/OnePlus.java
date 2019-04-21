package creational_patterns.builder_pattern;

public class OnePlus extends PhoneManufaturer {
    @Override
    void buildModel() {
        smartPhone.setModel("OnePlus 7");
    }

    @Override
    void buildRAM() {
        smartPhone.setRam("6GB");
    }

    @Override
    void buildStorage() {
        smartPhone.setStorage("256GB");
    }
}
