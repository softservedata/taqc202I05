package com.softserve.edu.hw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import com.softserve.homework6.Figure;
import com.softserve.homework6.Rectangle;
import com.softserve.homework6.Square;


public class Appl {
	

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
    BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));  
    String as = reader.readLine();
    String bs = reader.readLine();
    String cs = reader.readLine();
    double a = Double.parseDouble(as);
    double b = Double.parseDouble(bs);
    double c = Double.parseDouble(cs);
    
    
    /* 1. Check of the following 6 combinations 
     a,b,c
     a,c,b
     b,a,c
     b,c,a
     c,a,b
     c,b,a
     Numbers can be equal*/
    
   if(a<=b && a<=c) {
    	System.out.println(a + " " + b + " " + c);
    }
    else if(a<=b && c<=b) {
    	System.out.println(a + " " + c + " " + b);
    }
    else if(b<=a && a<=c) {
    	System.out.println(b + " " + a + " " + c);
    }
    else if(b<=c && c<=a) {
    	System.out.println(b + " " + c + " " + a);
    }
    else if(c<=a && a<=b) {
    	System.out.println(c + " " + a + " " + b);
    }
    else if(c<=b && b<=a) {
    	System.out.println(c + " " + b + " " + a);
    }
    
    
    //2. Make an array and use ascending sorting
    
     /*double [] array = new double[] {a,b,c};
     Arrays.sort(array);
     System.out.println(Arrays.toString(array));
     */
    
    //3. Using math functions
    
     /* double min = Math.min(Math.min(a,b),c);
      double max = Math.max(Math.max(a,b),c);
      b =(a + b + c) - min - max; 
      a = min; 
      c = max;
      System.out.println(a + " " + b + " " + c);
      */
   
	}
}
