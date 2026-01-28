package com.github.pamanne.exercises.javase011.exercise3;

import java.time.LocalDate;

public abstract class Payment {
    private double amount;
    private LocalDate paymentDate;

    public Payment(double amount) {
        validateAmount(amount);
        this.paymentDate = LocalDate.now();
    }

    public void validateAmount(double amount) {
        if (amount > 0) {
            this.amount = amount;
        } else {
            System.out.println("amount can not be zero or negative");
        }
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public abstract double processPayment();

    public abstract void getPaymentDetails();

}
