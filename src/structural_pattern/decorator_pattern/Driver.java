package structural_pattern.decorator_pattern;

public class Driver {

    public static void display(SmartPhone smartPhone){
        System.out.println("Model : " + smartPhone.getModel());
        System.out.println("Price : " + smartPhone.getPrice());
    }
    public static void main(String[] args) {
        SmartPhone smartPhone = new OnePlus();
        display(smartPhone);

        smartPhone = new RAM6GB(smartPhone);
        display(smartPhone);

        smartPhone = new Storage256GB(smartPhone);
        display(smartPhone);

        smartPhone = new Huawei();
        display(smartPhone);

        smartPhone = new RAM8GB(smartPhone);
        display(smartPhone);

        smartPhone = new Storage128GB(smartPhone);
        display(smartPhone);
    }
}
