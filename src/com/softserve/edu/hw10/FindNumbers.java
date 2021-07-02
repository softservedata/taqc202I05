package com.softserve.edu.hw10;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindNumbers {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String pattern = "[\\d\\-\\(\\) ]{9,}\\d";
        String text = "text 093 987 65 43 text (050)1234567 text (067)21-436-57 text 050-2345678 words 0939182736 words 032224-19-28 text (093)-11-22-334 text 044 435-62-18 text 044-721-73-45 text";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        //
        // 1. Is correspond
        if (m.matches()) {
            System.out.println("m.matches() OK");
        } else {
            System.out.println("m.matches() FALSE");
        }

        m.reset();
        while (m.find()) {
		    list.add(text.substring(m.start(), m.end()));
        }

		System.out.println("Text: " + text);
        System.out.println("Phone numbers from text: ");
		for (String current : list) {
			String number = String.valueOf(current.replaceAll("\\)| |-|\\(", ""));
			System.out.printf("\n" + (number));
		}

    }
}
