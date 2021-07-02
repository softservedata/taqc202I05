package com.softserve.edu.homework6;

public class Square implements Figure {

    double lengthSideSquare;

    public Square(double lengthSideSquare) {
        this.lengthSideSquare = lengthSideSquare;
    }

    public double getLengthSideSquare() {
        return lengthSideSquare;
    }

    public void setLengthSideSquare(double lengthSideSquare) {
        this.lengthSideSquare = lengthSideSquare;
    }


    @Override
    public double perimeter() {
        System.out.println("Perimeter of the square is " + this.lengthSideSquare * 4);
        return this.lengthSideSquare * 4;
    }

    @Override
    public int compareTo(Figure o) {
        return (int) perimeter();
    }
}
