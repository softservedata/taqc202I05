package com.softserve.homework7;

public class Square implements Figure {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int calculatePerimeter() {
        return side * 4;
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
