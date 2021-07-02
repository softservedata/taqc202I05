package com.softserve.edu.utils.extractors;

import com.softserve.edu.utils.Extractor;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExtractor implements Extractor<String> {
    private String source;
    private static final String PHONE_NUMBERS = "(\\d+)(\\d|\\)|\\s|-)+(\\d+)";

    public PhoneNumberExtractor() {
        this.source = "";
    }

    public PhoneNumberExtractor(String source) {
        this.source = source;
    }

    public List<String> extract() {
        Pattern pattern = Pattern.compile(PHONE_NUMBERS);
        Matcher matcher = pattern.matcher(source);
        String number;
        List<String> phoneNumbers = new LinkedList<>();
        while (matcher.find()) {
            number = matcher.group().replaceAll("\\)|\\s|-", "");
                phoneNumbers.add(number);
        }
        return phoneNumbers;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return source;
    }
}
