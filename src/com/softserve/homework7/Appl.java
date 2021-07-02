package com.softserve.homework7;

import java.util.Arrays;

public class Appl {
    public static void main(String[] args) {

        Figure[] figures = new Figure[5];
        figures[0] = new Rectangle(5, 4);
        figures[1] = new Rectangle(6, 9);
        figures[2] = new Square(5);
        figures[3] = new Square(8);
        figures[4] = new Square(3);

        for (int i = 0; i < 5; i++) {
            System.out.println("Perimeter of " + (i+1) + " figure is " +  figures[i].calculatePerimeter());
        }

        Arrays.sort(figures);
        System.out.println("Sorted array");
        for (int i = 0; i < 5; i++) {
            System.out.println("Perimeter of " + (i+1) + " figure is " +  figures[i].calculatePerimeter());
        }
    }
}
