package com.driver;

 class classA {
    public String meth() {
        return "Invoking method from class A";
    }
}

 class classB extends classA {


     @Override
    public String meth() {
        return "Method is overridden in Extendend class B";
    }
}

public class Main {

    public static void main(String[] args) {
        classB obj = new classB();
        System.out.println(obj.meth());
    }
}

// STEPS:

// Method Overriding

// Task 1: create a class A, with a method named meth having returning a string
// "Invoking method from class A"

// Task 2: create a class B which extends class A

// Task 3: create object of class B and call method meth of class A with it

// Task 4: Now override methode meth of class A in class B, which returns the
// following string "Method is overridden in Extendend class B"

// Task 5: call this overridden method from obj of class B