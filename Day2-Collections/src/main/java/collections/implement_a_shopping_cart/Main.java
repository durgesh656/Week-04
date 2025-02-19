package collections.implement_a_shopping_cart;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Adding products and prices
        cart.addProduct("Apple", 50);
        cart.addProduct("Banana", 20);
        cart.addProduct("Orange", 40);

        // Adding items to cart
        cart.addToCart("Apple",10);
        cart.addToCart("Banana", 50);
        cart.addToCart("Orange", 30);

        // Display cart and sorted items
        cart.displayCart();
        System.out.println();
        cart.displaySortedByPrice();
    }

}
