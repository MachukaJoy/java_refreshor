package io.github.machukajoy.assessments.assessment2.bankaccountsystem;

public class SavingsAccount extends BankAccount {
    private static final double MIN_BALANCE = 100;
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder,
                          double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        if (balance < MIN_BALANCE) {
            System.out.println("Savings account requires minimum balance of $100.");
            this.balance = MIN_BALANCE;
        }
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        balance += balance * interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount < MIN_BALANCE) {
            System.out.println("Cannot withdraw. Minimum balance of $100 required.");
            return;
        }
        super.withdraw(amount);
    }

//    @Override
//    public void applyInterest() {
//        balance += balance * interestRate;
//    }
}

