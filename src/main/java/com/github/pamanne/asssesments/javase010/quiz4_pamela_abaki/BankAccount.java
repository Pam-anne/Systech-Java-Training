package com.github.pamanne.asssesments.javase010.quiz4_pamela_abaki;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        setAccountNumber(accountNumber);
        setAccountHolder(accountHolder);
        setBalance(balance);

    }
    // getters
    public String getAccountNumber(){
        return accountNumber;
    }
    public String getAccountHolder(){
        return accountHolder;
    }
    public double getBalance(){
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
    protected void setBalance(double balance){
        if (balance < 0) {
            System.out.println("Error: Initial balance cannot be negative!");
        }else{
            this.balance =balance;
        }
    }

    // methods
    public void deposit(double amount){
        if(amount > 0){
            balance +=amount;
            System.out.println("You have deposited: $ "+ amount+" .Your balance is $ "+balance);
        }else{
            System.out.println("You must deposit amount greter than 0 ");
        }

    }

    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance -=amount;
            System.out.println("You have withdrawn: $ "+ amount+" .Your balance is $ "+balance);
        }else{
            System.out.println("You can't withdraw zero amount or any amount greater than your balance");
        }
        
    }

    public void displayAccountInfo(){
        System.out.println("======= ACCOUNT DETAILS =======");
        System.out.println("Account : " + accountNumber);
        System.out.println("Owner: " + accountHolder);
        System.out.println("Balance: $" + balance);
        System.out.println();

        
    }



}
