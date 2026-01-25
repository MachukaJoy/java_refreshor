package io.github.machukajoy.assessments.assessment2.bankaccountsystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Bank Account System ===");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Checking Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Check Balance");
            System.out.println("6. Apply Interest (Savings)");
            System.out.println("7. Display All Accounts");
            System.out.println("8. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Account Number: ");
                    String sAccNo = scanner.next();
                    System.out.print("Holder Name: ");
                    String sName = scanner.next();
                    System.out.print("Initial Balance: ");
                    double sBal = scanner.nextDouble();
                    System.out.print("Interest Rate: ");
                    double rate = scanner.nextDouble();

                    bank.addAccount(
                            new SavingsAccount(sAccNo, sName, sBal, rate)
                    );
                    System.out.println("Savings account created.");
                    break;

                case 2:
                    System.out.print("Account Number: ");
                    String cAccNo = scanner.next();
                    System.out.print("Holder Name: ");
                    String cName = scanner.next();
                    System.out.print("Initial Balance: ");
                    double cBal = scanner.nextDouble();
                    System.out.print("Overdraft Limit: ");
                    double limit = scanner.nextDouble();

                    bank.addAccount(
                            new CheckingAccount(cAccNo, cName, cBal, limit)
                    );
                    System.out.println("Checking account created.");
                    break;

                case 3:
                    System.out.print("Account Number: ");
                    String dAccNo = scanner.next();
                    System.out.print("Amount: ");
                    double dAmt = scanner.nextDouble();

                    BankAccount dAcc = bank.findAccount(dAccNo);
                    if (dAcc != null) {
                        dAcc.deposit(dAmt);
                    }
                    break;

                case 4:
                    System.out.print("Account Number: ");
                    String wAccNo = scanner.next();
                    System.out.print("Amount: ");
                    double wAmt = scanner.nextDouble();

                    BankAccount wAcc = bank.findAccount(wAccNo);
                    if (wAcc != null) {
                        wAcc.withdraw(wAmt);
                    }
                    break;

                case 5:
                    System.out.print("Account Number: ");
                    String bAccNo = scanner.next();

                    BankAccount bAcc = bank.findAccount(bAccNo);
                    if (bAcc != null) {
                        System.out.println("Balance: $" + bAcc.getBalance());
                    }
                    break;

                case 6:
                    bank.applyInterestToSavingsAccounts();
                    System.out.println("Interest applied to savings accounts.");
                    break;

                case 7:
                    bank.displayAllAccounts();
                    break;

                case 8:
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
