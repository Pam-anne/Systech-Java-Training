package com.github.pamanne.exercises.javase011.exercise3;

import java.time.LocalDate;

public class CreditCardPayment extends Payment {
    private String cardNumber;
    private LocalDate expiryDate;
    private final double balanceBeforePayment = 6050.0;

    public CreditCardPayment(String cardNumber, LocalDate expiryDate, double amount) {
        super(amount);
        setCardNumber(cardNumber);
        setExpiryDate(expiryDate);
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setCardNumber(String cardNumber) {
        if (cardNumber.matches("\\d{12}")) {
            this.cardNumber = cardNumber;

        } else {
            System.out.println("Error:The Card number must be 12 digits");
        }

    }

    public void setExpiryDate(LocalDate expiryDate) {
        if (expiryDate != null && expiryDate.isAfter(LocalDate.now())) {
            this.expiryDate = expiryDate;
        } else {
            System.out.println("Expiry date must not be null and must be a future date");
        }
    }

    @Override
    public double processPayment() {
        double balanceAfterPayment = balanceBeforePayment - getAmount();
        return balanceAfterPayment;

    }

    @Override
    public void getPaymentDetails() {
        System.out.println("Processing Credit payment of $" + getAmount());
        System.out.println("\t PAYMENT DETAILS");
        System.out.println("Account Number: " + getCardNumber());
        System.out.println("Expiry Date: " + getExpiryDate());
        System.out.println("Balance Before Payment:$ " + balanceBeforePayment);
        System.out.println("Amount Paid:$ " + getAmount());
        System.out.println("Balance After Payment:$ " + processPayment());
        System.out.println("Payment Date: " + getPaymentDate()+"\n");

    }

}
