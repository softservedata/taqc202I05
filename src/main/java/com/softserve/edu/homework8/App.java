package com.softserve.edu.homework8;

import java.util.*;

public class App {
    public static boolean checkContentEquality(List<Integer> l1, List<Integer> l2) {
        Set<Integer> set1 = new HashSet<>(l1);
        Set<Integer> set2 = new HashSet<>(l2);
        return set1.equals(set2);
    }
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, 1, 2, 1, 2, 3);
        List<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 3, 3, 2, 2, 1, 1);
        System.out.println("Content is equal: " + checkContentEquality(list1, list2));
    }
}
