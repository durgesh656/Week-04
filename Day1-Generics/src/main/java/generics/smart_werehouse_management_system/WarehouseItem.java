package generics.smart_werehouse_management_system;

public abstract class WarehouseItem {

    private String name;
    private double price;

    WarehouseItem(String name, double price){
        this.name=name;
        this.price=price;
    }


    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    abstract void displayWarehouseItem();
}
