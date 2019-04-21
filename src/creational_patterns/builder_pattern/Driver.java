package creational_patterns.builder_pattern;

public class Driver {
    public static void main(String[] args) {
        Amazon amazon = new Amazon();
        Phone oneplus,huawei;

        PhoneManufaturer oneplusM = new OnePlus();
        PhoneManufaturer huaweiM = new Huawei();

        amazon.setManufaturer(oneplusM);
        amazon.orderPhone();
        oneplus = amazon.deliverPhone();
        System.out.println(oneplus);

        amazon.setManufaturer(huaweiM);
        amazon.orderPhone();
        huawei = amazon.deliverPhone();
        System.out.println(huawei);
    }
}
