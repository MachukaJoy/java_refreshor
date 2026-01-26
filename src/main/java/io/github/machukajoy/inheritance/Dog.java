package io.github.machukajoy.inheritance;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("A dog barks");
    }
}
