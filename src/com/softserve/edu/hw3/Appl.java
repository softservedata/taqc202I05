package com.softserve.edu.hw3;

import com.softserve.edu.hw4.Product;
import com.softserve.edu.hw6.*;
public class Appl {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        figures[0] = new Rectangle(1,2);
        figures[1] = new Rectangle(2,3);
        figures[2] = new Square(3);
        figures[3] = new Square(4);
        figures[4] = new Square(5);

        for (int i = 0; i < figures.length; i++) {
            if (figures[i] instanceof Rectangle) {
                System.out.println("Периметр  прямокутника = " + figures[i].perimeter());
            } else {
                System.out.println("Периметр квадрата = " + figures[i].perimeter());
            }

        }
    }
}
