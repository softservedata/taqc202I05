package com.softserve.homework8;


/*

Homework 8 (from 04.06.2021)
1) Задати два списки (ArrayList), які містять цілі значення.
   Кількість елементів у списках може бути різною, а самі елементи можуть дублюватися.
   Вияснити, чи контент елементів у списках співпадає.
   Наприклад, вміст наступних списків є однаковий [1, 2, 1, 2, 3] та [3, 3, 2, 2, 1, 1]
Для коду використати пакет com.softserve.homework8
Запушати код на github у свою вітку.

 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Appl8  {
    public static void main(String[] args) {


        ArrayList<Integer> myYears = new ArrayList<>();
        myYears.add(2002);
        myYears.add(1988);
        myYears.add(2018);
        myYears.add(2012);
        myYears.add(1927);
        myYears.add(1715);
        myYears.add(2018);
        myYears.add(2018);
        myYears.add(1694);
        myYears.add(2012);

        ArrayList<Integer> otherYears = new ArrayList<>();

        otherYears.add(2012);
        otherYears.add(1694);
        otherYears.add(1927);
        otherYears.add(2018);
        otherYears.add(2002);
        otherYears.add(1988);
        otherYears.add(2012);
        otherYears.add(1927);
        otherYears.add(1715);

        System.out.println("Original myYears list: " + myYears);
        System.out.println("Original otherYears list: " + otherYears);

        Set<Integer> set1 =new HashSet<>(myYears);
        Set<Integer> set2 =new HashSet<>(otherYears);
        boolean isListEquals =set1.equals(set2);
        System.out.println("is list equals= " + isListEquals) ;

    }

}
