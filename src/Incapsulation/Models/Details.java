package Incapsulation.Models;

public class Details {
    private Product product;
    private double count;
    private double discount;

    public Details() {
    }

    public Details(Product product, double count, double discount) {
        this.product = product;
        this.count = count;
        this.discount = discount;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getCount() {
        return count;
    }

    public void setCount(double count) {
        this.count = count;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
