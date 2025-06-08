package com.aashish.interfaces.animals;

public interface Animal {

 public static final    int MAX_AGE =50;

    public  abstract void eat();
    void sleep();

    public static void info() {
        System.out.println("This is an Animal Interface");
    }


    // default implements the inherit class and to access this we should create objects of implementation class
   public default void run (int a, int b) {
        System.out.println("Animal is running");
       System.out.println(a + b);
    }
}
