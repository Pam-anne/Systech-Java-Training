package com.github.pamanne.asssesments.javase014.Problem3_Pamela_Abaki;

public class Clothing extends Product {

    private String size;
    private String material;
    private String color;
    private static final double DISCOUNT = 300.0;

    public Clothing(String productId, String name, double price, int stockQuantity, String size, String material,
            String color) throws InvalidProductException {
        super(productId, name, price, stockQuantity);
        if (size == null || size.trim().isEmpty()) {
            throw new InvalidProductException("Size can not be empty");
        }
        if (material == null || material.trim().isEmpty()) {
            throw new InvalidProductException("Material cannot be empty.");
        }
        if (color == null || color.trim().isEmpty()) {
            throw new InvalidProductException("Color cannot be empty.");
        }

        this.size = size;
        this.material = material;
        this.color = color;
    }

    @Override
    public double calculateDiscount() {
        double priceAfterDiscount = price - DISCOUNT;
        return priceAfterDiscount;

    }

    @Override
    public String getProductType() {
        return "Clothing";

    }

    @Override
    public void displayProductInfo() {
        System.out.println("\t CLOTHING DETAILS");
        super.displayProductInfo();
        System.out.println("Price After Discount:$ " + calculateDiscount());
        System.out.println("Type: " + getProductType());
        System.out.println("Size: " + size);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);

    }

}
