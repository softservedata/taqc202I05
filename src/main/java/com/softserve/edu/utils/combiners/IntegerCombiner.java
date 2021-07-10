package com.softserve.edu.utils.combiners;

import com.softserve.edu.utils.Combiner;

import java.util.*;

public class IntegerCombiner implements Combiner<Integer> {

    public List<Integer> combineByCommonElements(List<Integer> first, List<Integer> second) {
        List<Integer> result;
        Set<Integer> temp = new HashSet<>(first);
        temp.retainAll(second);
        result = new ArrayList<>(temp);
        return result;
    }
}
