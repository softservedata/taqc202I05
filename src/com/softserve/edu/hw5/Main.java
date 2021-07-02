package com.softserve.edu.hw5;

import com.softserve.edu.hw4.Product;
import com.softserve.edu.hw6.*;

public class Main {
    public static void main (String[] args) {
        Product[] products = new Product[10];
        products[0] = new Product("яблука", 5);
        products[1] = new Product("морква", 6);
        products[2] = new Product("картопля", 7);
        products[3] = new Product("яблука", 5);
        products[4] = new Product("огірки", 122);
        products[5] = new Product("цибуля", 13);
        products[6] = new Product("буряк", 3);
        products[7] = new Product("помідори", 11);
        products[8] = new Product("банани", 23);
        products[9] = new Product("помідори", 11);

        int max = 0;
        int maxcounter = 0;
        for (int i = 0; i < products.length; i++) {
            if (max < (products[i].getPrice())) {
                max = products[i].getPrice();
                maxcounter++;
            }
        }
        System.out.println("Найдорожчий продукт - " + products[maxcounter - 1].getName() + ". вартує " + max + " грн");

        int min = products[0].getPrice();
        int mincounter = 0;
        for (int i = 0; i < products.length; i++) {
            if ((products[i].getPrice() < min)) {
                min = products[i].getPrice();
                mincounter++;
            }
        }
        System.out.println("Найдешевший продукт - " + products[mincounter + 1].getName() + ". вартує " + min + " грн");

        for (int i = 0; i < products.length; i++) {
            for (int j = i; j < products.length; j++) {
                if (i != j && products[i].equals(products[j])) {
                    System.out.println("Продукти, що повторюються - " + products[i].getName());
                }
            }
        }
    }

}
