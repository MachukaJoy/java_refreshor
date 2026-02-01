package io.github.machukajoy.interfaces;

public class LaptopCharger implements ThreePinPlug {
    @Override
    public void accessPower() {
        System.out.println("Access Power Called: Laptop");
    }

    @Override
    public void printUsage() {

    }

    @Override
    public void checkStatus() {
        ThreePinPlug.printSpecifications();
        System.out.println("Laptop Charger implementation for checking status");

    }

}
