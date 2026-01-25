package com.github.pamanne.asssesments.javase010.part2_pamela_abaki;

public class CheckingAccount extends BankAccount{

    private double overdraftLimit;


    public CheckingAccount(String accountNumber, String accountHolder, double balance,double overdraftLimit) {
        super(accountNumber,accountHolder,balance);
        setOverdraftLimit(overdraftLimit);

    }

    public void setOverdraftLimit(double overdraftLimit){
        if(overdraftLimit < 0) {
            System.out.println("Overdraft limit cannot be negative");
            this.overdraftLimit=0.0;
        }
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        
        if (amount > getBalance()+ overdraftLimit) {
            System.out.println("Exceeds overdraft limit of $" + overdraftLimit);
        } else {
            setBalance(getBalance() - amount);
            super.withdraw(amount);
        }
    }
    
    
}
