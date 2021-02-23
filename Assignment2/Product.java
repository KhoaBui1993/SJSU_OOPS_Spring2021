/*
Author: Khoa Bui
Version: 0.1
Description: Exercise 4,Product class. Define and implement an immutable class Product.
*/
public final class Product {
    final String ProductName;
    final String ProductDes;
    final Double Price;
    final int MaximumQuantity;

    public Product(String productName, String productDes, Double price, int maximumQuantity) {
        ProductName = productName;
        ProductDes = productDes;
        Price = price;
        MaximumQuantity = maximumQuantity;
    }

    public String getProductName() {
        return ProductName;
    }
    public String getProductDes() {
        return ProductDes;
    }
    public Double getPrice() {
        return Price;
    }
    public int getMaximumQuantity() {
        return MaximumQuantity;
    }
    //override toString method
    @Override
    public String toString() {
        return "Product:"+ ProductName + ", description" + ProductDes +", price=" + Price + ", MaximumQuantity=" + MaximumQuantity +"\n";
    }
}
