package io.github.machukajoy.decisions;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        idRegistration();
//        gradingSystem();
        switchSystem();

    }
    private static void switchSystem(){

// Single switch Order processing
//        String orderStatus = "In Progress";
//        switch (orderStatus){
//            case "Placed":
//                System.out.println("Order is in placed status");
//                break;
//            case "In Progress":
//                System.out.println("Order is in progress");
//                break;
//            case "Shipment":
//                System.out.println("Order is in shipment");
//                break;
//            default:
//                break;
//        }

//   New enhanced Modern switch expression Java 14+
//        switch (orderStatus){
//            case "Placed" ->  System.out.println("Order is in placed status");
//            case "In Progress" -> System.out.println("Order is in progress");
//            case "Shipment" -> System.out.println("Order is in shipment");
//        }


//   Multiple switch
//        String response = "01";
//        switch (response){
//            case "01", "05" -> System.out.println("Do Not honour");
//            case "03" -> System.out.println("No Merchant");
//            default -> {
//                yield "unknown";
//            }
//        };

// Traditional Multiple switch grouping
        String grade = "D";
        switch (grade){
            case "A":
            case "B":
                System.out.println("Honour roll");
                break;
                case "C": System.out.println("Good Job");
            default:
                System.out.println("unknown");
        }

    }

    private static void gradingSystem(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks: ");
        int marks = scanner.nextInt();

        if(marks>80){
            System.out.println("You got an A");
        } else if(marks>70){
            System.out.println("You got a B");
        }else if(marks>60){
            System.out.println("You got a C");
        } else if(marks>50){
            System.out.println("You got a D");
        } else{
            System.out.println("You got an E");
        }

        scanner.close();

    }

    private static void idRegistration() {
        Scanner scanner = new Scanner(System.in);

        final int QUALIFICATION_AGE = 18;
        //
        System.out.println("Input your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        if (age>=QUALIFICATION_AGE){
            System.out.print("Enter your name:" );
            String name = scanner.nextLine();

            System.out.print("Enter your location:" );
            String location = scanner.nextLine();

            System.out.print("You are qualified to be registered " +name + " at " +location);
        }else{
            System.out.println("You are under age");
        }
        System.out.println("After registration check");
        scanner.close();
    }
}