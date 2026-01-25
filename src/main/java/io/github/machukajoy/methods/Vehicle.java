package io.github.machukajoy.methods;

import io.github.machukajoy.variablescope.Car;

public class Vehicle extends Car {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.regNo = 123;
        vehicle.color = "red";
    }
}
