package com.github.pamanne.exercises.javase011.exercise3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Payment paypal = new PaypalPayment("example@gmail.com",100.0);
        Payment credit = new CreditCardPayment("123456789876",LocalDate.of(2027,5,25),200.0);
        Payment bank = new BankTransferPayment("001122334433","KCB bank",300.0);
    
        paypal.processPayment();
        paypal.getPaymentDetails();

        credit.processPayment();
        credit.getPaymentDetails();

        bank.processPayment();
        bank.getPaymentDetails();
    
    }
    
}
