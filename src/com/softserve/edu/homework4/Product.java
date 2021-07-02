package com.softserve.edu.homework4;

import java.util.*;

public class Product {

    private String name;
    private double cost;

    public Product(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.cost, cost) == 0 &&
                Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost);
    }

    public static void main(String[] args) {

        Product firstProduct = new Product("greenApple", 10.23);
        Product secondProduct = new Product("meat", 180);
        Product thirdProduct = new Product("greenApple", 8);
        Product fourthProduct = new Product("pizza", 67);
        Product fifthProduct = new Product("bread", 12);

        List<Product> products = new ArrayList<Product>();
        products.add(firstProduct);
        products.add(secondProduct);
        products.add(thirdProduct);
        products.add(fourthProduct);
        products.add(fifthProduct);

        products.forEach(product -> {
                    product.getCost();
                    product.getName();
                }
        );

        products.sort(Comparator.comparing(Product::getCost).thenComparing(Product::getName));
        Collections.reverse(products);
        System.out.println("Sorted list of product:");
        products.forEach(productSortingMaxCost -> {
                    System.out.println(productSortingMaxCost.getCost() + " " + productSortingMaxCost.getName());
                }
        );

        System.out.println("The biggest cost of these products has - " + products.get(0).getName());

        System.out.print("Duplicate is ");
        if (firstProduct.getName().equals(secondProduct.getName())) {
            System.out.println(firstProduct.getName());
        } else if (firstProduct.getName().equals(thirdProduct.getName())) {
            System.out.println(firstProduct.getName());
        } else if (firstProduct.getName().equals(fourthProduct.getName())) {
            System.out.println(firstProduct.getName().equals(fourthProduct.getName()));
        } else if (firstProduct.getName().equals(fifthProduct.getName())) {
            System.out.println(firstProduct.getName().equals(fourthProduct.getName()));
        }

    }

}
