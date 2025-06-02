package com.aashish.properties.polymorphism;

public class Shapes {
    void area() {
        System.out.println("I am in shapes");
    }


//Early binding: check notes
//    final void area() {
//        System.out.println("I am in shapes");
//
//    }
}

// Types Of Polymorphism
// 1. Compile Time/ Static Polymorphism:- Achieved via Method
// Overloading ( when a class has multiple methods with the same name
// but the number and types and orders of the parameters and return type can be different
// OR Same name but types, arguments, return types, ordering can be different
// example multiple constructor [ A a = new A();
//                               A a ? = new A (3, 4);

//2] Run time / Dynamic Polymorphism :- Achieved by method overriding