package org.example;

import org.example.data.IVendingMachine;
import org.example.model.Product;
import org.example.data.VendingMachine;
import org.example.model.Bubble_gum;
import org.example.model.Chocolate;
import org.example.model.Marshmallows;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {



        Product[] products = {
                new Bubble_gum(1,20,"bubble gum"),
                new Chocolate(2,50,"chocolate"),
                new Marshmallows(3,10,"marshmallows")
        };

        IVendingMachine vendingMachine = new VendingMachine(products);
        vendingMachine.addCurrency(100);
        Product bubble_gum = vendingMachine.request(1);
        System.out.println(bubble_gum.use());
        System.out.println(vendingMachine.getBalance());

    }
}
