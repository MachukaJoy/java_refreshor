package io.github.machukajoy.assessments.assessment2.bankaccountsystem;

import java.util.ArrayList;

public class Bank {
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public void addAccount(BankAccount account) {
        if (findAccount(account.getAccountNumber()) != null) {
            System.out.println("Account number already exists.");
            return;
        }
        accounts.add(account);
    }

    public BankAccount findAccount(String accountNumber) {
        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        System.out.println("Account not found.");
        return null;
    }

    public void displayAllAccounts() {
        for (BankAccount acc : accounts) {
            System.out.println(acc);
        }
    }

    public double calculateTotalBalance() {
        double total = 0;
        for (BankAccount acc : accounts) {
            total += acc.getBalance();
        }
        return total;
    }

    public void applyInterestToSavingsAccounts() {
        for (BankAccount acc : accounts) {
            acc.applyInterest(); // runtime decides
        }
    }


}

