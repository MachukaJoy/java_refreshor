package io.github.machukajoy.assessments;

import java.util.Scanner;

public class Assessment1_JoyB {

    public static void main(String[] args) {

//        Calling functions
        variableOperations();
        gradeCalculator();
        numberSequence();
        inputValidation();
        patternPrinting();
    }
// Problem 1
    private static void variableOperations(){
        System.out.println("Problem 1: Variable Operations");
//        Declare and initialize variables
        int a = 15;
        int b = 4;
        int c = 7;

        // Calculate the sum of all three numbers
        int sum = a + b + c;

        // Calculate the product of a and b
        int product = a * b;

        // Calculate the result of (a + b) * c
        int expressionResult = (a + b) * c;

        // Calculate the remainder when a is divided by b
        int remainder = a % b;

        // Display the results
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Expression Result: " + expressionResult);
        System.out.println("Remainder: " + remainder);
    }

// Problem 2
    private static void gradeCalculator(){
        System.out.println("Problem 2: Grade Calculator");
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the student's score
        System.out.print("Enter student score: ");
        int score = scanner.nextInt();

        // Validate the score
        if (score < 0 || score > 100) {
            System.out.println("Error: Score must be between 0 and 100");
        }
        // Determine grade using if-else
        else if (score >= 90) {
            System.out.println("Grade: A");
        }
        else if (score >= 80) {
            System.out.println("Grade: B");
        }
        else if (score >= 70) {
            System.out.println("Grade: C");
        }
        else if (score >= 60) {
            System.out.println("Grade: D");
        }
        else {
            System.out.println("Grade: F");
        }

        scanner.close();
    }
// Problem 3
    private static void numberSequence(){

        System.out.println("Problem 3: NUMBER SEQUENCE");
        // Loop from 1 to 20
        for (int i = 1; i <= 20; i++) {

            // Check if the number is even or odd
            if (i % 2 == 0) {
                System.out.print(i + " - Even");
            } else {
                System.out.print(i + " - Odd");
            }

            // Check if the number is a multiple of 5
            if (i % 5 == 0) {
                System.out.print(", Multiple of 5");
            }

            // Move to the next line
            System.out.println();
        }
    }
//Problem 4
    private static void inputValidation(){
        System.out.println("PROBLEM 4: INPUT VALIDATION");

        Scanner scanner = new Scanner(System.in);
        int positiveNumber;

        // Keep looping until positive integer is entered
        while (true) {
            System.out.print("Enter a positive integer: ");
            positiveNumber = scanner.nextInt();

            if (positiveNumber > 0) {
                break; // valid input received
            } else {
                System.out.println("Invalid input! Please enter a positive integer.");
            }
        }

        // Calculate factorial
//        int factorial = 1;
        long factorial = 1;

        int i = 1;
        while (i <= positiveNumber) {
            factorial *= i;
            i++;
        }

        // Display result
        System.out.println("Factorial of " + positiveNumber + " is: " + factorial);

        scanner.close();

    }
// Problem 5
    private static void patternPrinting(){

        System.out.println("PROBLEM 5: PATTERN PRINTING");
        for (int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

//        PYRAMID FORMATT
    }
}