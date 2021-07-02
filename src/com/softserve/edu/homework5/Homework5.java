package com.softserve.edu.homework5;

import com.softserve.edu.homework4.Product;

import java.util.Arrays;
import java.util.Comparator;

public class Homework5 {

    public static void main(String[] args) {

        Product firstProduct = new Product("greenApple", 12);
        Product secondProduct = new Product("meat", 180);
        Product thirdProduct = new Product("apple", 14);
        Product fourthProduct = new Product("pizza", 67);
        Product fifthProduct = new Product("bread", 12);
        Product sixthProduct = new Product("phone", 5700);
        Product seventhProduct = new Product("laptop", 18500);
        Product eighthProduct = new Product("pillow", 300);
        Product ninthProduct = new Product("ice cream", 35);
        Product tenth = new Product("cheese", 210);

        Product[] products = new Product[10];
        products[0] = firstProduct;
        products[1] = secondProduct;
        products[2] = thirdProduct;
        products[3] = fourthProduct;
        products[4] = fifthProduct;
        products[5] = sixthProduct;
        products[6] = seventhProduct;
        products[7] = eighthProduct;
        products[8] = ninthProduct;
        products[9] = tenth;

        Arrays.sort(products, Comparator.comparing(Product::getCost));

        System.out.println("List of products from min to max " + Arrays.deepToString(products));

        System.out.println("This product has min cost is " + products[0].getName());

        System.out.println("There is the list of products with min cost ");

        for(Product prod:products ){
            if (prod.getCost() == products[0].getCost()){
                System.out.println(prod.getName());
            }
        }

        System.out.println("There is the list of products with min cost ");

        for(int i=0; i < products.length; i++ ){
            if (products[i].getCost() == products[0].getCost()){
                System.out.println(products[i].getName());
            }
        }
    }
}
