package generics.dynamic_online_marketplace;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog <T extends ProductCategory> {
    List<Product<T>> productsList = new ArrayList<>();

    public void addProduct(Product<T> product) {
        productsList.add(product);
    }

    public void removeProduct(Product<T> product) {
        productsList.remove(product);
    }

    public List<Product<T>> getProductList(){
        return productsList;
    }

    public void getProduct(List<? extends Product> productsList) {
        for (Product<T> product : productsList) {
            Discount.calculateDiscount(product,10);
            product.displayProducts();

        }
    }
}
