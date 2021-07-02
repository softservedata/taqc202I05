package com.softserve.edu.hw6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Appl {
    public static void main(String[] args) {
        Figure[] figures = {new Rectangle(3, 5.5),
                new Rectangle(3.8, 4),
                new Square(5),
                new Square(5.6),
                new Square(8.7)};

        List<Double> listOfPerimeters = Arrays.stream(figures)
                .map(Figure::countPerimeter)
                .collect(Collectors.toList());

        System.out.println("Perimeters of all figures:" + listOfPerimeters);

        List<Double> perimetersOfSquares = Arrays.stream(figures)
                .filter(v -> v instanceof Square)
                .map(Figure::countPerimeter)
                .collect(Collectors.toList());
        System.out.println("Perimeters of squares: " + perimetersOfSquares);

        List<Double> perimeterOfRectangles = Arrays.stream(figures)
                .filter(v -> v instanceof Rectangle)
                .map(Figure::countPerimeter)
                .collect(Collectors.toList());

        System.out.println("Perimeters of rectangles: " + perimeterOfRectangles);

    }
}
