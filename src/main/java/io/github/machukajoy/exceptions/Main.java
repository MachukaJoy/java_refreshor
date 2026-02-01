package io.github.machukajoy.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        userInput();

    }

    public static void userInput() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("enter your age ");
            int age = scanner.nextInt();
            if (age >= 18) {
                System.out.println("You can apply for ID");
            } else {
                System.out.println("You are still a minor");
            }


        } catch (InputMismatchException exception) {
            System.out.println("Exception happened");
            System.out.println("You need to enter an integer");
//            System.out.println(exception.getLocalizedMessage());
        } finally {
            System.out.println("Releasing scanner ");
            scanner.close();

        }


    }
}
