1. What is the difference between method overloading and method overriding?

Method Overloading is when two or more methods have the same name but different parameter lists. It occurs in the same
class and is resolved at compile time.

Example

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

}

Method Overriding is when 2 or more methods have same name and also parameters. They occur in parent and child classes.
They show inheritance and are resolved at runtime.
Example:

class Parent {

    int add(int a, int b) {
        return a + b;
    }

}

class Child extends Parent {

    @Override
    int add(int a, int b) {
        return a + b + 10;
        }

}

2. Why should fields be declared private in a class?

To ensure data is safe and valid
Private:

- Prevents direct access to data
- Protects object state
- Allows validation and control

3. When should you use the super keyword?

You use the super keyword when working with inheritance to refer to members of the parent (super) class.

class Animal {

    Animal(String type) {
    System.out.println("Animal type: " + type);
    }

}

class Dog extends Animal {

    Dog() {
    super("Mammal"); // calls parent constructor
    System.out.println("Dog created");
    }

}

4. What is the purpose of the @Override annotation?

The @Override annotation is used to indicate that a method in a child class is intended to override a method in its
parent class.The compiler checks that the method actually overides a parent method

class BankAccount {

    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }

}

5. How does encapsulation improve code maintainability?

Encapsulation improves code maintainability by hiding internal data and exposing only controlled access through methods,
making the code easier to modify, debug, and extend without affecting other parts of the program.

You change internal code without breaking external code

class BankAccount {

    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }

}