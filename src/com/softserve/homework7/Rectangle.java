package com.softserve.homework7;

public class Rectangle implements Figure {

    private int width;
    private int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public int calculatePerimeter() {
        return (length + width) * 2;
    }

    @Override
    public int compareTo(Figure figure){
        if (figure.calculatePerimeter() > this.calculatePerimeter()){
            return 1;
        } else if (figure.calculatePerimeter() < this.calculatePerimeter()){
            return -1;
        }
        return 0;
    }
}