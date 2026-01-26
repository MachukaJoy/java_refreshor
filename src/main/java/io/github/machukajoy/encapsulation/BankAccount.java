package io.github.machukajoy.encapsulation;

public class BankAccount {
    public String accountNumber;
    private double balance;
    private boolean active;

    public BankAccount(double balance, String accountNumber) {
        this.accountNumber = accountNumber;
        this.setBalance(balance);

    }

    public void printInfo() {
        System.out.println(accountNumber + "->" + balance + "-state-" + active);
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            throw new RuntimeException("Balance cant be negative");
        }
    }

    //    boolean accesser is_variable name
    public boolean isActive() {
        return this.active;
    }

    //    seetter for bollean variable
    public void setActive(boolean active) {
        this.active = active;
    }
}
