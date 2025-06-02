package com.aashish.properties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(4.6, 7.9, 9.0);
        box1.getL();
       Box box2 = new Box(box1);
//
//      System.out.println(box1.w + " " + box1.h);

//        BoxWeight box3 = new BoxWeight();
//        BoxWeight box4 = new BoxWeight(2, 3, 4, 8);
//        System.out.println(box3.h + " " + box3.weight);

//        Box box5 = new BoxWeight(2,3,4,8);
//        System.out.println(box5.w);


        //there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. Boxweight
        // hence, you have access to weight variables
        // this also means , that ones you are trying to access should be initialzied
        // but here, when the obj itself is of parent class, how will you call the constructor
        // that is why error

//        Box box6 = new BoxWeight(2,3,4,);
//        System.out.println(box6);

//box1.greeting();

Box box = new BoxWeight(); // Static Method can be Inherited but can't be overridden
// because the main class is always being to be called
// it's not dependent on the object that's why it doesn't matter


        // Overriding depends on Objects but static doesn't depends on the objects
        // hence static method can't be overidding

        BoxWeight.greeting(); //   you can inherit but can't override!
box.greeting();


//        BoxPrice box = new BoxPrice(5, 8, 200);

    }

}
