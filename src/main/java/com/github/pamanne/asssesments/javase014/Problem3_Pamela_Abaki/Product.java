package com.github.pamanne.asssesments.javase014.Problem3_Pamela_Abaki;

public abstract class Product {

    protected String productId;
    protected String name;
    protected double price;
    protected int stockQuantity;
    private static final double PRODUCT_TAX = 0.05;

    public Product(String productId, String name, double price, int stockQuantity)
            throws InvalidProductException {
        if (price <= 0) {
            throw new InvalidProductException("Price must be greater than 0");
        }
        if (stockQuantity <= 0) {
            throw new InvalidProductException("Stock Quantity must be greater than 0");
        }
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidProductException("Name cannot be empty.");
        }
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;

    }

    public abstract double calculateDiscount();

    public abstract String getProductType();

    public void reduceStock(int quantity) throws OutOfStockException {
        if (quantity > stockQuantity)
            throw new OutOfStockException("The stock reduction quantity must not be greater than stock quantity");

        stockQuantity -= quantity;
        System.out.println("Remaining stock: "+ stockQuantity);
    }

    public void applyTax() {
        price = price + price * PRODUCT_TAX;

    }

    public void displayProductInfo() {
        System.out.println("ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price:$ " + price);
        System.out.println("Quantity: " + stockQuantity);

    }

}
