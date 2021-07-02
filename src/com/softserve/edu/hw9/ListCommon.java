package com.softserve.edu.hw9;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListCommon {
    public static void main(String[] args) {
        List<Integer> lst1 = Arrays.asList(1, 2, 3, 6);
        List<Integer> lst2 = Arrays.asList(4, 5, 6, 1, 2, 3);

        Set<Integer> similar = new HashSet<>(lst1);
        similar.retainAll( lst2 );
        System.out.println(similar);
    }

}
