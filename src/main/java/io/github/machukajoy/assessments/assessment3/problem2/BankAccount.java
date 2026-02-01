package io.github.machukajoy.assessments.assessment3.problem2;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            try {
                throw new InvalidTransactionException("Deposit amount must be positive");
            } catch (InvalidTransactionException e) {
                throw new RuntimeException(e);
            }
        }
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            try {
                throw new InvalidTransactionException("Withdrawal amount must be positive");
            } catch (InvalidTransactionException e) {
                throw new RuntimeException(e);
            }
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance");
        }
        balance -= amount;
    }

    public void transfer(String toAccount, double amount)
            throws InsufficientFundsException, AccountNotFoundException {

        if (toAccount == null || toAccount.isEmpty()) {
            throw new AccountNotFoundException("Target account not found");
        }

        withdraw(amount); // reuse logic
    }
}
