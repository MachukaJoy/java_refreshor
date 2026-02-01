package io.github.machukajoy.exceptions;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static Set<String> names = new HashSet<>(Set.of("John", "Joey", "Machuka", "Craig"));

    public void main(String[] args) {
//        userInput();
        //Creating a student
        try {
            createStudent("John", "001", "CS");
        } catch (StudentAlreadyExistsException exception) {
            System.out.println(exception.getMessage());
        }

        // finding student  by ID
//        Update and delete student
    }

    // throws is used withing method signature but throw is used in code blocks
//    throws is an informer
    public void createStudent(String name, String regNo, String course) throws StudentAlreadyExistsException {

        if (names.contains(name)) {
//            throw is used to raise an alarm (create an exception)
            throw new StudentAlreadyExistsException("Student with name " + name + " already exists");
        }
        names.add(name);
//        if exists throw an error

    }

    public String findStudentByName(String name) {

        if (names.contains(name)) {
            return name;
        }
//            throw is used to raise an alarm (create an exception)
        throw new RuntimeException("Student with name " + name + " already exists");
    }

}

//    public static void userInput() {
//        Scanner scanner = new Scanner(System.in);
//        try {
//            System.out.println("enter your age ");
//            int age = scanner.nextInt();
//            if (age >= 18) {
//                System.out.println("You can apply for ID");
//            } else {
//                System.out.println("You are still a minor");
//            }
//
//
//        } catch (InputMismatchException exception) {
//            System.out.println("Exception happened");
//            System.out.println("You need to enter an integer");
/// /            System.out.println(exception.getLocalizedMessage());
//        } finally {
//            System.out.println("Releasing scanner ");
//            scanner.close();
//
//        }
//
//
//    }

