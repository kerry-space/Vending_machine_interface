package org.example.model;

public class Bubble_gum  implements Product {

    private int id;
    private double price;
    private String productName;

    //constructor
    public Bubble_gum( int id, double price, String productName){
        this.id = id;
        this.price = price;
        this.productName = productName;
    }

    @Override
    public String examine() {
        return "{ id: " + getId() + ", Bubble gum : " + getProductName() + " }";
    }

    @Override
    public String use() {
        return "Your Bubble gum " + getProductName();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
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

    public double getPrice() {

        return this.price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;

    }



}
