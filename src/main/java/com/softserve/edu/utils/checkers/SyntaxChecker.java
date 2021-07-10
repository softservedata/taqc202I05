package com.softserve.edu.utils.checkers;

import com.softserve.edu.utils.IChecker;

import java.util.LinkedList;
import java.util.List;

public class SyntaxChecker implements IChecker {
    @Override
    public boolean check() {
        return false;
    }

    public static boolean checkBraces(String lines) {
        String openingBraces = "([{";
        String closingBraces = ")]}";
        List<Character> stack = new LinkedList<>();
        int index = 0;
        boolean verified = true;
        for (char brace : lines.toCharArray()) {
            if (openingBraces.contains("" + brace)) {
                stack.add(brace);
                index++;
                verified = false;
            } else if (closingBraces.contains("" + brace)) {
                if (stack.size() < 1) {
                    verified = false;
                    break;
                }
                if (brace == 41) {
                    verified = brace == stack.remove(--index) + 1;
                } else {
                    verified = (brace == stack.remove(--index) + 2);
                }
                if (!verified) {
                    break;
                }
            }
        }
        System.out.println("Verified: " + verified);
        return verified;
    }
}
