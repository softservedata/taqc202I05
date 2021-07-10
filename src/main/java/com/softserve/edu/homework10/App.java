package com.softserve.edu.homework10;

import com.softserve.edu.utils.extractors.PhoneNumberExtractor;

import java.util.List;

public class App {
    private static final String DATA =
            "   text 093 987 65 43 text (050)1234567text\n" +
            "   (067)21-436-57 text 050-2345678 words 0939182736 words 032224-19-28 text\n" +
            "   (093)-11-22-334 text 044 435-62-18 text 044-721-73-45 text\n";

    public static void main(String[] args) {
        PhoneNumberExtractor extractor = new PhoneNumberExtractor(DATA);
        List<String> phoneNumbersList = extractor.extract();
        System.out.println("Extracted phone numbers:\n" + phoneNumbersList);
    }
}
