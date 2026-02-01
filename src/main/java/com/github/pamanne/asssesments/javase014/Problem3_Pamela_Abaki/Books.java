package com.github.pamanne.asssesments.javase014.Problem3_Pamela_Abaki;

public class Books extends Product {

    private String author;
    private String publisher;
    private String isbn;
    private static final double DISCOUNT = 100.0;

    public Books(String productId, String name, double price, int stockQuantity, String author, String publisher,
            String isbn) throws InvalidProductException {
        if (author == null || author.trim().isEmpty()) {
            throw new InvalidProductException("Author cannot be empty.");
        }
        if (publisher == null || publisher.trim().isEmpty()) {
            throw new InvalidProductException("Publisher cannot be empty.");
        }
        if (isbn == null || isbn.trim().isEmpty()) {
            throw new InvalidProductException("ISBN cannot be empty.");
        }
        super(productId, name, price, stockQuantity);
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
    }

    @Override
    public double calculateDiscount() {
        double priceAfterDiscount = price - DISCOUNT;
        return priceAfterDiscount;

    }

    @Override
    public String getProductType() {
        return "Books";

    }

    @Override
    public void displayProductInfo() {
        System.out.println("\t BOOKS DETAILS");
        super.displayProductInfo();
        System.out.println("Price After Discount:$ " + calculateDiscount());
        System.out.println("Type: " + getProductType());
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("ISBN: " + isbn);

    }

}
