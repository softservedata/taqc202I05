package com.softserve.edu.utils;

import java.util.List;

public interface Generator<T> {
    List<T> generate(int size, int bound);
}
