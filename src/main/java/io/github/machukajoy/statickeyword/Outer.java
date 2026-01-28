package io.github.machukajoy.statickeyword;

class Outer {
    private static String staticVar = "static";
    private String instanceVar = "instance";

    class Inner {
        void method() {
            System.out.println(staticVar);
        }  //  OK

        void staticMethod() {
        }  //  Inner classes cannot have static methods
    }
}