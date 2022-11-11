package org.example.model;

public class Marshmallows implements Product {
    private int id;
    private double price;
    private String productName;

    //constructor
    public Marshmallows( int id, double price, String productName){
        this.id = id;
        this.price = price;
        this.productName = productName;
    }
    @Override
    public String examine() {
        return "{ id: " + getId() + ", Marshmallow: " + getProductName() + " }";

    }

    @Override
    public String use() {

        return "Here is Your Marshmallow "+getProductName();
    }

    @Override
    public int getId() {
        return this.id;
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
