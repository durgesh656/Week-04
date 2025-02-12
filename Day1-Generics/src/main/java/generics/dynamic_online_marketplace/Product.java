package generics.dynamic_online_marketplace;

public class Product<T extends ProductCategory> {
    private String name;
    private double price;
    private T category;

    Product(String name, double price, T category){
        this.name = name;
        this.price = price;
        this.category = category;

    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public T getCategory(){
        return category;
    }

    public void displayProducts(){
        System.out.println("Original Price of the product:- " + price+
                "\nName of the product:- " + name +
                "\nCategory Name:- " + category.getCategory()
        );
        System.out.println("----------------------------------");
    }
}
