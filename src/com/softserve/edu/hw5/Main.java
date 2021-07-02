package com.softserve.edu.hw5;

import com.softserve.edu.hw4.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            productList.add(new Product("product" + i, i + .0));
        }

        Product productWithMinimumPrice = productList.stream()
                .min(Comparator.comparing(Product::getPrice))
                .orElseThrow(NoSuchElementException::new);
        System.out.println("Product with minimal price" + productWithMinimumPrice);
    }
}
