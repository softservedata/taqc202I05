package com.softserve.edu.hw10;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberUtils {
    public static List<String> readTextIntoList(String text) {
        Pattern pattern = Pattern.compile("(\\()?\\d{3}(\\))?(-| )?\\d{2,3}(-)?\\3?\\d{2,3}(-| )?\\d{1,3}");
        Matcher matcher = pattern.matcher(text);
        List<String> listOfPhoneNumbers = new ArrayList<>();
        while (matcher.find()) {
            listOfPhoneNumbers.add(matcher.group(0));
        }
        return listOfPhoneNumbers;
    }

    public static void main(String[] args) {
        System.out.println(readTextIntoList("text 093 987 65 43 text (050)1234567text\n" +
                "   (067)21-436-57 text 050-2345678 words 0939182736 words 032224-19-28 text\n" +
                "   (093)-11-22-334 text 044 435-62-18 text 044-721-73-45 text"));
    }

}

