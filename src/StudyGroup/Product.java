package StudyGroup;

public class Product {
    String name;
    double price;
    int qty;

    public Product(String name, double price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public static void main(String[] args) {
        //    String nam = "Jesus";
        Product myProduct = new Product("Nic", 45.2,65);
//    Product jazz = new Product("Jesus",23,35);
//    String mystring = "jesus";

        myProduct.setName("Joe");

    }

}

