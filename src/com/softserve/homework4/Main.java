package com.softserve.homework4;

public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[6];
        products[0] = new Product("Bread", 15.5f);
        products[1] = new Product("Milk", 10.5f);
        products[2] = new Product("Egg", 0.75f);
        products[3] = new Product("Meat", 150.6f);
        products[4] = new Product("Bread", 15.5f);
        products[5] = new Product("Milk", 10.5f);
        findDuplicate(products);
        findMaxPrice(products);
    }

    public static void findDuplicate(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            for (int j = i + 1; j < products.length; j++) {
                if (products[i].equals(products[j])) {
                    System.out.println("Duplicated products: " + products[i]);
                }
            }
        }
    }

    public static void findMaxPrice(Product[] products) {
        Product maxPrice = products[0];
        for (int i = 1; i < products.length; i++) {
            if (maxPrice.getPrice() < products[i].getPrice()) {
                maxPrice = products[i];
            }
        }
        System.out.println("Max price product: " + maxPrice.getName());
    }
}
