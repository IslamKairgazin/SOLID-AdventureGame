package items;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {
    private List<String> items = new ArrayList<>();

    public void addItem(String item) { items.add(item); }

    public void useItem(String item) {
        if (items.remove(item)) {
            System.out.println("Using item: " + item);
        } else {
            System.out.println("Item not found!");
        }
    }

    @Override
    public String toString() { return items.toString(); }
}
