package com.github.pamanne.asssesments.javase014.Problem3_Pamela_Abaki;

public class ECommerceTest {
    public static void main(String[] args) {

        // Test Electronics with invalid price
        try {
            Product laptop = new Electronics("E001", "Laptop", -999.99, 10, 2, 150);
            laptop.displayProductInfo();
            System.out.println();
        } catch (InvalidProductException e) {
            System.out.println("Error: " + e.getMessage());
            
        }

        // Test valid Electronics and OutOfStockException
        try {
            Product phone = new Electronics("E002", "Smartphone", 50000, 5, 1, 80);
            phone.displayProductInfo();

            phone.reduceStock(10);
        } catch (InvalidProductException | OutOfStockException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println();
        }

        // Test Clothing with valid data
        try {
            Product shirt = new Clothing("C001", "T-Shirt", 1200, 8, "M", "Cotton", "Blue");
            shirt.displayProductInfo();

            shirt.reduceStock(3);
            System.out.println();
        } catch (InvalidProductException | OutOfStockException e) {
            System.out.println("Error: " + e.getMessage());
            
        }

        // Test Books with invalid ISBN
        try {
            Product book1 = new Books("B001", "Java Basics", 2000, 10,
                    "John Doe", "TechPress", " ");
            book1.displayProductInfo();
        } catch (InvalidProductException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println();
        }

        // Test Books with valid data
        try {
            Product book2 = new Books("B002", "Python Mastery", 3500, 15,
                    "Jane Smith", "CodeWorld", "9780134685991");
            book2.displayProductInfo();

            book2.reduceStock(5);
            System.out.println();
        } catch (InvalidProductException | OutOfStockException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
