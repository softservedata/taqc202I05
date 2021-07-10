package com.softserve.edu.utils;

import java.util.List;

public interface Combiner<T> {
    List<T> combineByCommonElements(List<T> first, List<T> second);
}
