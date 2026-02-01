package io.github.machukajoy.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {
// Old way - manual resource management
        BufferedReader reader = null;
        oldWay();
    }

    private static void newWay() {
        try (BufferedReader reader = new BufferedReader(new FileReader("test.txt"))) {

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static void oldWay() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("test.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Error closing file: " + e.getMessage());
                }
            }
        }
    }
}