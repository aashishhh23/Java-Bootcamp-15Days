package com.aashish.exceptionHandling;

public class FinallyBlockInExceptions {
    public static void main(String[] args) {
        int a[] = new int[5];
//
//        System.out.println("Hello World");
//
//        try {
//            System.out.println(a[8]);
//        }catch (Exception e) {
//            System.out.println("Exception Handled");
//        } finally {
//            System.out.println("I will always run");
//        }
//        System.out.println("bye World");


        try {
            getNumberFromArray(a);
        } catch (Exception e) {
            System.out.println("catched the exception" +e.getMessage());
        }

    }

    static int getNumberFromArray(int a[]) throws ArithmeticException {
        return a[8];
    }
}
