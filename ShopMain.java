package codesection1.OInlineShop;

import java.util.ArrayList;

public class ShopMain {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Product product1 = new Product("Product 1", "Phone", 500);
        Product product2 = new Product("Product 2", "Phone", 500);
        Product product3 = new Product("Product 3", "Phone", 500);
        Product product4 = new Product("Product 4", "Phone", 500);
        Product product5 = new Product("Product 5", "Phone", 500);
        shop.addProduct(product1);
        shop.addProduct(product2);
        shop.addProduct(product3);
        shop.addProduct(product4);
        shop.addProduct(product5);
        shop.displayProducts();
        System.out.println("----------------");
        Buyer buyer1 = new Buyer("Buyer 1", "Buyer");
        Buyer buyer2 = new Buyer("Buyer 2", "Buyer");
        Buyer buyer3 = new Buyer("Buyer 3", "Buyer");
        Buyer buyer4 = new Buyer("Buyer 4", "Buyer");
        Buyer buyer5 = new Buyer("Buyer 5", "Buyer");
        shop.addBuyer(buyer1);
        shop.addBuyer(buyer2);
        shop.addBuyer(buyer3);
        shop.addBuyer(buyer4);
        shop.addBuyer(buyer5);
    }
}
