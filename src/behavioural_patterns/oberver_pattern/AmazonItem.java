package behavioural_patterns.oberver_pattern;

import java.util.Observable;

public class AmazonItem extends Observable {
    private int itemCount;
    private String itemName;

    public AmazonItem(int itemCount, String itemName) {
        this.itemCount = itemCount;
        this.itemName = itemName;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void incrementCount(){
        itemCount++;
        informAll();
    }

    private void informAll(){
        setChanged();
        notifyObservers();
    }
    public void decrementCount(){
        if(itemCount!=0)
            itemCount--;
        informAll();
    }

    public String getItemName() {
        return itemName;
    }
}
