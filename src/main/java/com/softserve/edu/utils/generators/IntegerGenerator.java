package com.softserve.edu.utils.generators;

import com.softserve.edu.utils.Generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IntegerGenerator implements Generator<Integer> {

    public List<Integer> generate(int numOfElements, int bound) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < numOfElements; i++) {
            result.add(new Random().nextInt(bound));
        }
        return result;
    }
}
