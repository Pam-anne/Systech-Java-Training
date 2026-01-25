package com.github.pamanne.asssesments.javase010.part2_pamela_abaki;



public class Transaction {
    private String type;
    private double amount;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "- " + type + ": $" + amount;
    }
}
    

