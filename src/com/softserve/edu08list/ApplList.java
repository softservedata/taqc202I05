package com.softserve.edu08list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ApplList {
	public static void main(String[] args) {
		/*-
		String[] arrStr = { "222", "1", "1111", "10" };
		//System.out.println("arrStr = " + arrStr);
		System.out.println("arrStr = " + Arrays.toString(arrStr));
		//
		List<String> lstStr = Arrays.asList(arrStr);
		System.out.println("lstStr = " + lstStr);
		arrStr[1] = "001";
		// lstStr.clear();// Error
		System.out.println("Changed lstStr = " + lstStr);
		//Arrays.sort(arrStr);
		Collections.sort(lstStr);
		//lstStr.sort((a,b)->a.compareTo(b));
		System.out.println("Sorted lstStr = " + lstStr);
		*/
		/*-
		// List<String> lstStr = new ArrayList<>(Arrays.asList(arrStr));
		List<String> lstStr = new ArrayList<>();
		lstStr.add("222");
		lstStr.add("001");
		lstStr.add("1111");
		lstStr.add("010");
		System.out.println("Original: lstStr = " + lstStr);
		Collections.sort(lstStr);
		System.out.println("Sorted: lstStr = " + lstStr);
		lstStr.clear();
		System.out.println("stStr.clear() = " + lstStr);
		*/
		/*-
		List<Student> lstStr = new ArrayList<>();
		lstStr.add(new Student(232, "Petro"));
		lstStr.add(new Student(143, "Stepan"));
		lstStr.add(new Student(234, "Petro"));
		lstStr.add(new Student(567, "Ira"));
		lstStr.add(new Student(123, "Ivan"));
		lstStr.add(new Student(233, "Petro"));
		System.out.println("Original: lstStr = " + lstStr);
		//Collections.sort(lstStr);
		//Collections.sort(lstStr, new Student.ByDestName());
		Collections.sort(lstStr, new Student.ByNameAndAge());
		System.out.println("\nSorted: lstStr = " + lstStr);
		//
		//Student st1 = new Student(143, "Stepan");
		//Student.ById byid = st1.new ById();
		//Student.ById byid = lstStr.get(0).new ById();    // arr[0]
		*/
		//
		// Iterator
		/*-
		List<String> list = new ArrayList<>();
		list.add("First element");
		list.add("Second element");
		list.add(0, "One more first element");
		list.add("Second element");
		//
//		String element2 = list.get(1);
//		System.out.println("element2 = " + element2);
		//
		// Print Elements
		//System.out.println("elements: " + list);
		//
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println("list.get(" + i + ")= " + list.get(i));
//		}
		//
//		for (String current : list) { // implicit iterator
//			System.out.println("current = " + current);
//		}
		//
//		Iterator<String> iterator = list.iterator();
//		while (iterator.hasNext()) {
//			String current = iterator.next();
//			System.out.println("current: " + current);
//		}
		*/
		/*-
		List<String> list = new ArrayList<>();
		list.add("First element");
		list.add("Second element");
		list.add(0, "One more first element");
		list.add("Second element");
		//
		// Print
		System.out.println("elements: " + list);
		//
		// int n = list.size();
		for (int i = 0; i < list.size(); i++) {
		// for (int i = 0; i < n; i++) {
            System.out.println("Current Element = " + list.get(i));
            if (list.get(i).contains("Second")) {
                list.remove(i);
            }
        }
		//
//        for (String current : list) {
//            System.out.println(current);
//            if (current.contains("Second")) {
//                list.remove(current);
//            }
//        }
        */
		// /*-
		List<String> list = new ArrayList<>();
		list.add("First element");
		list.add("Second element");
		list.add(0, "One more first element");
		list.add("Second element");
		//
		// Print
		System.out.println("elements: " + list);
		//
//		boolean isFound = false;
//		do {
//			isFound = false;
//			int i = 0;
//			for (i = 0; i < list.size(); i++) {
//				if (list.get(i).contains("Second")) {
//					isFound = true;
//					break;
//	            }
//			}
//			if (isFound) {
//				list.remove(i);
//			}
//		} while(isFound);
		//
		//
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
		    String current = iterator.next();
		    System.out.println("element = " + current);
		    if (current.contains("Second")) {
		        iterator.remove();
		    }
		}
		// */
		// /*-
		System.out.println("\nFinal List:");
		for (String current : list) {
		    System.out.println(current);
		}
		// */
	}
}
