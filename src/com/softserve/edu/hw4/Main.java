package com.softserve.edu.hw4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Product milk = new Product("Milk", 5.50);
        Product bread = new Product("Bread", 2.60);
        Product water = new Product("Water", 1.50);
        Product milk1 = new Product("Milk", 5.50);
        Product water1 = new Product("Water", 1.50);

        List<Product> productList = Arrays.asList(milk, bread, water, milk1, water1);

        Product productWithHighestPrice = productList.stream()
                .max(Comparator.comparing(Product::getPrice))
                .orElseThrow(NoSuchElementException::new);

        System.out.println("The product with the highest price:" + productWithHighestPrice);

        Set<Product> duplicates = productList.stream().filter(i -> Collections.frequency(productList, i) > 1)
                .collect(Collectors.toSet());

        System.out.println("Duplicate products: " + duplicates);

        Map<Character, List<Product>> map = productList.stream()
                .collect(Collectors.groupingBy(v -> v.getName().charAt(0)));
        System.out.println(map);

        Map<Character, Product> map1 = productList.stream()
                .collect(Collectors.toMap(v -> v.getName().charAt(0),
                        Function.identity(),
                        BinaryOperator.maxBy(Comparator.comparing(Product::getPrice))));
        System.out.println(map1);
    }
}
