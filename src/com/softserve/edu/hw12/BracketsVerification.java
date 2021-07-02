package com.softserve.edu.hw12;

import java.util.ArrayDeque;
import java.util.Deque;

public class BracketsVerification {

    static boolean verifyBrackets(String text)
    {
        Deque<Character> stack
                = new ArrayDeque<Character>();

        for (int i = 0; i < text.length(); i++)
        {
            char x = text.charAt(i);

            if (x == '(' || x == '[' || x == '{')
            {
                stack.push(x);
                continue;
            }

            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }

        return (stack.isEmpty());
    }
}
