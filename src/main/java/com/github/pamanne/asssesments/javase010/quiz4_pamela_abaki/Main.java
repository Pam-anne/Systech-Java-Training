package com.github.pamanne.asssesments.javase010.quiz4_pamela_abaki;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("=== REGULAR BANK ACCOUNT ===");
        BankAccount acc1 = new BankAccount("REG001", "Charlie", 1000);
        acc1.displayAccountInfo();
        acc1.deposit(500);
        acc1.withdraw(950);
        System.out.println();

        System.out.println("=== SAVINGS ACCOUNT ===");
        SavingsAccount savings = new SavingsAccount("SAV001", "Alice", 500, 5.0);
        savings.displayAccountInfo();
        savings.deposit(200);
        savings.withdraw(500);  
        savings.withdraw(200);  
        savings.applyInterest();
        System.out.println();
        
        System.out.println("=== CHECKING ACCOUNT ===");
        CheckingAccount checking = new CheckingAccount("CHK001", "Bob", 300, 500);
        checking.displayAccountInfo();
        checking.withdraw(400);  
        checking.withdraw(500);  
        checking.deposit(200);
        System.out.println();

        // Demonstrate polymorphism
        System.out.println("=== POLYMORPHIC BEHAVIOR ===");
        BankAccount account1 = new BankAccount("REG002", "David", 1000);
        BankAccount account2 = new SavingsAccount("SAV002", "Emma", 800, 3.5);
        BankAccount account3 =  new CheckingAccount("CHK002", "Frank", 500, 300);
        
        
        System.out.println("Processing withdrawals for all accounts:");
            account1.withdraw(200);
            account2.withdraw(200);
            account3.withdraw(200);
        

        
    }
}