package gr.aueb.cf.ch19.maps;

public class ProductTwo { //implements Comparable<Product> {
    private String id;
    private String description;
    private double price;
    private int quantity;

    public ProductTwo() {}

//    public Product(String description, double price, int quantity) {
//        this.description = description;
//        this.price = price;
//        this.quantity = quantity;
//    }


    public ProductTwo(String id, String description, double price, int quantity) {
        this.id = id;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "product{" +
                "description='" + description + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

//    @Override
//    public int compareTo(Product that) {
//        return this.description.compareTo(that.description); // Ascending sorting
//    }


//    @Override
//    public int compareTo(Product o) {
//        return this.quantity - o.quantity;
//    }


//    @Override
//    public int compareTo(Product o) {
//        return Double.compare(this.price, o.price);
//    }
}
