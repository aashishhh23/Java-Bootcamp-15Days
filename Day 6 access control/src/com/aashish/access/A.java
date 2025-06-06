package com.aashish.access;

public class A {
    protected int num;
    String name;
    int[] arr;

    // Add getter :- Get the value
    // and setter  :- Set the value


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr =  new int[num];
    }
}
