package io.github.machukajoy.exercises;

public class PrimeNumbers {
    public static void main(String[] args) {

        for (int i = 2; i <= 50; i++) { //keep incrementing i
            int count = 0; // couunt of numbers with only 2 divisibles 1 and itself

            for (int j = 1; j <= i; j++) { //number to divide by. check if that no<=current value of i
                if (i % j == 0) {
                    count++; // if you divide i by a no and theres no remainder increment count
                }
            }
            if (count == 2) {
                System.out.print(i + ", ");
            }

        }

    }
}
