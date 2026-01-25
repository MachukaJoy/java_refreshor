package io.github.machukajoy.assessments.assessment2.quiz3;

public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        // Method overloading
        System.out.println(calc.add(2, 3));
        System.out.println(calc.add(2.5, 3.5));
        System.out.println(calc.add(1, 2, 3));
        System.out.println(calc.add("Hello ", "World"));

        ScientificCalculator sciCalc = new ScientificCalculator();

        // Method overriding
        System.out.println(sciCalc.add(5, 10));

        // ScientificCalculator specific methods
        System.out.println(sciCalc.power(2, 3));
        System.out.println(sciCalc.squareRoot(16));
    }
}
