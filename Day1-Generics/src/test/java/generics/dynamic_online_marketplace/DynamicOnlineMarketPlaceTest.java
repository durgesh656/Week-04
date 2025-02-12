package generics.dynamic_online_marketplace;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DynamicOnlineMarketPlaceTest {
    BookCategory book = new BookCategory();
    ClothCategory cloth=new ClothCategory();
    GadgetCategory gadget = new GadgetCategory();

    Product<BookCategory> bookCategoryProduct=new Product<>("The the sky",200,book);
    Product<ClothCategory> clothCategoryProduct=new Product<>("Shirt",2000,cloth);
    Product<GadgetCategory> gadgetCategoryProduct=new Product<>("SmartWatch",2500,gadget);

    ProductCatalog<BookCategory> productCatalog=new ProductCatalog<>();
    ProductCatalog<ClothCategory> productCatalog1=new ProductCatalog<>();
    ProductCatalog<GadgetCategory> productCatalog2=new ProductCatalog<>();

    @Test
    void test1(){
        productCatalog.addProduct(bookCategoryProduct);
        productCatalog1.addProduct(clothCategoryProduct);
        productCatalog2.addProduct(gadgetCategoryProduct);
        assertEquals(book,bookCategoryProduct.getCategory());
        assertEquals("Shirt",clothCategoryProduct.getName());
        assertEquals(2500,gadgetCategoryProduct.getPrice());
    }
}
