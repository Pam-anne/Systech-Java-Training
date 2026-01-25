/**
* Basic Bank Account System
* Student: [Your Name]
* Date: [Submission Date]
*
* Features Implemented:
* - Complete encapsulation with validation
* - Inheritance hierarchy (Savings/Checking accounts)
* - Polymorphic account management
* - Custom exception handling
*
* Bonus Features: [List any bonus features]
* - Transaction History: Store last 10 transactions per account
* - Account Transfers: Transfer between accounts
*/

package com.github.pamanne.asssesments.javase010.part2_pamela_abaki;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("\n=== Bank Account System ===");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Checking Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Check Balance");
            System.out.println("6. Apply Interest (Savings)");
            System.out.println("7. Display All Accounts");
            System.out.println("8. Transfer Money");
            System.out.println("9. View Transaction History");
            System.out.println("10. Exit");
            System.out.print("Enter your choice(1-10): ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1) {
                    System.out.print("Enter account number: ");
                    String sAccNo = scanner.nextLine();
                    System.out.print("Enter account holder: ");
                    String sHolder = scanner.nextLine();
                    System.out.print("Enter opening balance: ");
                    double sBalance = scanner.nextDouble();
                    System.out.print("Enter interest rate: ");
                    double rate = scanner.nextDouble();
                    bank.addAccount(new SavingsAccount(sAccNo, sHolder, sBalance, rate));

                } else if (choice == 2) {
                    System.out.print("Enter account number: ");
                    String cAccNo = scanner.nextLine();
                    System.out.print("Enter account holder: ");
                    String cHolder = scanner.nextLine();
                    System.out.print("Enter opening balance: ");
                    double cBalance = scanner.nextDouble();
                    System.out.print("Enter overdraft limit: ");
                    double limit = scanner.nextDouble();
                    bank.addAccount(new CheckingAccount(cAccNo, cHolder, cBalance, limit));

                } else if (choice == 3) {
                    System.out.print("Enter account number: ");
                    String depAcc = scanner.nextLine();
                    BankAccount depAccount = bank.findAccount(depAcc);
                    if (depAccount != null) {
                        System.out.print("Enter amount to deposit: ");
                        double depAmt = scanner.nextDouble();
                        depAccount.deposit(depAmt);
                    }

                } else if (choice == 4) {
                    System.out.print("Enter account number: ");
                    String wAcc = scanner.nextLine();
                    BankAccount wAccount = bank.findAccount(wAcc);
                    if (wAccount != null) {
                        System.out.print("Enter amount to withdraw: ");
                        double wAmt = scanner.nextDouble();
                        wAccount.withdraw(wAmt);
                    }

                } else if (choice == 5) {
                    System.out.print("Enter account number: ");
                    String bAcc = scanner.nextLine();
                    BankAccount bAccount = bank.findAccount(bAcc);
                    if (bAccount != null) {
                        System.out.println("Current Balance: $" + bAccount.getBalance());
                    }

                } else if (choice == 6) {
                    bank.applyInterestToSavingsAccounts();

                } else if (choice == 7) {
                    bank.displayAllAccounts();

                } else if (choice == 8) {

                    System.out.print("Enter source account number: ");
                    String fromAcc = scanner.nextLine();
                    System.out.print("Enter destination account number: ");
                    String toAcc = scanner.nextLine();
                    System.out.print("Enter amount to transfer: ");
                    double transferAmt = scanner.nextDouble();
                    bank.transfer(fromAcc, toAcc, transferAmt);

                } else if (choice == 9) {
                    System.out.print("Enter account number: ");
                    String histAcc = scanner.nextLine();
                    BankAccount histAccount = bank.findAccount(histAcc);
                    if (histAccount != null) {
                        histAccount.displayTransactionHistory();
                    }

                } else if (choice == 10) {
                    System.out.println("Thank you for using the bank system... Goodbye!");

                } else {
                    System.out.println("Invalid choice. Please enter a number between 1 and 10.");
                }

            } else {
                System.out.println("Error: Invalid input! Please enter a number, not a letter or symbol.");
                scanner.nextLine();
            }

        } while (choice != 10);

        scanner.close();
    }
}