# Java OOP Questions & Answers

## 1. What is the difference between method overloading and method overriding?


- Method Overloading: this happens when you have multiple methods with the same name  in the same class, but the methods take different parameters (different type ,order or number).
- Method Overriding: This happens when a child class takes a method from its parent class and gives it its own version.


```java
// Method Overloading
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

// Method Overriding
class Animal {
    void sound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}


```
## 2. Why should fields be declared private in a class?

Fields are declared private to protect data from direct access and modification,and therefore the changes can only be done through getters and setters.


``` java

class BankAccount {
    private double balance; 

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(100);
        }
}
```

## 3. When should you use the super keyword?

super is used when you want to refer to parent constructor,or to acces the methods and fields of the parent class.


``` java
class Person {
    protected String name;

    Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    protected int grade;

    Student(String name, int grade) {
        super(name); 
        this.grade = grade;
    }

  
}


```
## 4. What is the purpose of the @Override annotation?

It is used by a child class to replace what is in the parent method.

``` java
class Animal {
    void sound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

```


## 5. How does encapsulation improve code maintainability?



Encapsulation hides internal details and exposes only what’s necessary.

Encapsulation is all about hiding the internal details of a class and only showing what’s necessary.
It makes the code easier to manage because you can change how things work inside the class without breaking other parts of the program.

It also makes the program safer, since the class controls how its data can be changed or read.

``` java

class Employee {
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary > 0) { 
            this.salary = salary;
        }
    }
}


```