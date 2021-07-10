package com.softserve.edu.homework4;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Product {
    private static final BigDecimal DEFAULT_PRICE = new BigDecimal(24.999);
    private static final String DEFAULT_NAME = "R2D2";
    private String name;
    private BigDecimal price;

    public Product() {
        this.name = DEFAULT_NAME;
        this.price = DEFAULT_PRICE;
    }

    public Product(String name) {
        this.name = name;
        this.price = DEFAULT_PRICE;
    }

    public Product(BigDecimal price) {
        this.name = DEFAULT_NAME;
        this.price = price;
    }

    public Product(String name, double price) {
        setName(name);
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = new BigDecimal(price);
    }

    @Override
    public String toString() {
        return "{" + name + ": " + price.doubleValue() + "}";
    }

    @Override
    public int hashCode() {
        final int prime = 17;
        int result = prime + ((name == null ? 0 : name.hashCode()));
        result = result * prime + ((price == null ? 0 : price.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Product) {
            return this.name.equals(((Product) o).name) &&
                    this.price.doubleValue() == ((Product) o).price.doubleValue();
        }
        return false;
    }

    public static void main(String ... args) {
        Product prod1 = new Product("p1", 129.99);
        Product prod2 = new Product("p2", 129.999);
        Product prod3 = new Product("p3", 12.98);
        Product prod4 = new Product("p4", 12.99);
        Product prod5 = new Product("p4", 12.99);

        List<Product> productList = new ArrayList<>();

        Collections.addAll(productList, prod1, prod2, prod3, prod4, prod5);

        System.out.println("Name of product with highest price:");

        System.out.println(productList.stream()
                .max(Comparator.comparing(Product::getPrice))
                .get()
                .getName());

        System.out.println("Identical products:");
        productList.stream()
                .filter(p -> Collections.frequency(productList, p) > 1)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("Original list:");
        System.out.println(productList);
    }
}
