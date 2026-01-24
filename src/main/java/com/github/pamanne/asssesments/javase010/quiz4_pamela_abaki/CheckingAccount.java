package com.github.pamanne.asssesments.javase010.quiz4_pamela_abaki;

public class CheckingAccount extends BankAccount{

    private double overdraftLimit;


    public CheckingAccount(String accountNumber, String accountHolder, double balance,double overdraftLimit) {
        super(accountNumber,accountHolder,balance);
        setOverdraftLimit(overdraftLimit);

    }

    public void setOverdraftLimit(double overdraftLimit){
        if(overdraftLimit < 0) {
            throw new IllegalArgumentException("Overdraft limit cannot be negative");
        }
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        double currentBalance = getBalance();
        
        if (amount > currentBalance + overdraftLimit) {
            System.out.println("Exceeds overdraft limit of $" + overdraftLimit);
        } else {
            setBalance(currentBalance - amount);
            super.withdraw(amount);
        }
    }
    
    
}
