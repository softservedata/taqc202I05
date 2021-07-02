package com.softserve.edu.hw7;

import com.softserve.edu.hw6.Figure;
import com.softserve.edu.hw6.Rectangle;
import com.softserve.edu.hw6.Square;

public class CompareTO {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        figures[0] = new Rectangle(2,2);
        figures[1] = new Rectangle(3,3);
        figures[2] = new Square(4);
        figures[3] = new Square(9);
        figures[4] = new Square(6);

        boolean figuresSorted = true;
        for (int i = 0; i < figures.length - 1; i++) {
            int perimeter = figures[i].compareTo(figures[i + 1]);
            if (perimeter <= 0) {
                figuresSorted = true;
            }
            if (perimeter > 0) {
                figuresSorted = false;
                break;

            }
        }

        for (int i = 0; i < figures.length; i++) {
            System.out.print("\nФігура " + (i + 1) + " " + figures[i] +   ".  Периметр =  " +  figures[i].perimeter());
        }

        if (figuresSorted == true) {
            System.out.println("\nФігури посортовані");
        }
        else {System.out.println("\nФігури не посортовані");}
    }
}
