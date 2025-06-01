package com.aashish.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void message() {
        System.out.println("Hello World");
       // System.out.println(this age); // we cannot use [this] keyword inside static because static is not depend on the object
    }
    // create constructor by [alt+insert]

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;

        this.population += 1;

        Human.message();
    }

}
