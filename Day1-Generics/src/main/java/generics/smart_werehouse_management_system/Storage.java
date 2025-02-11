package generics.smart_werehouse_management_system;

import java.util.ArrayList;
import java.util.List;

public class Storage <T extends WarehouseItem>{
    private List<T> itemList = new ArrayList<>();

    public void addItem(T item) {
        itemList.add(item);
    }

    public void removeItem(T item){
        itemList.remove(item);
    }

    public List<T> getItemList(){
        return itemList;
    }

    public static void displayItems(List<? extends WarehouseItem> itemList) {
        for (WarehouseItem item : itemList) {
            item.displayWarehouseItem();
            System.out.println("-------------------------------------------------");
        }
    }


}
