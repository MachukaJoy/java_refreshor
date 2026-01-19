package io.github.machukajoy.calculator;

import java.util.Scanner;

public class SimpleCalculator_JoyB {
    public static void main(String[] args) {

//        Create a calculator using
//        switch
//        that:
//        Takes two numbers and an operator (+, -, *, /, %)
//        Performs the operation
//        Handles division by zero
//        Example:
//        Enter first number: 10
//        Enter operator (+, -, *, /, %): *
//        Enter second number: 5Result: 50

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        double firstNo = scanner.nextDouble();

        System.out.println("Enter operator (+, -, *, /, %): ");
        String operator = scanner.next();

        System.out.println("Enter Second Number: ");
        double secondNo = scanner.nextDouble();


        switch (operator){
            case "+":
                System.out.println("Result: " +(firstNo+secondNo));
                break;
            case "-":
                System.out.println("Result: " +(firstNo-secondNo));
                break;
            case "*":
                System.out.println("Result: " +(firstNo*secondNo));
                break;
            case "/":
                System.out.println("Result: " +(firstNo/secondNo));
                break;
            case"%":
                System.out.println("Result: " +(firstNo%secondNo));
                break;
            default:
                System.out.println("Enter correct input");

        }
        scanner.close();

    }
}