package org.example.data;

import org.example.model.Product;

import java.util.Arrays;

public class VendingMachine implements IVendingMachine{
    //fields
    public static final  int[] VALID_MONEYS = {1, 2, 5, 10, 20, 50, 100, 200, 500, 1000};
    Product[] products;
    int depositPool;


    //Constructor
    public VendingMachine(Product[] products){
        this.products = products;
    }

    public void addCurrency(int amount) {
        for(int validMoney : VALID_MONEYS){
            if(amount == validMoney ){
                depositPool += amount;
            }
        }
    }

    public int getBalance() {
        return  depositPool;
    }

    public Product request(int id) {
        for(Product product : products){
            if(product.getId() == id) {
                if (product.getPrice() <= depositPool) {
                    double temp = depositPool - product.getPrice();
                  depositPool = (int)temp;
                    return product;
                }
            }
        }
        throw  new RuntimeException("Product try to buy is expensive,");
    }

    public int endSession() {
        int temp = depositPool;
        depositPool = 0;
        return temp;
    }

    StringBuilder stringBuilder = new StringBuilder();
    public String getDescription(int id) {
        for (Product product : products){
            if(product.getId() == id){
                stringBuilder.append(product.examine()).append(" price: "+product.getPrice());
            }
        }
        return stringBuilder.toString();
    }

    public String[] getProducts() {
        if(products == null) throw  new IllegalArgumentException("the product is empty");
        String[] productDescriArr = new String[0];

        for (Product product : products){
            productDescriArr = Arrays.copyOf(productDescriArr, productDescriArr.length +1);
            productDescriArr[productDescriArr.length -1] =  "Product Id: "+product.getId() +" Product Name "+product.getProductName()+" Product price "+product.getPrice();
        }
        return productDescriArr;
    }
}
