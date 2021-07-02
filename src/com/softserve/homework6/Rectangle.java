package com.softserve.homework6;



import java.util.Objects;

public class Rectangle implements Figure   {
    private double length;
    private double width;


    public Rectangle(double length, double width){
        System.out.println("Constructor Rectangle");
        this.length=length;
        this.width=width;
    }

    public double getPerimeter() {

      //  System.out.println("Calculate perimeter of Rectange: ");
        return 2 * (width + length);
    }

    @Override
    public int compareTo(Figure other) {
        return (int) (getPerimeter() - other.getPerimeter());
    }


    @Override
    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + "]";
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.length, length) == 0 && Double.compare(rectangle.width, width) == 0;
    }


    @Override
    public int hashCode() {
        return Objects.hash(length, width);
    }


    //  P = 2(a + b)
}
