package com.github.pamanne.asssesments.javase014.Problem2_Pamela_Abaki;

public class BankTest {
    public static void main(String[] args) {
        try {
            BankAccount account1 = new BankAccount("ACC001", "Alice", 1000);
            BankAccount account2 = new BankAccount("ACC002", "Bob", 500);

            BankAccount[] allAccounts = { account1, account2 };

            account1.deposit(-100); 
            account1.withdraw(2000); 
            account1.transfer("INVALID", 100, allAccounts); 
        } catch (InvalidAccountException e) {
            System.out.println("Account creation error: " + e.getMessage());

        } catch (InsufficientFundsException e) {
            System.out.println("Funds error: " + e.getMessage());

        } catch (InvalidTransactionException e) {
            System.out.println("Transaction error: " + e.getMessage());

        } catch (AccountNotFoundException e) {
            System.out.println("Account error: " + e.getMessage());

        } finally {
            System.out.println("Transaction processing completed");
        }
    }
}