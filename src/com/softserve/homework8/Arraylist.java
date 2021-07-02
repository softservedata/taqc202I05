package com.softserve.homework8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Arraylist {
	
	
	public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
		Set<E> result = new HashSet<E>(set1);
		result.addAll(set2);
		return result;
	}

	public static <E> Set<E> intersection(Set<E> set1, Set<E> set2) {
		Set<E> result = new HashSet<E>(set1);
		result.retainAll(set2);
		return result;
	}
	
	
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(1);
		list1.add(22);
		list1.add(2);
		list1.add(3);
		list1.add(12);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(3);
		list2.add(3);
		list2.add(2);
		list2.add(2);
		list2.add(1);
		list2.add(1);
		list2.add(4);
		list2.add(22);
		list2.add(0, 8);
		
		System.out.println("list1 = " + list1); //есть метод toString
		System.out.println("list2 = " + list2);
		System.out.println("list2 element 0 = " + list2.get(0)); //вытащить элемент по индексу
		
		//сортировка коллекции
		Collections.sort(list1);
		System.out.println("sorted list1: " + list1);
		
		//
		/*-
		// Compare List
		boolean isElementPresent = true;
		for (int i = 0; isElementPresent && i < lst1.size(); i++) {
			isElementPresent = false;
			for (int j = 0; j < lst2.size(); j++) {
				if (lst1.get(i).equals(lst2.get(j))) {
					isElementPresent = true;
					break;
				}
			}
		//			if (!isElementPresent) {
		//				break;
		//			}
		}
		//
		for (int i = 0; isElementPresent && i < lst2.size(); i++) {
			isElementPresent = false;
			for (int j = 0; j < lst1.size(); j++) {
				if (lst2.get(i).equals(lst1.get(j))) {
					isElementPresent = true;
					break;
				}
			}
		//			if (!isElementPresent) {
		//				break;
		//			}
		}
		//
		System.out.println("is lists equals = " + isElementPresent);
		*/
		Set<Integer> set1 = new HashSet<>(list1); //все повтор€ющиес€ элементы автоматически удал€тьс€, и автоматически отсортируютс€ по хешу
		Set<Integer> set2 = new HashSet<>(list2);
		boolean isListEquals = set1.equals(set2);
		System.out.println("lists content equals = " + isListEquals);
		//
		System.out.println("unique elements from 2 lists = " + union(set1, set2)); //общие элементы
		System.out.println("common elements = " + intersection(set1, set2)); //пересекающиес€ элементы
		
	}
	}

