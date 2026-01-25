package com.github.pamanne.asssesments.javase010.part2_pamela_abaki;

import java.util.ArrayList;
import java.util.List; 

public class Bank {
    private List<BankAccount> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    // Add new account (with a check for duplicate account numbers)
    public void addAccount(BankAccount account) {
        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber().equals(account.getAccountNumber())) {
                System.out.println("Account with this number already exists!");
                return; 
            }
        }
        accounts.add(account);
        System.out.println("Account added successfully.");
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

    // Display all accounts
    public void displayAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts to display.");
        } else {
            for (BankAccount acc : accounts) {
                System.out.println(acc.toString());
            }
        }
    }

    // Calculate total balance of all accounts
    public double calculateTotalBalance() {
        double total = 0;
        for (BankAccount acc : accounts) {
            total += acc.getBalance();
        }
        return total;
    }

    // Apply interest to all savings accounts
    public void applyInterestToSavingsAccounts() {
        for (BankAccount acc : accounts) {
            if (acc instanceof SavingsAccount) {
                ((SavingsAccount) acc).applyInterest();
            }
        }
    }

    public void transfer(String fromAccountNumber, String toAccountNumber, double amount) {
        BankAccount fromAccount = findAccount(fromAccountNumber);
        BankAccount toAccount = findAccount(toAccountNumber);

        if (fromAccount == null || toAccount == null) {
            System.out.println("Transfer failed: One or both accounts not found.");
            return;
        }

        if (fromAccountNumber.equals(toAccountNumber)) {
            System.out.println("Transfer failed: Cannot transfer to the same account.");
            return;
        }

        if (amount <= 0) {
            System.out.println("Transfer failed: Amount must be greater than zero.");
            return;
        }

        if (fromAccount.getBalance() < amount) {
            System.out.println("Transfer failed: Insufficient funds in source account.");
            return;
        }

        fromAccount.withdraw(amount);
        toAccount.deposit(amount);

        fromAccount.addTransaction("Transfer to " + toAccountNumber, amount);
        toAccount.addTransaction("Transfer from " + fromAccountNumber, amount);
        System.out.println("Transfer successful! $" + amount + " transferred from " + 
            fromAccountNumber + " to " + toAccountNumber);
    }
}
