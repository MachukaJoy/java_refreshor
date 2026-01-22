package io.github.machukajoy.methods;

public class Main {
    public static void main(String[] args) {
        reusableAreaCalculation();

    }
//// Method declaration syntax:
//    accessModifier static returnType methodName(parameterType parameterName) {

    /// / method body - code to execute
//        return value;  //if return type is not void
//    }

//    accessModifiers - public, protected, packagePrivate, private
//    static -> optional only needed when you dont want to create an object
//    of the class before you can access the method
//    return type - datatypes - primitive, reference types, void -> determines return value
//    methodName -> name of method
//    (arguments) -> (input variables to the method) parameters that are set dynamically when calling the method
    public static void reusableAreaCalculation() {
        System.out.println("area of circle with radius 2.3 is: " + calculateCircleArea(2.3));
        System.out.println("area of circle with radius 5.07 is:  " + calculateCircleArea(5.07));
    }

    public static double calculateCircleArea(double radius) {
        final double PI = 3.14159;
//        Math.PI * radius * radius  OR MAth.PI * Math.pow(radius,2)// and remove the constant PI declaration
        return PI * radius * radius;
    }


}