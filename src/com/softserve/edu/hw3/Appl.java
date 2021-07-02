package com.softserve.edu.hw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Appl {
    public static void main(String[] args) throws IOException {
        List<String> myList = new ArrayList<>();

        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while (!(line = in.readLine()).equals("")) {
                myList.add(line);
            }
        }

        System.out.println(myList.stream().map(Double::parseDouble).sorted().collect(Collectors.toList()));
    }
}
