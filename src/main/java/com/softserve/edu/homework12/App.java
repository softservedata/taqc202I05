package com.softserve.edu.homework12;

import com.softserve.edu.utils.checkers.SyntaxChecker;

public class App {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage:\n" +
                    "java App \"string-to-check\"");
            System.exit(1);
        }
        SyntaxChecker.checkBraces(args[0]);
    }
}
