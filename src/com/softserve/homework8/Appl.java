package com.softserve.homework8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Appl {
	
	public static List findEqualElements(List sourceList, List comparedList){
		List resultList = new ArrayList<>(); 
		Iterator iterator = sourceList.iterator();
		for(Object current:sourceList) {	
			if(comparedList.contains(current)) {
				if(!resultList.contains(current))
				resultList.add(current);
			}
		}
		return resultList;
	}
	
public static void main(String[] args) {
	List<Integer> list1 = new ArrayList<>();
	list1.add(1);
	list1.add(3);
	list1.add(5);
	list1.add(10);
	list1.add(12);
	
	System.out.println("List1: = " + list1);
	
	//for(int i = 0; i<list1.size(); i++) {
	//	System.out.println("list1.get(" + i + ")= " +list1.get(i));
	//}
	
	//System.out.println("Implicit iterator ");
	//for (Integer current:list1) {
	//	System.out.println("current: " + current);
	//}
	
	/*System.out.println("Using object Iterator");
	Iterator<Integer> iterator1 = list1.iterator();
	while(iterator1.hasNext()) {
		Integer current = iterator1.next();
		//System.out.println("current: " + current);
	}*/
	List<Integer> list2 = new ArrayList<>();
	list2.add(12);
	list2.add(10);
	list2.add(15);
	list2.add(111);
	list2.add(1);
	list2.add(2);
	System.out.println("List2: = " + list2);
	
	
	List resultList = findEqualElements(list1,list2);
	if (resultList.size()>0) {
	System.out.println("Elements that coincide: ");
	System.out.println(resultList);}
	else System.out.println("There are no equal elements in lists given.");
	
	
}

@Override
public String toString() {
	return "Appl []";
}

}
