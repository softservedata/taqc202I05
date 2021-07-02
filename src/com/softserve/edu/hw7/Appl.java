package com.softserve.edu.hw7;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class Appl {
    public static void main(String[] args) {
        Figure[] figures = {new Rectangle(3, 5.5),
                new Rectangle(3.8, 4),
                new Square(5),
                new Square(5.6),
                new Square(8.7)};

        System.out.println("Sorted: " + ArrayUtils.isSorted(figures));
        System.out.println("Sorting...");
        Arrays.sort(figures);
        System.out.println("Sorted: " + ArrayUtils.isSorted(figures));
    }
}
