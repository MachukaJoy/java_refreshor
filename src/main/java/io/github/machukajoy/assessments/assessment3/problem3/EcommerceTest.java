package io.github.machukajoy.assessments.assessment3.problem3;

public class EcommerceTest {
    public static void main(String[] args) {
        try {
            Product laptop = new Electronics("E001", "Laptop", -999.99, 10, 24, 65);

            laptop.reduceStock(15);

        } catch (InvalidProductException | OutOfStockException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}

