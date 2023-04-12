package codesection1.OInlineShop;


public class Product {
    //Static variable indicating the id of the product
    private static int productID = 0;
    //Instance variable for each property of the product
    private int ownId;
    private String name;
    private String description;
    private double price;
    private int stock;


    //Constructor that take name, description and price as arguments
    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
        ++productID;
        ownId = productID;
    }

    // Getter method for the product ID
    public int getProductID() {

        return productID;
    }

    // Getter method for the own ID
    public int getOwnId() {
        return ownId;
    }

    // Setter method for the product ID
    public void setProductID(int productID) {

        this.productID = productID;
    }

    // Getter method for the product name
    public String getName() {

        return name;
    }

    // Setter method for the product name
    public void setName(String name) {

        this.name = name;
    }

    // Getter method for the product description
    public String getDescription() {

        return description;
    }

    // Setter method for the product description
    public void setDescription(String description) {

        this.description = description;
    }

    // Getter method for the product price
    public double getPrice() {

        return price;
    }

    // Setter method for the product price
    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {

        return stock;
    }

    // Setter method for the product price
    public void setStock(int stock) {

        this.stock = stock;
    }
}
