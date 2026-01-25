package io.github.machukajoy.oop;

public class Student {
    public String name;
    public int age;

    public Student() {

    }

    public Student(String name, int age) {
//        this refers to the instance variables
        this.age = age;
        this.name = name;
    }


    public void displayInfo() {
        System.out.println(name + "-" + age);
    }


//    @Override
//    public String toString() {
//        return name + "-" + age;
//    }


}
