package com.github.pamanne.asssesments.javase014.Problem3_Pamela_Abaki;

public class Electronics extends Product {
    private int warrantyPeriod;
    private int powerConsumption;
    private static final double DISCOUNT = 200.0;

    public Electronics(String productId, String name, double price, int stockQuantity, int warrantyPeriod,
            int powerConsumption) throws InvalidProductException {
        super(productId, name, price, stockQuantity);
        if (warrantyPeriod <= 0) {
            throw new InvalidProductException("Warranty period must be greater than 0!");
        }
        if (powerConsumption <= 0) {
            throw new InvalidProductException("Power consumption must be positive!");
        }
        this.warrantyPeriod = warrantyPeriod;
        this.powerConsumption = powerConsumption;
    }

    @Override
    public double calculateDiscount() {
        double priceAfterDiscount = price - DISCOUNT;
        return priceAfterDiscount;

    }

    @Override
    public String getProductType() {
        return "Electronics";

    }

    @Override
    public void displayProductInfo() {
        System.out.println("\t ELECTRONICS DETAILS");
        super.displayProductInfo();
        System.out.println("Price After Discount: " + calculateDiscount());
        System.out.println("Type: " + getProductType());
        System.out.println("Waranty Period: " + warrantyPeriod + "year");
        System.out.println("Power Consumption: " + powerConsumption +"W");

    }

}
