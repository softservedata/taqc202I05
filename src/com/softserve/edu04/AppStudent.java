package com.softserve.edu04;

public class AppStudent {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 25);
        Student st2 = new Student("Ivan", 25);
        Student st3 = new Student("Ivan", 25);
        System.out.println("Count = " + Student.getCount());
        System.out.println("st1 = " + st1); //.toString();
        System.out.println("st2 = " + st2.toString());

        System.out.println("st1.hashCode = " + st1.hashCode());
        System.out.println("st2.hashCode = " + st2.hashCode());

        if (st1 == st2) {
            System.out.println("st1 == st2 >>> Result = true");
        } else {
            System.out.println("st1 == st2 >>> Result  = false");
        }

        if (st1.equals(st2)) {
            System.out.println("st1.equals(st2) >>> Result = true");
        } else {
            System.out.println("st1.equals(st2) >>> Result  = false");
        }

        System.out.println("st1.equals(st2) >>> Result  = " + st1.equals(st2));
        System.out.println("st2.equals(st3) >>> Result  = " + st2.equals(st3));
        System.out.println("st`3`.equals(st2) >>> Result  = " + st1.equals(st3));

    }





}
