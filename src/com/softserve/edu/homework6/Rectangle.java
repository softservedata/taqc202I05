package com.softserve.edu.homework6;

public class Rectangle implements Figure {

    double lengthRectangle;
    double widthRectangle;

    public Rectangle(double lenghtRectangle, double widthRectangle) {
        this.lengthRectangle = lenghtRectangle;
        this.widthRectangle = widthRectangle;
    }

    public double getLenghtRectangle() {
        return lengthRectangle;
    }

    public void setLenghtRectangle(double lenghtRectangle) {
        this.lengthRectangle = lenghtRectangle;
    }

    public double getWidthRectangle() {
        return widthRectangle;
    }

    public void setWidthRectangle(double widthRectangle) {
        this.widthRectangle = widthRectangle;
    }

    @Override
    public double perimeter() {
        System.out.println("Perimeter of the rectangle is " + (this.lengthRectangle + this.widthRectangle) * 2);
        return (this.lengthRectangle + this.widthRectangle) * 2;
    }

    @Override
    public int compareTo(Figure o) {
        return (int) perimeter();
    }
}
