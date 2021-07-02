package com.softserve.edu.homework10;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

    public static void main(String[] args) {

        List<String> listOfPhones = new ArrayList<>();

        listOfPhones.add(" qwerty 093 987 65 43");
        listOfPhones.add("(050) 1234567 aqaqwerty");
        listOfPhones.add("(067)21-436-57 qawerty");
        listOfPhones.add("050-2345678 afdadfa");
        listOfPhones.add("09939182736affs");
        listOfPhones.add("(093)-11-22-334 text 044");
        listOfPhones.add("435-62-18 text");
        listOfPhones.add(" 044-721-73-45 qwertyTEXT");
        String textContainsPhoneNumbers = " qwerty 093 987 65 43 (050) 1234567 aqaqwerty (067)21-436-57 qawerty 050-2345678 afdadfa" +
                "09939182736affs (093)-11-22-334 text 435-62-18 text  044-721-73-45 qwertyTEXT";

        System.out.println(editedPhoneNumbers(textContainsPhoneNumbers));

        for (int i = 0; i < listOfPhones.size(); i++) {
            System.out.println(editList(listOfPhones).get(i));
        }
    }


    public static List<String> editList (List<String> editPhone) {
        List<String> editedList = new ArrayList<>();

        for (int i = 0; i < editPhone.size(); i++) {
            String phone = editPhone.get(i).replaceAll("[A-z]", " ")
                    .replaceAll("-", " ")
                    .replaceAll(" ","")
                    .replaceAll("\\p{P}", "")
                    .trim();
            editedList.add(phone);
        }

        return editedList;
    }

    public static List <String> editedPhoneNumbers(String textPhoneNumbers){

        List<String> editedListPhoneNumbers = new ArrayList<>();
        String phoneNumber;

        String regularExpression = "(\\d+)(\\d|\\)|\\s|-)+(\\d+)";
        Pattern pattern = Pattern.compile(regularExpression);
        Matcher matcher = pattern.matcher(textPhoneNumbers);
        while (matcher.find()) {
            phoneNumber = matcher.group().replaceAll("\\)|\\s|-", "");
            editedListPhoneNumbers.add(phoneNumber);
        }
        return editedListPhoneNumbers;
    }

}
