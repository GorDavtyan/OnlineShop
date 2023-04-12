package codesection1.OInlineShop;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    // The owner of the shopping cart
    private Buyer owner;

    //The list of items in the cart
    private List<ShoppingCartItem> items;

    // Constructor that takes a buyer and initializes the owner and items fields
    public ShoppingCart(Buyer owner) {
        this.owner = owner;
        items = new ArrayList<>();
    }

    // Getter method for the owner field
    public Buyer getOwner() {
        return owner;
    }

    // Getter method for the items field
    public List<ShoppingCartItem> getItems() {
        return items;
    }

    // Method for adding an item to the cart
    public void addItem(ShoppingCartItem item) {
        items.add(item);
    }

    // Method for removing an item from the cart
    public void removeItem(ShoppingCartItem item) {
        items.remove(item);
    }

    // Method for updating the quantity of an item in the cart
    public void updateItemQuantity(ShoppingCartItem item, int quantity) {
        item.setQuantity(quantity);
    }

    // Method for calculating the total price of all items in the cart
    public double getTotalPrice() {
        double result = 0;
        for (ShoppingCartItem item : items) {
            result += item.getProduct().getPrice() * item.getQuantity();
        }
        return result;
    }

    // Method for emptying the cart
    public void emptyCart() {
        items.clear();
    }
}