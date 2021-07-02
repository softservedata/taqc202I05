package com.softserve.edu.homework12;

public class CompareBrackets {

    public static boolean checkBrackets(String text) {
        String editedText;
        boolean result = false;

        editedText = text.replaceAll("\\w|\\d|\\s|[,.]", "");
        editedText = editedText.replaceAll("\\(\\)", "");
        editedText = editedText.replaceAll("\\(\\)", "");
        editedText = editedText.replaceAll("\\{\\}", "");
        editedText = editedText.replaceAll("\\[\\]", "");

        if (editedText.length() == 0) {
            return result = true;
        } else if (editedText.length() != 0) {
            return result = false;
        }

        return result;
    }
}
