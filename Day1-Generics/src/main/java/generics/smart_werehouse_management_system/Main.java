package generics.smart_werehouse_management_system;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Samsung", "Samsung Mobile", 100000));
        electronicsStorage.addItem(new Electronics("Realme","Realme Mobile",15000));
        electronicsStorage.addItem(new Electronics("Redmi","Redmi Laptop",150000));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Parle","11-02-2025","parle 20-20",20));
        groceriesStorage.addItem(new Groceries("Amul","11-02-2025","Amul milk",70));

        Storage<Furnitures> furnituresStorage = new Storage<>();
        furnituresStorage.addItem(new Furnitures("Wood","Bad",10000));
        furnituresStorage.addItem(new Furnitures("Wood","chair",5000));


        Storage.displayItems(electronicsStorage.getItemList());
        Storage.displayItems(groceriesStorage.getItemList());
        Storage.displayItems(furnituresStorage.getItemList());
    }
}
