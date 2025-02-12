package generics.dynamic_online_marketplace;

public class Main {
    public static void main(String[] args) {
        // Creating the categories
        BookCategory book = new BookCategory();
        ClothCategory cloth = new ClothCategory();
        GadgetCategory gadget = new GadgetCategory();

        // Create a product of category book
        Product<BookCategory> book1 = new Product<>("Python Programming",2000,book);
        Product<BookCategory> book2 = new Product<>("Java Programming",1700,book);
        Product<BookCategory> book3 = new Product<>("C++ programming",1500,book);

        // Create the product of category  clothes
        Product<ClothCategory> cloth1 = new Product<>("Shirt",2000,cloth);
        Product<ClothCategory> cloth2 = new Product<>("T-Shirt",1500,cloth);
        Product<ClothCategory> cloth3 = new Product<>("Jacket",5000,cloth);

        // Create a product of category gadget
        Product<GadgetCategory> gadget1 = new Product<>("Power Bank",2000,gadget);
        Product<GadgetCategory> gadget2 = new Product<>("Smart Watch",2500,gadget);
        Product<GadgetCategory> gadget3 = new Product<>("Charger",1500,gadget);

        // Defining the catalog of book,gadget and clothes
        ProductCatalog<BookCategory> bookCatalog = new ProductCatalog<>();
        ProductCatalog<ClothCategory> clothCatalog = new ProductCatalog<>();
        ProductCatalog<GadgetCategory> gadgetCatalog = new ProductCatalog<>();

        // Add the product into the book catalog
        bookCatalog.addProduct(book1);
        bookCatalog.addProduct(book2);
        bookCatalog.addProduct(book3);

        // Add the product into the cloth category
        clothCatalog.addProduct(cloth1);
        clothCatalog.addProduct(cloth2);
        clothCatalog.addProduct(cloth3);

        // Add the product into the category of gadget
        gadgetCatalog.addProduct(gadget1);
        gadgetCatalog.addProduct(gadget2);
        gadgetCatalog.addProduct(gadget3);


//        // Utility to calculate the discount amount
//        Discount discount = new Discount();
//        discount.calculatDiscount(gadget1,10);

       bookCatalog.getProduct(bookCatalog.getProductList());

       clothCatalog.getProduct(clothCatalog.getProductList());
       gadgetCatalog.getProduct(gadgetCatalog.getProductList());


    }
}


