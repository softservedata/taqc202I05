package com.softserve.edu04b;

public class AppStud {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 25);
        Student st2 = new Student("Ivan", 25);
        Student st3 = new Student("Ira", 25);
        //
        System.out.println("Count = " + Student.getCount());
        System.out.println("st1 = " + st1); // .toString();
        System.out.println("st2 = " + st2.toString());
        //
        System.out.println("st1.hashCode() = " + st1.hashCode());
        System.out.println("st2.hashCode() = " + st2.hashCode());
        //
        if (st1 == st2) {
            System.out.println("st1 == st2   result = true");
        } else {
            System.out.println("st1 == st2   result = false");
        }
        //
        if (st1.equals(st2)) {
            System.out.println("st1.equals(st2)   result = true");
        } else {
            System.out.println("st1.equals(st2)   result = false");
        }
        System.out.println("st1.equals(st2)   result = " + st1.equals(st2));
    }
}
