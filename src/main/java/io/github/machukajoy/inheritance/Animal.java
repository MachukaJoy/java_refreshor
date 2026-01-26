package io.github.machukajoy.inheritance;

public class Animal {
    private String name;

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void makeSound() {
        System.out.println("Animal makes sound");
    }
}
