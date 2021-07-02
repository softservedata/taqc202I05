package com.softserve.hw08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ApplComm {
	
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
		//
		List<Integer> lst1 = Arrays.asList(1, 2, 1, 7, 2, 3, 5);
		List<Integer> lst2 = Arrays.asList(3, 3, 2, 5, 2, 7, 1, 1);
		//
		System.out.println("lst1 = " + lst1);
		System.out.println("lst2 = " + lst2);
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
		Set<Integer> set1 = new HashSet<>(lst1);
		Set<Integer> set2 = new HashSet<>(lst2);
		boolean isListEquals = set1.equals(set2);
		System.out.println("is lists equals = " + isListEquals);
		//
		System.out.println("union = " + union(set1, set2));
		System.out.println("intersection = " + intersection(set1, set2));
		
	}

}
