package behavioural_patterns.oberver_pattern;

import java.util.Observable;
import java.util.Observer;

public class AmazonWebSite implements Observer {

    @Override
    public void update(Observable observable, Object o) {
        AmazonItem item = (AmazonItem) observable;
        System.out.println("Item Name : " + item.getItemName());
        System.out.println("Item left : " + item.getItemCount());
    }
}
