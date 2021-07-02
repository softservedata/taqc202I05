package com.softserve.edu.hw8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListCompare {
    public static void main( String  [] args ) {
        List<Integer> lst1 = Arrays.asList(1, 2, 1, 4, 3);
        List<Integer> lst2 = Arrays.asList(3, 3, 2, 2, 1, 1);

        System.out.println("lst1 = " + lst1);
        System.out.println("lst2 = " + lst2);

        Set<Integer> set1 = new HashSet<>(lst1);
        Set<Integer> set2 = new HashSet<>(lst2);

        System.out.println("set1 = " + set1);
        System.out.println("set2 = " + set2);

        boolean isListEquals = set1.equals(set2);
        System.out.println("is lists equals = " + isListEquals);
    }
}
