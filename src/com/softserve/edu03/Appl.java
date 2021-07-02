package com.softserve.edu03;

class Person {
    int id;
    String name;

    // Overload
    public void print() {
        System.out.println(name);
    }

 // Overload
    public void print(String message) {
        System.out.println(message + " " + name);
    }
}

public class Appl { // extends Object

    public static void main(String[] args) {
        System.out.println("Hello idea");
        //
        Student st = new Student("Ivan", "Ivanov", 28);
        st.setFirstName("Petro");
        System.out.println(st); // st.toString();
        //
        Person p = new Person();
        p.name = "Stepan";
        System.out.println("p.id = " + p.id + " p.name = " + p.name);
        p.print("Hello");
        //
        // int k;
        // System.out.println(k); // error
        //
        /*-
        double d = 100.04;
        int i = (int) d; // Code Smell
        System.out.println("d = " + d + "   i = " + i);
        */
        Appl ap = new Appl();
    }

}
