package com.softserve.edu.homework9;

import com.softserve.edu.utils.Combiner;
import com.softserve.edu.utils.Generator;
import com.softserve.edu.utils.combiners.IntegerCombiner;
import com.softserve.edu.utils.generators.IntegerGenerator;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Generator<Integer> generator = new IntegerGenerator();
        Combiner<Integer> combiner = new IntegerCombiner();

        List<Integer> firstList = generator.generate(10, 20);
        List<Integer> secondList = generator.generate(10, 20);
        List<Integer> resultList = combiner.combineByCommonElements(firstList, secondList);

        System.out.format("First List: %s\nSecond List: %s\nResult List: %s", firstList, secondList, resultList);
    }
}
