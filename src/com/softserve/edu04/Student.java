package com.softserve.edu04;

public class Student { //extends Object; //by default
    private static int count;
    private String name;
    private int age;

    static {
        count =0;
        System.out.println("static block done");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
        System.out.println("constructor done");
    }

    public static int getCount() {

        return count;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*@Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ( (obj == null) || (getClass() != obj.getClass()) ) {
            return false;
        }
        Student other = null;
        if (obj instanceof Student){
            other = (Student) obj;
        }
        if ( (other == null)  ||  (age != other.age)
                || ( (name == null) && (other.name != null) )
                || ( (name != null) && (other.name == null) ) ) {
            return false;
        }
        if ( (name == null) && (other.name == null) ) {
            return true;
        }

        return name.equals(other.name);
    }*/

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
}
