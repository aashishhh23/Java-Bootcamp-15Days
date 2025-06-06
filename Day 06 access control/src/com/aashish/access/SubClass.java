package com.aashish.access;

public class SubClass {
    private int num;

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(45, "Aashish Kumar");
        int n = obj.num;

        System.out.println(obj instanceof Object);
    }

}
