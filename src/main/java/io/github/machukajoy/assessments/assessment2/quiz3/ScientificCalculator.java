package io.github.machukajoy.assessments.assessment2.quiz3;

public class ScientificCalculator extends Calculator {

    // Method overriding: same method signature, different implementation
    @Override
    public int add(int a, int b) {
        System.out.println("ScientificCalculator: Performing integer addition");
        return super.add(a, b); // call parent method
    }

    // New methods
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double squareRoot(double num) {
        return Math.sqrt(num);
    }
}
