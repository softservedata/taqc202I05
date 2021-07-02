package com.softserve.homework4;

import java.util.ArrayList;
import java.util.List;

public class Product {
	private String name;
	private int price;
	static int count;

//Static block to initialize static variable count
static {
	count = 0;
}

//Constructor containing class fields and count increment
public Product(String name, int price) {
	this.name = name;
	this.price = price;
	count++;
}

// Getters and Setters(as class fields are private and we need to provide access to them)

public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public int getPrice() {
	return price;
}


public void setPrice(int age) {
	this.price = age;
}

// Overloaded methods hashCode, equals and toString

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + price;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}

// Method equals was changed as shown during lecture compared to the standard Eclipse template
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if ((obj == null) || (getClass() != obj.getClass())){
		return false;
	}
	Product other = null;
	if(obj instanceof Product) {
	other = (Product) obj;
	}
	if ((other==null)||(price != other.price)
			||( (name==null)&&(other.name != null) )
			||( (name!=null)&&(other.name == null) ) ) {
		return false;
	}
	if ((name == null)&&(other.name == null)) {
		return true;
	}
	return name.equals(other.name);
		
}

@Override
public String toString() {
	return "Product name = " + name + ", price = " + price + " ";
}

///////////

public static void printEqualProducts(Product[] arr){
	Product curProd;
	List <Product> dupList= new ArrayList<Product> ();

    for(int i=0; i<arr.length-1; i++) {
    	curProd = arr[i]; 
    	for (int j = i+1; j<arr.length; j++) {
    		if ((!dupList.contains(curProd)) && curProd.equals(arr[j])){
    			System.out.println(arr[i].toString());
    			dupList.add(curProd);
    			break;
    			}
    		}
    }
}

public static int findMaxPrice(Product[] arr){
	int res = 0;
	
    for(int i=0; i<arr.length-1; i++) {
    	
    	if (arr[i].getPrice() > res) 
    		res = arr[i].getPrice();
    }
    return res;
}

public static void printProductsWithMaxPrice(Product[] arr){
	int maxPrice = findMaxPrice(arr);
	List <Product> dupList= new ArrayList<Product> ();

    for(int i=0; i<arr.length-1; i++) {
    	if ((!dupList.contains(arr[i])) && arr[i].getPrice() == maxPrice){
    		System.out.println(arr[i].toString());
    		dupList.add(arr[i]);    		
    	}
    }
}

public static void main (String[] args) {
	Product a = new Product("Mozarella", 250);
	Product b = new Product("Farmer Delight", 250);
	Product c = new Product ("Jelly", 130);
	Product d = new Product("Jelly", 130);
	Product e = new Product ("Jelly", 130);

	Product[] prods = new Product[] {a, b, c, d, e};
	
	System.out.println ("");
	System.out.println ("Products with biggest price:");
	printProductsWithMaxPrice(prods);

	System.out.println ("");
	System.out.println ("Equal products:");
	printEqualProducts(prods);
    	}
    }
    
