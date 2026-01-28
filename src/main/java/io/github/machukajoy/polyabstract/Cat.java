package io.github.machukajoy.polyabstract;

public class Cat extends Animal {


    @Override
    public void makeSound() {
        System.out.println(name + " is a cat and meows");
    }


}
