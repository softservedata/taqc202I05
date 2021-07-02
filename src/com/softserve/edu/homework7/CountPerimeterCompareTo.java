package com.softserve.edu.homework7;

import com.softserve.edu.homework6.Rectangle;
import com.softserve.edu.homework6.Square;

import java.util.Arrays;

public class CountPerimeterCompareTo {

    public static void main(String[] args) {

        Rectangle firstRectangle = new Rectangle(150, 70);
        Rectangle secondRectangle = new Rectangle(250,100);

        Square firstSquare = new Square(400);
        Square secondSquare = new Square(170);
        Square thirdSquare = new Square(900);

        // the seventh homework

        double [] perimeterFigure = new double[5];
        perimeterFigure[0] = firstRectangle.perimeter();
        perimeterFigure[1] = secondRectangle.perimeter();
        perimeterFigure[2] = firstSquare.perimeter();
        perimeterFigure[3] = secondSquare.perimeter();
        perimeterFigure[4] = thirdSquare.perimeter();

        double [] sortedPerimeterFigure = perimeterFigure;
        Arrays.sort(sortedPerimeterFigure);

        System.out.println("not sorted list " + Arrays.toString(perimeterFigure));
        System.out.println("sorted list " + Arrays.toString(sortedPerimeterFigure));

        boolean isFigureSorted = Arrays.equals(perimeterFigure, sortedPerimeterFigure);

        if(isFigureSorted){
            System.out.println("the array is sorted in ascending order");
        } else {
            System.out.println("the array is not sorted in ascending order");
        }
    }

}
