package com.softserve.edu.hw7;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Square implements Figure {
    double a;

    @Override
    public double countPerimeter() {
        return 4*a;
    }

    @Override
    public int compareTo(Figure o) {
        if (countPerimeter() > o.countPerimeter()) {
            return 1;
        } else if (countPerimeter() < o.countPerimeter()) {
            return -1;
        } else return 0;
    }
}
