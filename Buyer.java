package codesection1.OInlineShop;

/**

 The Buyer class represents a buyer in the online shop.
 It contains the buyer's first and last name, as well as a unique ID number.
 Each buyer also has a shopping cart that they can add products to.
 */
public class Buyer {

    // Static variable to keep track of the number of buyers
    private static int buyerID;
    private int ownID;
    private String firstName;
    private String lastName;
    private ShoppingCart shoppingCart = new ShoppingCart(this);;


    /**
     * Constructs a Buyer object with the given first and last name.
     * Assigns a unique ID number to the buyer.
     *
     * @param firstName the first name of the buyer
     * @param lastName the last name of the buyer
     */
    public Buyer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        ++buyerID;
        ownID = buyerID;
    }

    /**
     * Returns the current number of buyers in the online shop.
     *
     * @return the current number of buyers
     */
    public static int getBuyerID() {
        return buyerID;
    }

    /**
     * Sets the current number of buyers in the online shop.
     *
     * @param buyerID the current number of buyers
     */
    public static void setBuyerID(int buyerID) {
        Buyer.buyerID = buyerID;
    }

    /**
     * Returns the first name of the buyer.
     *
     * @return the first name of the buyer
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the buyer.
     *
     * @param firstName the first name of the buyer
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Returns the last name of the buyer.
     *
     * @return the last name of the buyer
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the buyer.
     *
     * @param lastName the last name of the buyer
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Returns the shopping cart of the buyer.
     *
     * @return the shopping cart of the buyer
     */
    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }


    /**
     * Sets the shopping cart of the buyer.
     *
     * @param shoppingCart the shopping cart of the buyer
     */
    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    /**
     * Adds the specified product to the buyer's shopping cart with the specified quantity.
     * If the product is already in the cart, increases the quantity of the product by the specified amount.
     *
     * @param product the product to add to the cart
     * @param quantity the quantity of the product to add to the cart
     */
    public void addProductToCart(Product product, int quantity) {
        for (ShoppingCartItem item : shoppingCart.getItems()) {
            if (item.getProduct().getProductID() == product.getProductID()) {
                item.setQuantity(item.getQuantity() + quantity);
                return;
            }
        }
        ShoppingCartItem ob1 = new ShoppingCartItem();
        ob1.setProduct(product);
        ob1.setQuantity(quantity);
        shoppingCart.addItem(ob1);
    }
}