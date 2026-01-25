package io.github.machukajoy.variablescope;

import java.util.logging.Logger;

public class Main {
    //   class variables defined outside the method using static key word
    public static String config = "/home/user/bin";
    private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        logger.info("config = " + config);
        printVariables();
    }

    public static void printVariables() {
        System.out.println("config = " + config);
        int a = 20;
        System.out.println("a = " + a);
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public void cairInfo() {
        Car bmw = new Car();
        bmw.regNo = 11;
        bmw.color = "white";
        bmw.model = "Mercedes";

        Car forester = new Car();
        forester.regNo = 12;
        forester.color = "black";
        forester.model = "Subaru Outback";


        bmw.startEngine();
        forester.startEngine();
    }
}
