package com.softserve.homework9;

/*
Homework 9 (from 08.06.2021)
1) Задати два списки (ArrayList), які містять цілі значення.
   На підставі цих двох лістів створити новий List, який містить лише спільні елементи з обох заданих списків.
Для коду використати пакет com.softserve.homework9
Запушати код на github у свою вітку.
*/

import java.util.ArrayList;
import java.util.List;

public class Appl9 {
  public static void main(String[] args) {
        List<Integer> list1 = new ArrayList();
        list1.add(1880);
        list1.add(2011);
        list1.add(1912);
        list1.add(1715);
        list1.add(2011);
        list1.add(2017);
        list1.add(2022);
        list1.add(2010);
        list1.add(2002);

        List<Integer> list2 = new ArrayList();
        list2.add(2011);
        list2.add(1689);
        list2.add(2001);
        list2.add(2017);
        list2.add(1912);
        list2.add(1764);
        list2.add(2002);
        list2.add(2009);
        list2.add(2018);

        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);

       List<Integer> List = new Appl9().intersection(list1, list2);
       System.out.println("List common elements: " + List);
    }
    public <T> List<T> intersection(List<T> list1, List<T> list2) {
        List<T> list = new ArrayList<T>();
        for (T t : list1) {
            if(list2.contains(t)) {
                list.add(t);
            }
        }
        return list;
    }

}
