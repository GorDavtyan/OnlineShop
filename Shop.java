package codesection1.OInlineShop;

import java.util.ArrayList;
import java.util.List;

/**

 A class representing a shop, which contains a list of buyers and a list of products.
 */
public class Shop {
    private List<Buyer> buyers;
    private List<Product> productList;

    /**
     * Constructs a new Shop object with empty lists of buyers and products.
     */
    public Shop() {
        buyers = new ArrayList<>();
        productList = new ArrayList<>();
    }

    /**
     * Returns a list of all the buyers in the shop.
     * @return a list of all the buyers in the shop
     */
    public List<Buyer> getBuyers() {
        return buyers;
    }

    /**
     * Adds a new product to the shop's list of products.
     * @param product the product to add
     */
    public void addProduct(Product product) {
        productList.add(product);
    }

    /**
     * Adds a new buyer to the shop's list of buyers.
     * @param buyer the buyer to add
     */
    public void addBuyer(Buyer buyer) {
        buyers.add(buyer);
    }

    /**
     * Displays information about all the products in the shop.
     */
    public void displayProducts() {
        for (Product i : productList) {
            System.out.println(i.getOwnId() + " " + i.getName() + " " + i.getDescription() + " " + i.getPrice());
        }
    }
}
