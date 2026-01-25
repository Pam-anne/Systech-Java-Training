package com.github.pamanne.asssesments.javase010.part2_pamela_abaki;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private List<Transaction> transactionHistory;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        setAccountNumber(accountNumber);
        setAccountHolder(accountHolder);
        setBalance(balance);
        this.transactionHistory = new ArrayList<>();
        if (balance > 0) {
            addTransaction("Opening Balance", balance);
        }

    }

    // getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // setters
    public void setAccountHolder(String accountHolder) {
        if (accountHolder == null || accountHolder.isEmpty()) {
            System.out.println("Error: Account Holder name cannot be empty");
        } else {
            this.accountHolder = accountHolder;
        }
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber == null || accountNumber.isEmpty()) {
            System.out.println("Bank Account number cannot be empty");
        } else {
            this.accountNumber = accountNumber;
        }

    }

    protected void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Error: Balance cannot be negative. Setting balance to 0.");
            this.balance = 0.0;
        } else {
            this.balance = balance;
        }
    }

    // methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            addTransaction("Deposit", amount);
            System.out.println("You have deposited: $ " + amount + " .Your balance is $ " + balance);
        } else {
            System.out.println("You must deposit amount greater than 0 ");
        }

    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            addTransaction("Withdraw", amount);
            System.out.println("You have withdrawn: $ " + amount + " .Your balance is $ " + balance);
        } else {
            System.out.println("You can't withdraw zero amount or any amount greater than your balance");
        }

    }
    // Transaction history method
    protected void addTransaction(String type, double amount) {
        transactionHistory.add(new Transaction(type, amount));
    }

    public void displayTransactionHistory() {
        System.out.println("\nTransaction history for " + accountHolder + ":");
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            for (Transaction t : transactionHistory) {
                System.out.println(t);
            }
        }
    }

    public String toString() {
        return "======= ACCOUNT DETAILS ======="+ "\n" + "Account : " + accountNumber+"\n"+"Owner: " + accountHolder+"\n"+ "Balance: $" + balance +"\n";
        
    }

}
