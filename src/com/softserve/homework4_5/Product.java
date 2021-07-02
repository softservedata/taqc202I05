package com.softserve.homework4_5;

import java.util.Objects;

public class Product {
    private String prodName;
    private double price;

    //Constructor
    public Product(String prodName, double price) {
        this.prodName = prodName;
        this.price = price;
    }

    //getters/setters
    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //toString method
    @Override
    public String toString() {
        return "Product{" + "prodName='" + prodName + '\'' + ", price='" + price + '\'' + '}';
    }

    //equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(prodName, product.prodName) && Objects.equals(price, product.price);
    }

    //hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(prodName, price);
    }

    public static void main(String[] args) {
        /*Product inst1 = new Product("Potato", 12.55);
        Product inst2 = new Product("Tomato", 30.33);
        Product inst3 = new Product("Banana", 35.99);
        Product inst4 = new Product("Apple", 21.49);
        Product inst5 = new Product("Lemon", 46.01);

        List<Double> list = Arrays.asList(inst1.getPrice(), inst2.getPrice(), inst3.getPrice(), inst4.getPrice(), inst5.getPrice());
        Double max = Collections.max(list);
        System.out.println("The maximum price is: " + max);*/

        /*Homework 4
        Product[] products = new Product[5];
        products[0] = new Product("Potatoes", 12.55);
        products[1] = new Product("Tomatoes", 30.33);
        products[2] = new Product("Tomatoes", 35.93);
        products[3] = new Product("Bananas", 32.99);
        products[4] = new Product("Lemons", 46.01);

        for (int i = 0; i < products.length; i++) {
            for (int j = i; j < products.length; j++) {
                if (i != j && products[i].getProdName().equals(products[j].getProdName()))
                    System.out.println("Duplicated products are: " + products[i].getProdName());
            }
        }*/

        //Homework 5
        Product[] product = new Product[10];
        product[0] = new Product("Potatoes", 11.55);
        product[1] = new Product("Tomatoes", 30.33);
        product[2] = new Product("Tomatoes", 12.03);
        product[3] = new Product("Bananas", 32.99);
        product[4] = new Product("Lemons", 46.01);
        product[5] = new Product("Apples", 23.55);
        product[6] = new Product("Strawberries", 100.00);
        product[7] = new Product("Apples", 35.00);
        product[8] = new Product("Bread", 7.50);
        product[9] = new Product("Limes", 24.98);

        int cost = 0;
        double minPrice = product[cost].getPrice();
        String name = product[cost].getProdName();
        for (int i = 0; i < product.length; i++) {
            if (product[i].getPrice() < minPrice) {
                cost = i;
                minPrice = product[cost].getPrice();
                name = product[cost].getProdName();
            }
        }
        System.out.print("Minimum price is " + minPrice +  "UAN, and this is " + name + ".");
    }
}