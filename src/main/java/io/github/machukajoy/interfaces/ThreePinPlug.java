package io.github.machukajoy.interfaces;

public interface ThreePinPlug {
    static void printSpecifications() {
        System.out.println("Specifications");
    }

    void accessPower();

    void printUsage();

    default void checkStatus() {
        System.out.println("Default implementation ");
    }


}
