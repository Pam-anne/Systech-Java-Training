package com.github.pamanne.inheritance;

public class Cat extends Animal {

    public Cat(String name){
        super(name);
    }
    
    @Override
    public void makeSound(){
        System.out.println("A cat meows");
    }

   
    
}
