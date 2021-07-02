package com.softserve.edu.hw3;

import com.softserve.edu.homework4.Product;
import com.softserve.edu.homework6.Rectangle;
import com.softserve.edu.homework6.Square;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Appl {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the first number: ");
        String firstNumberString = reader.readLine();
        System.out.println("Enter the second number: ");
        String secondNumberString = reader.readLine();
        System.out.println("Enter the third number: ");
        String thirdNumberString = reader.readLine();

        double firstNumber = Double.parseDouble(firstNumberString);
        double secondNumber = Double.parseDouble(secondNumberString);
        double thirdNumber = Double.parseDouble(thirdNumberString);

        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(firstNumber);
        numbers.add(secondNumber);
        numbers.add(thirdNumber);
        Collections.sort(numbers);

        System.out.println("Numbers from 'min' to 'max' (Collection) " + numbers);
        Collections.reverse(numbers);
        System.out.println("Numbers from 'max' to 'min' (Collection)" + numbers);

        reader.close();

        double[] numbersArray = new double[3];
        numbersArray[0] = firstNumber;
        numbersArray[1] = secondNumber;
        numbersArray[2] = thirdNumber;
        Arrays.sort(numbersArray);

        System.out.println("Numbers from 'min' to 'max' (Arrays) " + Arrays.toString(numbersArray));


        System.out.print("Numbers from 'min' to 'max' (Arrays for each) ");

        for (double number : numbersArray) {
            System.out.print(number + " ");
        }

        System.out.println("");
        System.out.print("Numbers from 'min' to 'max' (Arrays for) ");

        for(int i=0; i< numbersArray.length; i++){
            System.out.print(numbersArray[i] + " ");
        }

        System.out.println("");
        boolean isSorted = false;
        double buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < numbersArray.length - 1; i++) {
                if (numbersArray[i] > numbersArray[i + 1]) {
                    isSorted = false;

                    buf = numbersArray[i];
                    numbersArray[i] = numbersArray[i + 1];
                    numbersArray[i + 1] = buf;
                }
            }
        }
        System.out.println("Numbers from 'min' to 'max' with bubble sorting " + Arrays.toString(numbersArray));

        // the sixth homework
        Rectangle firstRectangle = new Rectangle(150, 70);
        Rectangle secondRectangle = new Rectangle(250,100);

        Square firstSquare = new Square(400);
        Square secondSquare = new Square(170);
        Square thirdSquare = new Square(900);

        double[] perimeter = new double[5];
        perimeter[0] = firstRectangle.perimeter();
        perimeter[1] = secondRectangle.perimeter();
        perimeter[2] = firstSquare.perimeter();
        perimeter[3] = secondSquare.perimeter();
        perimeter[4] = thirdSquare.perimeter();

        for (int i=0; i < perimeter.length; i++) {
            System.out.println("Perimeter of figure is " + perimeter[i]);
        }

        for (double perimetrOfFigure: perimeter
             ) {
            System.out.println("Perimeter of figure is " + perimetrOfFigure);

        }

    }

}
