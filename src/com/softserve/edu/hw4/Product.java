package com.softserve.edu.hw4;

import java.nio.file.FileSystemNotFoundException;
import java.util.Arrays;
import java.util.Objects;

public class Product {
    String name;
    int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && name.equals(product.name);
    }

    public static void main (String[] args) {
//        Product prod1 = new Product("apple", 5);
//        Product prod2 = new Product("carrot", 3);
//        Product prod3 = new Product("potato", 10);
//        Product prod4 = new Product("apple", 5);
//        Product prod5 = new Product("cucumber", 1);

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
        System.out.println("Найдорожчий продукт - " + products[maxcounter-1].getName() + ". вартує " + max + " грн");

        int min = products[0].getPrice();
        int mincounter = 0;
        for (int i = 0; i < products.length; i++) {
            if ((products[i].getPrice() < min)) {
                min = products[i].getPrice();
                mincounter++;
            }
        }
        System.out.println("Найдешевший продукт - " + products[mincounter+1].getName() + ". вартує " + min + " грн");

        for (int i = 0; i < products.length; i++) {
            for (int j = i; j < products.length; j++ ) {
                if (i != j && products[i].equals(products[j])) {
                    System.out.println("Продукти, що повторюються - " + products[i].getName());
                }
            }
        }
    }
}
