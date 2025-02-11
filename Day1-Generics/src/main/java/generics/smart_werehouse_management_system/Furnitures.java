package generics.smart_werehouse_management_system;

public class Furnitures extends WarehouseItem {
    private String material;
    Furnitures(String material,String name,double price){
        super(name,price);
        this.material=material;
    }

    @Override
    void displayWarehouseItem() {
        System.out.println("Product name: "+getName()+"\nProduct price: "+getPrice()+"\nProduct Material: "+material);
    }

}
