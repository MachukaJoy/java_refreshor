package io.github.machukajoy.exercises.bankaccount;

public class Main {
    public static void main(String[] args) {
        // Using default constructor
        BankAccount acc1 = new BankAccount();
        acc1.deposit(500);
        acc1.displayBalance();

        // Using constructor with accountNumber and accountHolder
        BankAccount acc2 = new BankAccount("NB001Sys", "Joy Machuka");
        acc2.deposit(1000);
        acc2.withdraw(300);
        acc2.displayBalance();

        // Using constructor with all properties
        BankAccount acc3 = new BankAccount("NB002Sys", "Buyanzi Joy", 2000);
        acc3.withdraw(750);
        acc3.displayBalance();
    }
}
