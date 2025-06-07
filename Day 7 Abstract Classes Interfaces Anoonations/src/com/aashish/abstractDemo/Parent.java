package com.aashish.abstractDemo;

public abstract class Parent {

    int age;

    final int VALUE;

    public Parent(int age) {
        this.age = age;
        VALUE = 12342232;

    }

    static void hello (){
        System.out.println("hey");
    }

    void normal () {
        System.out.println("this is a normal method");
    }

    // you cant create object of abstract classes and also you cant  create abstract constructor

    abstract void career();
    abstract void partner();

}
