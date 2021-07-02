package com.softserve.homework5;

import com.softserve.homework4.Product;

public class ProductArray {
	
public static void main(String[]args)throws Exception {
	/* // creating new Product instances variant 1
	Product p1 = new Product("Cheese",250);
	Product p2 = new Product("Sausage",210);
	Product p3 = new Product("Onion",21);
	Product p4 = new Product("Garlic",230);
	Product p5 = new Product("Cucumber",50);
	Product p6 = new Product("Tomato",50);
	Product p7 = new Product("Bread",12);
	Product p8 = new Product("Butter",12);
	Product p9 = new Product("Cake",12);
	Product p10 = new Product("Water",12);
	
	//Creating array of products and adding objects
	Product[] productList ={p1,p2,p3,p4,p5,p6,p7,p8,p9,p10};*/
	
	//Creating array of products and adding objects
	Product[] productList ={new Product("Cheese",250),
			                new Product("Sausage",210),
			                new Product("Onion",21),
			                new Product("Garlic",230),
			                new Product("Cucumber",50),
			                new Product("Tomato",50),
			                new Product("Bread",12),
			                new Product("Butter",12),
			                new Product("Cake",12),
			                new Product("Water",12)};
	

	int minPrice = getMin(productList);
	System.out.println("Minimum Price is: "+ minPrice);
	int count = 0;
	
	System.out.println("Product/-s with minimum price: ");
    for(int i= 0; i<productList.length; i++) {
    	if(productList[i].getPrice()== minPrice) {
    		count++;
    		System.out.println(count +"." + " " + productList[i].getName());
    	}
    }
}
// Method for finding minimum value in the array of integers

public static int getMin(int[] inputArray){ 
    int minValue = inputArray[0]; 
    for(int i=1;i<inputArray.length;i++){ 
      if(inputArray[i] < minValue){ 
        minValue = inputArray[i]; 
      } 
    } 
    return minValue; 
  }

// Method for finding minimum value in the array of Objects

public static int getMin(Product[] inputArray){ 
    int minValue = inputArray[0].getPrice(); 
    for(int i=1;i<inputArray.length;i++){ 
      if(inputArray[i].getPrice() < minValue){ 
        minValue = inputArray[i].getPrice(); 
      } 
    } 
    return minValue; 
  }
// Method for finding maximum value in the array
/*public static int getMax(int[] inputArray){ 
    int maxValue = inputArray[0]; 
    for(int i=1;i < inputArray.length;i++){ if(inputArray[i] > maxValue){ 
         maxValue = inputArray[i]; 
      } 
    } 
    return maxValue; 
  }*/


   
  } 

