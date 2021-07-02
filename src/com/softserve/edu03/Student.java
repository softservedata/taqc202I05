package com.softserve.edu03;

public class Student { // extends Object
    private String firstName;
    private String lastName;
    private int age;

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if ((firstName != null) && !firstName.isEmpty()) {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if ((age > 0) && (age < 150)) {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Student [firstName=" + firstName 
                + ", lastName=" + lastName
                + ", age=" + age 
                + "]";
    }

}
