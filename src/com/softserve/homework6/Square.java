package com.softserve.homework6;

import java.util.Objects;

public class Square implements Figure {
    private double length;

    public Square(double length){
        System.out.println("Constructor Square");
        this.length=length;
    }

    public double getPerimeter() {
      //  System.out.println("Calculate perimeter of Square: ");
            return 4 * length;
        }

    @Override
    public int compareTo(Figure other) {
        return (int) (getPerimeter() - other.getPerimeter());
    }

    @Override
    public String toString() {
        return "Square [length=" + length + "]";
    }

    public double getLength() {
        return length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.length, length) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length);
    }



    // P = 4a
}
