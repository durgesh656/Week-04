package generics.dynamic_online_marketplace;

public class Discount {
    // Method for calculating  the discount
    static public <T extends Product> void calculateDiscount(T product, double discountPercentage) {
        double discountAmount = product.getPrice() * (discountPercentage / 100);
        System.out.println("Price after discount is: " + (product.getPrice() - discountAmount));
    }
}
