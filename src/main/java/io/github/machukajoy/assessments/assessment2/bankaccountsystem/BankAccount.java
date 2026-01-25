package io.github.machukajoy.assessments.assessment2.bankaccountsystem;

public class BankAccount {
    protected double balance;
    private String accountNumber;
    private String accountHolder;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        if (balance < 0) {
            System.out.println("Initial balance cannot be negative.");
            balance = 0;
        }
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return;
        }
        balance -= amount;
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber +
                ", Holder: " + accountHolder +
                ", Balance: $" + balance;
    }
}

