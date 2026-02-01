package com.github.pamanne.asssesments.javase014.Problem2_Pamela_Abaki;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) throws InvalidAccountException {
        if (accountNumber == null || accountNumber.trim().isEmpty()) {
            throw new InvalidAccountException("Account number cannot be empty.");
        }

        if (accountHolder == null || accountHolder.trim().isEmpty()) {
            throw new InvalidAccountException("Account holder name cannot be empty.");
        }

        if (balance < 0) {
            throw new InvalidAccountException("Initial balance cannot be negative.");
        }
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
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
        if (amount <= 0)
            throw new InvalidTransactionException("Amount to deposit should be greater than 0");

        balance += amount;
        System.out.println("Deposited:$ " + amount + "\n New balance:$ " + balance);

    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0)
            throw new InvalidTransactionException("Amount to withdraw should be greater than 0");
        if (amount > balance)
            throw new InsufficientFundsException("You have insufficient balance!");

        balance -= amount;
        System.out.println("Withdrew:$ " + amount + "\n New balance:$ " + balance);

    }

    public void transfer(String toAccountNumber, double amount, BankAccount[] allAccounts)
            throws InsufficientFundsException, AccountNotFoundException {

        if (toAccountNumber == null || toAccountNumber.isEmpty())
            throw new AccountNotFoundException("Account number cannot be empty or null");

        BankAccount targetAccount = null;
        for (BankAccount account : allAccounts) {
            if (account.getAccountNumber().equals(toAccountNumber)) {
                targetAccount = account;
                break;
            }
        }

        if (targetAccount == null)
            throw new AccountNotFoundException("Account with number " + toAccountNumber + " not found");

        if (amount <= 0)
            throw new InvalidTransactionException("Amount to transfer must be greater than 0");

        if (amount > balance)
            throw new InsufficientFundsException("Not enough funds to transfer");

        this.balance -= amount;
        targetAccount.balance += amount;

        System.out.println(
                "Transferred: $ " + amount + " from " + this.accountNumber + " to " + targetAccount.accountNumber);
        System.out.println(this.accountNumber + " balance: $" + this.balance);
        System.out.println(targetAccount.accountNumber + " balance: $" + targetAccount.balance);
    }
}
