package com.aashish.properties.polymorphism;

public class Numbers {

    // Overloaded method - different parameter types (double, int)
    double sum(double a, int b) {
        return a + b; // returns sum as double
    }

    // Overloaded method - same parameter count as above but different types (int, int)
    double sum(int a, int b) {
        return a + b; // returns sum as double (due to method return type)
    }

    // Overloaded method - different number of parameters (3 ints)
    int sum(int a, int b, int c) {
        return a + b + c; // returns sum as int
    }

    public static void main(String[] args) {
        // Creating object to call non-static methods
        Numbers obj = new Numbers();

        // Calling method with two int parameters
        obj.sum(2, 3); // will call sum(int, int)

        // Calling method with three int parameters
        obj.sum(1, 3, 7); // will call sum(int, int, int)

        // Below line will give compile-time error as no matching method is found
        // obj.sum(4, 5, 6 ,8); // Uncommenting this will cause error
    }
}
