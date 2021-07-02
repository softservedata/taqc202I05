package com.softserve.edu04;

public class Tappl {

    static {
        System.out.println("Tappl Static block");
    }

    public static void main(String[] args) {
        System.out.println("Start");
        //Helper.setMessage("Hello!");
        Helper.print();
//
//        Not recommended:
//        Helper helper = new Helper(); // Error if constructor is private
//        Helper.setMessage("New Message");
//        Helper.print();
    }
}
