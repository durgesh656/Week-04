package generics.smart_werehouse_management_system;

public class Electronics  extends WarehouseItem {
    String brand;
    Electronics(String brand, String name, double price){
        super(name,price);
        this.brand= brand;
    }

    @Override
    void displayWarehouseItem() {
        System.out.println("Product name: "+getName()+"\nProduct price: "+getPrice()+"\nProduct Brand: "+brand);
    }

}
