package io.github.machukajoy.encapsulation;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000.0, "001");
        bankAccount.setActive(true);
//        bankAccount.balance = -1000; error because of private
        bankAccount.printInfo();
    }
}
