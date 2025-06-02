package com.aashish.properties.inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    // @Override
    static void greeting() {
        System.out.println("Hey I am in BoxWeight Class, greetings!");
    }

    BoxWeight(BoxWeight other) {
        super(other);
        weight= other.weight;

    }

    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }




    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // what is this? call the parent class constructor
        //used to initialize values present in parent class

   //     System.out.println(super.weight); // super is used because in the box class there is double.weight variable so their value used here
        this.weight = weight;
    }
}

// super class does not know what base/child class contain
// child class care about parent class contains

// SINGLE INHERITANCE: ONE CLASS EXTENDS ANOTHER CLASS
// MULTILEVEL :
// MULTIPLE :- ONE CLASS EXTENDING MORE THAN 1 CLASS  && it doesn't work in JAVA
// if 2 or more parents class have same properties then child class got confused ki which one to pick !!

// HIERARCHIAL :- One class is inherited by many classes!
// HYBRID :- COMBINATION OF SINGLE AND MULTIPLE [ Not in Java]

// POLYMORPHISM :- MANY WAYS TO REPRESENT A SINGLE ENTITY OR ITEM