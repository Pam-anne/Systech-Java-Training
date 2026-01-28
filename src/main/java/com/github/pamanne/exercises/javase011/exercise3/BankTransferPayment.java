package com.github.pamanne.exercises.javase011.exercise3;

public class BankTransferPayment extends Payment {
    private String accountNumber;
    private String bankName;
    final double balanceBeforePayment = 5050.0;

    public BankTransferPayment(String accountNumber, String bankName, double amount) {
        super(amount);
        setAccountNumber(accountNumber);
        setBankName(bankName);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        if (bankName != null && !bankName.isEmpty()) {
            this.bankName = bankName;
        } else {
            System.out.println("Bank name can  not be empty or null");
        }
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber.matches("\\d{12}")) {
            this.accountNumber = accountNumber;

        } else {
            System.out.println("Error:The account number must be 12 digits");
        }

    }

    @Override
    public double processPayment() {
        double balanceAfterPayment = balanceBeforePayment - getAmount();
        return balanceAfterPayment;

    }

    @Override
    public void getPaymentDetails() {
        System.out.println("Processing Bank payment of $" + getAmount());
        System.out.println("\t PAYMENT DETAILS");
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Bank Name: " + getBankName());
        System.out.println("Balance Before Payment:$ " + balanceBeforePayment);
        System.out.println("Amount Paid:$ " + getAmount());
        System.out.println("Balance After Payment:$ " + processPayment());
        System.out.println("Payment Date: " + getPaymentDate()+"\n");

    }

}
