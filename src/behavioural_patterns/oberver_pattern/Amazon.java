package behavioural_patterns.oberver_pattern;

import java.util.ArrayList;

public class Amazon {
    private ArrayList<AmazonItem> storeRoom;
    private AmazonWebSite myWebSite;

    public Amazon() {
        storeRoom = new ArrayList<>();
        myWebSite = new AmazonWebSite();
    }

    public void addItem(AmazonItem item){
        item.addObserver(myWebSite);
        storeRoom.add(item);
    }

    public void removeItem(AmazonItem item){
        item.deleteObserver(myWebSite);
        storeRoom.remove(item);
    }

    public AmazonItem getItemByName(String itemName){
        for (AmazonItem item : storeRoom) {
            if(item.getItemName().equalsIgnoreCase(itemName)){
                return item;
            }
        }
        return null;
    }

    public void orderItem(String itemName){
        AmazonItem item = getItemByName(itemName);
        if(item.getItemCount() != 0)
            item.decrementCount();
    }

    public void returnItem(String itemName){
        AmazonItem item = getItemByName(itemName);
        item.incrementCount();
    }


}
