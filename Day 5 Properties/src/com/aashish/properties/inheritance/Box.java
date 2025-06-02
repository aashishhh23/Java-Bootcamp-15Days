package com.aashish.properties.inheritance;

public class Box {
 private    double l;
    double h;
    double w;
//   double weight;

    // create a static method

    static void greeting() {
        System.out.println("Hey i am in Box class. greetings!");
    }

    public double getL() { // to get L go to main and type box.getL();
        return l;
    }

    // create a constructor
    Box () {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }
    // cube
    Box (double side) {

     //super(); // 1.it means directly above it that is boxweight 2] object class

        this.w = side;
        this.l = side;
        this.h = side;
    }

    Box(double l, double h, double w) {
        System.out.println("Box class constructor");
        this.l = l;
        this.h = h;
        this.w = w;
    }
        Box(Box old) {
            this.h = old.h;
            this.l = old.l;
            this.w = old.w;

    }
    public void information (){
        System.out.println("Running the box");
    }
}
