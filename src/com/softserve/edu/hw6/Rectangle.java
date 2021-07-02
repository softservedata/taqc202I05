package com.softserve.edu.hw6;

public class Rectangle implements Figure {
    int w = 0, l = 0;
    @Override
    public String toString() {
        return "Прямокутник{" +
                "ширина = " + w +
                ", довжина = " + l +
                '}';
    }
    public Rectangle(int w, int l) {
        this.w = w;
        this.l = l;
    }
    @Override
    public int perimeter() {
        return (w + l) * 2;
    }

    @Override
    public int compareTo(Figure diff) {
        return (perimeter() - diff.perimeter());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.l, l) == 0 && Double.compare(rectangle.w, w) == 0;
    }
}
