package io.github.machukajoy.inheritance;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Simba");
        Cat cat = new Cat("Mael");
//        Animal animal = new Animal("Random animal");

        dog.makeSound();
        cat.makeSound();
//        animal.makeSound();
    }
}
