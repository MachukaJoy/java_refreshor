package io.github.machukajoy.interfaces;

public class PhoneCharger implements ThreePinPlug {
    @Override
    public void accessPower() {
        System.out.println("Access Power Called: Phone");

    }

    @Override
    public void printUsage() {

    }
}
