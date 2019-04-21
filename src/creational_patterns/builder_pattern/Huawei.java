package creational_patterns.builder_pattern;

public class Huawei extends PhoneManufaturer {
    @Override
    void buildModel() {
        smartPhone.setModel("Honor view 20");
    }

    @Override
    void buildRAM() {
        smartPhone.setRam("6GB");
    }

    @Override
    void buildStorage() {
        smartPhone.setStorage("128GB");
    }
}
