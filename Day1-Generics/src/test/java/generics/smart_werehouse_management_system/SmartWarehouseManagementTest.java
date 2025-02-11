package generics.smart_werehouse_management_system;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmartWarehouseManagementTest {

    Storage<WarehouseItem> warehouseItemStorage=new Storage<>();


    @Test
    void test1(){
        warehouseItemStorage.addItem(new Electronics("Samsung","Samsung Mobile",100000));
        warehouseItemStorage.addItem(new Groceries("Amul","11-02-2025","Amul Milk",70));
        warehouseItemStorage.addItem(new Furnitures("Wood","Chair",5000));
        warehouseItemStorage.addItem(new Electronics("HP","Laptop",50000));

        assertEquals("Samsung Mobile",warehouseItemStorage.getItemList().get(0).getName());
        assertEquals("Laptop",warehouseItemStorage.getItemList().get(3).getName());
        assertEquals("Amul Milk",warehouseItemStorage.getItemList().get(1).getName());
        assertEquals("Chair",warehouseItemStorage.getItemList().get(2).getName());

        System.out.println("Test case pass.");

    }

}
