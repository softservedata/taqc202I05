package com.softserve.edu.homework7;

import com.softserve.edu.homework6.Shape;
import com.softserve.edu.homework6.shapes.Rectangle;
import com.softserve.edu.homework6.shapes.Square;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Rectangle(),
                new Rectangle(5, 8),
                new Square(4),
                new Square(6),
                new Square(9),
        };
//        Arrays.sort(shapes);
        boolean isSorted = true;
        for (int i = 0; i < shapes.length - 1; i++) {
            int compareBySize = shapes[i].compareTo(shapes[i + 1]);
            if (compareBySize > 0) {
                isSorted = false;
            }
        }
        System.out.println("Is array of shapes sorted: " + isSorted);
        System.out.println("Array: " + Arrays.toString(shapes));
    }
}
