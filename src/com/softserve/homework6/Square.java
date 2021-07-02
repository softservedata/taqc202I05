package com.softserve.homework6;

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
}
