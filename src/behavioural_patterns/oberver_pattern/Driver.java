package behavioural_patterns.oberver_pattern;

public class Driver {
    public static void main(String[] args) {
        Amazon amazon = new Amazon();
        AmazonItem onePlus = new AmazonItem(10,"One plus 7");
        AmazonItem view20 = new AmazonItem(7,"Honor View 20");
        AmazonItem mate30 = new AmazonItem(12,"Huawei Mate 30");
        AmazonItem nokiaX71 = new AmazonItem(2,"Nokia X71");

        amazon.addItem(onePlus);
        amazon.addItem(view20);
        amazon.addItem(mate30);
        amazon.addItem(nokiaX71);

        amazon.orderItem("One plus 7");
        amazon.orderItem("Huawei Mate 30");
        amazon.orderItem("Huawei Mate 30");
        amazon.orderItem("Nokia X71");
        amazon.orderItem("One plus 7");
        amazon.returnItem("one plus 7");
        amazon.orderItem("One plus 7");
        amazon.orderItem("Nokia X71");
        amazon.returnItem("huawei mate 30");
        amazon.orderItem("honor view 20");
        amazon.returnItem("honor view 20");

        amazon.removeItem(onePlus);
        amazon.removeItem(view20);
        amazon.removeItem(mate30);
        amazon.removeItem(nokiaX71);

        onePlus.incrementCount();
        onePlus.incrementCount();

        amazon.addItem(onePlus);
        amazon.orderItem("one plus 7");

    }
}
