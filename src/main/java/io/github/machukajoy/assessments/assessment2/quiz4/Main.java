package io.github.machukajoy.assessments.assessment2.quiz4;

public class Main {
    public static void main(String[] args) {

        // Polymorphism: parent reference, child object
        BankAccount savings = new SavingsAccount(
                "SA001", "Joy", 500, 0.05);

        BankAccount checking = new CheckingAccount(
                "CA001", "Alex", 300, 200);

        // Savings account behavior
        savings.withdraw(450);   // denied (min balance rule)
        System.out.println("Savings Balance: " + savings.getBalance());

        // Checking account behavior
        checking.withdraw(450);  // allowed (overdraft)
        System.out.println("Checking Balance: " + checking.getBalance());
    }
}

