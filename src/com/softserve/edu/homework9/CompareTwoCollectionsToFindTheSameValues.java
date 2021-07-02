package com.softserve.edu.homework9;

import java.util.ArrayList;
import java.util.List;

public class CompareTwoCollectionsToFindTheSameValues {

    public static void main(String[] args) {
        List<Integer> firstPrice = new ArrayList<>();
        List<Integer> secondPrice = new ArrayList<>();

        List<Integer> theSameValues = new ArrayList<>();
        List<Integer> theSameValues2 = new ArrayList<>();

        firstPrice.add(12);
        firstPrice.add(300);
        firstPrice.add(684);
        firstPrice.add(2550);

        secondPrice.add(343);
        secondPrice.add(4545);
        secondPrice.add(300);
        secondPrice.add(684);
        secondPrice.add(2560);
        secondPrice.add(4555);
        secondPrice.add(12);

        System.out.println("Both collections have values: ");
        for (Integer price:firstPrice) {
            if (secondPrice.contains(price)){
                theSameValues.add(price);
            }
        }

        System.out.println(theSameValues);

        System.out.println("Both collections have values: ");
        for(int i=0; i<firstPrice.size(); i++){
            if(secondPrice.contains(firstPrice.get(i))){
                theSameValues2.add(firstPrice.get(i));
            }
        }

        System.out.println(theSameValues2);
    }
}
