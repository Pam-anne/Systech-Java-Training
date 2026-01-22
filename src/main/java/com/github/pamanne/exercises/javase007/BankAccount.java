package com.github.pamanne.exercises.javase007;

import java.lang.reflect.Constructor;

public class BankAccount {
    public String accountNumber;
    public String accountHolder;
    public double balance;

    
    public BankAccount(){
        accountNumber = "default";
        accountHolder = "default";
        balance = 0.0;

    }

    public BankAccount(String accountNum,String accountOwner){
        accountNumber = accountNum;
        accountHolder = accountOwner;
        balance = 0.0 ;

    }

    public BankAccount(String accountNum,String accountOwner,double bal){
        accountNumber = accountNum;
        accountHolder = accountOwner;
        balance = bal ;
        
    }


    public void deposit(double amount){
        if(amount > 0){
            balance +=amount;
            System.out.println("You have deposited: Ksh "+ amount+" .Your balance is Ksh "+balance);
        }else{
            System.out.println("You must deposit amount greter than 0 ");
        }

    }

    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance -=amount;
            System.out.println("You have withdrawn: Ksh "+ amount+" .Your balance is Ksh "+balance);
        }else{
            System.out.println("You can't withdraw zero amount or any amount greater than your balance");
        }
        
    }

    public void displayBalance(){
        System.out.println("======= ACCOUNT DETAILS =======");
        System.out.println("   Account : " + accountNumber);
        System.out.println("   Owner: " + accountHolder);
        System.out.println("   Balance: Ksh" + balance);
        System.out.println();

        
    }
    public static void main(String[] args) {
        // Default constructor
        BankAccount account1 = new BankAccount();
        account1.displayBalance();

        // Constructor with accountNumber and accountHolder
        BankAccount account2 = new BankAccount("A001","Pamela");
        account2.deposit(5500.0);
        account2.displayBalance();


        // Constructor with all properties
        BankAccount account3 = new BankAccount("A002","Anne",5000);
        account3.withdraw(10000.0);
        account3.withdraw(100.0);
        account3.displayBalance();


    }
    
}
