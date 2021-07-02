package com.softserve.edu.homework8;

import java.util.*;

public class CompareCollections {

    public static void main(String[] args) {

        List<Double> firstPrice = new ArrayList<>();
        List<Double> secondPrice = new ArrayList<>();

        firstPrice.add(12.54);
        firstPrice.add(300.00);
        firstPrice.add(684.00);
        firstPrice.add(2550.00);

        secondPrice.add(343.00);
        secondPrice.add(4545.00);
        secondPrice.add(300.00);
        secondPrice.add(684.00);
        secondPrice.add(2560.00);
        secondPrice.add(4555.00);
        secondPrice.add(12.54);

        Collections.sort(firstPrice);
        Collections.sort(secondPrice);

        if(firstPrice.equals(secondPrice)){
            System.out.println("Prices are the same");
        } else {
            System.out.println("Prices are different");
        }

        List<Double> theSamePrice = new ArrayList<>(firstPrice);
        theSamePrice.retainAll(secondPrice);
        System.out.println(theSamePrice);

        List<Double> firstPriceWithoutTheSameValues = new ArrayList<>(firstPrice);
//        firstPriceWithoutTheSameValues.addAll(firstPrice);
        firstPriceWithoutTheSameValues.removeAll(theSamePrice);
        System.out.println("The first price without the same values: " + firstPriceWithoutTheSameValues);

        List<Double> secondPriceWithoutTheSameValues = new ArrayList<>(secondPrice);
        secondPriceWithoutTheSameValues.removeAll(theSamePrice);
        System.out.println("The second price without the same values: " + secondPriceWithoutTheSameValues);

    }

}
