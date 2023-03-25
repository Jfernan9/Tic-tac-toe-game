package Ch_Object;

public class Product {

    String productName;
    double labor;
    double totalPrice;
    double unitPrice;
    int Qty;


    public Product(String productName, double totalPrice, double unitPrice, int qty) {
        this.productName = productName;
        this.totalPrice = totalPrice;
        this.unitPrice = unitPrice;
        Qty = qty;
    }


    public void setLabor(double labor) {
        this.labor = labor;
    }

    public double getLabor() {
        return labor;
    }

    public double get() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQty() {
        return Qty;
    }

    public void setQty(int qty) {
        Qty = qty;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = unitPrice * Qty;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                "unit price" + unitPrice +
                ", totalPrice=" + unitPrice * Qty
                + Qty + '}';
    }
}