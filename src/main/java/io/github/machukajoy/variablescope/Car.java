package io.github.machukajoy.variablescope;

public class Car {
    //instance variables - variables defined outside the methods but not using static keyword
    // for you to access you have to create an object of the class
    public int regNo;
    public String model;
    public String color;

    public void startEngine() {
        System.out.println("Car is started");
    }

    public void stopEngine() {
        System.out.println("Car is stopped");
    }
}
