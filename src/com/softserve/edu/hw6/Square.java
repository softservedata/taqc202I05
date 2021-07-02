package com.softserve.edu.hw6;
import java.util.Objects;

public class Square implements Figure {
    int l = 0;

    public Square(int l) {
        this.l = l;
    }

    public int perimeter() {
        return 4 * l;
    }

    @Override
    public int compareTo(Figure diff) {
        return (perimeter() - diff.perimeter());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.l, l) == 0;
    }

    @Override
    public String toString() {
        return "Квадрат{" +
                "довжина = " + l +
                "}";
    }


}

