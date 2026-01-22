package io.github.machukajoy.methods;

import static io.github.machukajoy.methods.Main.calculateCircleArea;

public class callMethodsDiffClass {
    public static void main(String[] args) {
        calculateArea();
    }

    public static void calculateArea() {
        calculateCircleArea(4.2);
        System.out.println(calculateCircleArea(4.2));

//        if method being called did not have static
//        var object = new Main(); // io.github.machukajoy.methods.Main();
//        System.out.println(object.calculateCircleArea(4.2));


    }
}
