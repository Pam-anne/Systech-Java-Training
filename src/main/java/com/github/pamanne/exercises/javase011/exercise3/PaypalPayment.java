package com.github.pamanne.exercises.javase011.exercise3;

public class PaypalPayment extends Payment {
    private String email;
    private final double balanceBeforePayment = 1260.0;

    public PaypalPayment(String email, double amount) {
        super(amount);
        setEmail(email);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@") && email.contains(".")) {
            this.email = email;
        } else {
            System.out.println("Error: Invalid email format.");
        }
    }

    @Override
    public double processPayment() {
        double balanceAfterPayment = balanceBeforePayment - getAmount();
        return balanceAfterPayment;

    }

    @Override
    public void getPaymentDetails() {
        System.out.println("Processing PayPal payment of $" + getAmount());
        System.out.println("\t PAYMENT DETAILS");
        System.out.println("Account Email: " + getEmail());
        System.out.println("Balance Before Payment:$ " + balanceBeforePayment);
        System.out.println("Amount Paid:$ " + getAmount());
        System.out.println("Balance After Payment:$ " + processPayment());
        System.out.println("Payment Date: " + getPaymentDate() + "\n");

    }

}
