package com.github.pamanne.inheritance;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Bosco");
        Cat cat = new Cat("Bella");
        Animal animal = new Animal("Duke");

        dog.makeSound();
        cat.makeSound();
        animal.makeSound();
        dog.makSOund2();
    }
    
}
