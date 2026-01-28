package io.github.machukajoy.polyabstract;

import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class Animal {

    protected String name;

    public static void animalFact() {
        System.out.println("All animals need food and water");
    }
//    public abstract void sleep() ;

    public abstract void makeSound();

    protected long sum(int a, int b) {
        return a + b;

    }

    public void readFile() throws IOException {

    }
}
// overloading -> different size,type and order of parameters
// overriding -> same method signature in subclass
