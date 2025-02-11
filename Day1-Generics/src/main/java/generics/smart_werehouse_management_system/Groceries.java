package generics.smart_werehouse_management_system;

public class Groceries extends WarehouseItem {

    private String brand;
    private String expiryDate;

    public Groceries(String brand,String expiryDate,String name, double price){
        super(name,price);
        this.brand=brand;
        this.expiryDate=expiryDate;
    }


    @Override
    void displayWarehouseItem() {
        System.out.println("Product name: "+getName()+"\nProduct price: "+getPrice()+"\nProduct Brand: "+brand+"\nProduct Expiry Date: "+expiryDate);

    }
}
