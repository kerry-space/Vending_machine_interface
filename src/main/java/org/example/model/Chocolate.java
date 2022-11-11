package org.example.model;

public class Chocolate  implements Product {

    private int id;
    private double price;
    private String productName;

    //constructor
    public Chocolate( int id, double price, String productName){
        this.id = id;
        this.price = price;
        this.productName = productName;
    }
    @Override
    public String examine() {
        return "{ id: " + getId() + ", Chocolate: " + getProductName() + " }";
    }

    @Override
    public String use() {
        return "Here is Your Chocolate "+getProductName();
    }

    @Override
    public int getId() {
        return this.getId();
    }

    @Override
    public String getProductName() {
        return this.productName;
    }

    @Override
    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }
}
