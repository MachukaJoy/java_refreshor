package io.github.machukajoy.assessments.assessment2.bankaccountsystem;

public class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String accountHolder,
                           double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if (balance - amount < -overdraftLimit) {
            System.out.println("Overdraft limit exceeded.");
            return;
        }
        balance -= amount;
    }

    @Override
    public String toString() {
        return super.toString() + ", Overdraft Limit: $" + overdraftLimit;
    }
}

