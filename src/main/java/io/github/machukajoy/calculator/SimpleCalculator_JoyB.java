package io.github.machukajoy.calculator;

/**
 * Simple Console Calculator
 * Student Name: Joy Buyanzi
 * Date: 19/01/2026
 * Features:
 * - Basic arithmetic operations
 * - Continuous operation
 * - Error handling for division by zero
 * - Input validation

 */
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
                if (secondNo == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    System.out.println("Result: " + (firstNo / secondNo));
                }
                break;
            case"%":
                if (secondNo == 0) {
                    System.out.println("Error: Modulus by zero is not allowed.");
                } else {
                    System.out.println("Result: " + (firstNo % secondNo));
                }
                break;
            default:
                System.out.println("Enter correct input");

        }
        scanner.close();

    }
}