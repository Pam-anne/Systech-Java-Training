package com.github.pamanne.asssesments.javase010.quiz1_pamela_abaki;

public class Main {
    public static void main(String[] args) {

        Book book1 =new Book("Example1", "Robert C. Martin", "9780132350884", 29.99);
        System.out.println(book1.toString());
        book1.borrowBook();    
        book1.borrowBook(); 
            
        book1.returnBook();        
        
        System.out.println("\n.... TESTING TITLE VALIDATION...");
        Book book2 = new Book("", "Some Author", "1234567890123", 10.0);
        
        
        System.out.println("\n.... TESTING ISBN VALIDATION...");
        Book book3 = new Book("Title", "Author", "12345", 10.0); 
       
        System.out.println("\n.... TESTING PRICE VALIDATION...");
        Book book4 = new Book("Title", "Author", "1234567890123", -5.0); 
        
    }
}
