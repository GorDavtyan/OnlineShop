package codesection1.OInlineShop;

public class ShoppingCartItem {
    // The product associated with the item
    private Product product;

    // The quantity of the item
    private int quantity;

    // Getter method for the product field
    public Product getProduct() {
        return product;
    }

    // Setter method for the product field
    public void setProduct(Product product) {
        this.product = product;
    }

    // Getter method for the quantity field
    public int getQuantity() {
        return quantity;
    }

    // Setter method for the quantity field
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
