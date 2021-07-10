package com.softserve.edu.homework5;

import com.softserve.edu.homework4.Product;

import java.util.Arrays;
import java.util.Random;

/**
 * Populate an array  with objects of Product type and print name(s) of element(s) with
 * lowest price to standard output.
 */
public class App {
    public static void main(String[] args) {
        Random rand = new Random();
        Product[] products = new Product[10];
        for (int i = 0; i < products.length; i++) {
            products[i] = new Product("Product 300" + i, rand.nextInt(10));
        }
        Product[] copy = Arrays.copyOf(products, products.length);
        int index = 0;
        Product cheapest = copy[0];
        do {
            if (copy[++index].getPrice().compareTo(cheapest.getPrice()) < 0) {
                cheapest = copy[index];
            }
        } while (index < copy.length - 1);
        for (int i = 0; i < copy.length; i++) {
            if (copy[i].getPrice().equals(cheapest.getPrice())) {
                System.out.println(copy[i].getName());
            }
        }
        System.out.println(Arrays.toString(products));
    }
}
