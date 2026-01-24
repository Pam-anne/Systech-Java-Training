package com.github.pamanne.asssesments.javase010.quiz4_pamela_abaki;

public class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance,double interestRate) {
        super(accountNumber,accountHolder,balance);
        setInterestRate(interestRate);

    }

    public double getInterestRate(){
        return interestRate;
    }

    public void setInterestRate(double interestRate){
         if(interestRate < 0) {
            System.out.println("Error: Interest rate cannot be negative");
        }
        this.interestRate = interestRate;

    }


    @Override
    public void withdraw(double amount){
        if(getBalance()-amount >= 100.0){
            super.withdraw(amount);
        }else{
            System.out.println("Error: You can not withdraw!Remaining balance after withdrawal must be atleast $100");
        }
        
    }

    public void applyInterest(){
        double interest = getBalance() * (interestRate/100);
        deposit(interest);
        System.out.println("Interest of: $"+ interest + " applied");
    }
    
}
