package com.github.pamanne.asssesments.javase010.quiz1_pamela_abaki;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private double price;
    private boolean isAvailable;

    public Book(String title,String author,String isbn,double price){
        setTitle(title);
        setAuthor(author);
        setIsbn(isbn);
        setPrice(price);
        this.isAvailable = true;
        
    }

    // getters
    public String getTitle(){
        return title;
    }

     public String getAuthor(){
        return author;
    }
    public String getIsbn(){
        return isbn;
    }
    public double getPrice(){
        return price;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    

    // setters

    public void setTitle(String title){
        if(title != null && !title.isEmpty()){
            this.title=title;
        }else{
            System.out.println("Error: Title can not be null or empty");
        }
    }

    public void setAuthor(String author){
        if(author != null && !author.isEmpty()){
            this.author=author;
        }else{
            System.out.println("Error: Author can not be null or empty");
        }
    }

    public void setIsbn(String isbn){
        if(isbn !=null && isbn.matches("\\d{13}")){
            this.isbn=isbn;
        }else{
            System.out.println("Error: isbn of a book must be exactly 13 digits");
        }
    }

     public void setPrice(double price){
        if(price>0){
            this.price=price;
        }else{
            System.out.println("Error: price of a book can not be negative");
        }
    }

  
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    // methods

    public String toString(){
        return "BookTitle: "+ title +" ,Author: "+ author+" ,ISBN: "+ isbn +" ,Price: $"+price+ " ,Available: "+isAvailable;

    }

    public void borrowBook(){
        if(!isAvailable){
            System.out.println("Sorry! The book you requested is not available");
        }else{
            System.out.println("You have successfully borrowed the book,make sure to return on time ");
            isAvailable=false;
        }

    }
    public void returnBook(){
        if(!isAvailable){
            System.out.println("Thank you for returning the book");
            isAvailable = true;

        }else{
            System.out.println("The book was not borrowed,you can not return a book that is already available in store.");
        }

    }

    
}
