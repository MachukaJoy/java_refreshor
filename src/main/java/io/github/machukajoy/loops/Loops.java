package io.github.machukajoy.loops;

import java.util.Scanner;

public class Loops {
    //why for loop and not do while loop.
// For forloop I need to know the end goal, when to terminate
// While loop is indefinite
// Do while loop  you can do until condition is met you dont need to have fixed parameters
//
    public static void main(String[] args) {
//        forLoops();
//        whileLoops();
//        whileLoopWithCounter();
//        doWhileLoop(); //    when you want to perform operaton atleast once use do while loop
//        breakingStatement();
//        continueStatement();
        nestedForLoops();
//        System.out.println("John"+ int(1)+2);
    }

    static void nestedForLoops() {
        // Multiplication table 1-5
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
// New line after each row
        }

        // Right triangle pattern
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void continueStatement() {

//        print prime numbers btn 1 and 50
        for (int i = 1; i <= 5; i++) {

            if (i == 3) {
                continue;
            }
            System.out.println("Processing: " + i);
        }
    }

    static void breakingStatement() {
//        list of numbers search for a number there
        int[] numbers = {1, 25, 24, 14, 31, 21, 20, 14};
        //        Enhanced for loop - if you want to know the counter/index you cant use enhanced for loop
//        for (int number : numbers) {
//            if (number == 14) {
//                System.out.println("found the number");
//                break;
//            }
//        }

        for (int counter = 0; counter < numbers.length; counter += 1) {
            int number = numbers[counter];
            if (number == 14) {
                System.out.println("found the number");
                break;
            }
        }

    }

    static void doWhileLoop() {
        Scanner scanner = new Scanner(System.in);
        int choice; // you dont need to know the initial value unlike while loop

        // Example: Menu system
        do {
            System.out.println("1. Play game");
            System.out.println("2. View scores");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
        }
        // Process choice here
        while (choice != 3);
        scanner.close();
        System.out.println("Goodbye!");
    }

    static void whileLoopWithCounter() {
        int counter = 1;
        while (counter <= 5) {
            System.out.println("I love java");
            counter++;
        }
    }

    static void whileLoops() {
//        show menu
//        *544#
//        1. Tea
//        2. Andazi
//        3. Chapati
//        Exit
        Scanner scanner = new Scanner(System.in);


//        while loop
        boolean showMenu = true;
        while (showMenu) {
            System.out.println("Joey & Co Hotels");
            System.out.println("1.Tea");
            System.out.println("2.Andazi");
            System.out.println("3. Chapati");
            System.out.println("4. Exit");
            System.out.println("Enter your pick: ");
            int choice = scanner.nextInt();
            if (choice == 4) {
//                break;
                showMenu = false;
            } else {
                System.out.println("You have been served with: " + choice);
            }


        }

        scanner.close();
    }

    static void forLoops() {
//        for(initialexpression;testExpression;step(updateExpresison));
//        i=i+2 to skip 2  or counter+=2
        for (int i = 1; i <= 5; i++) {
            System.out.println("I love you parents");

        }
        // Dangerous - can cause infinite loops
//        for (int i = 0; i < 10; i++) {
//            if (i == 5) {
//                i = 8; // Skipping values
//            }
//            System.out.println(i);
//        }
    }

}
