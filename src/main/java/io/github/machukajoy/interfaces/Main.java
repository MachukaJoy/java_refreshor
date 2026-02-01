package io.github.machukajoy.interfaces;

public class Main {
    public static void main(String[] args) {
//        ThreePinPlug threePinPlug = new LaptopCharger();
        ThreePinPlug phoneCharger = new LaptopCharger();
        ThreePinPlug laptopCharger = new LaptopCharger();

        laptopCharger.accessPower();
        phoneCharger.accessPower();
        laptopCharger.checkStatus();
        phoneCharger.checkStatus();

    }
}
