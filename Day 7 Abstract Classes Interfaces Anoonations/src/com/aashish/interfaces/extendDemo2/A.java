package com.aashish.interfaces.extendDemo2;

public interface A {

    // we know static method never be inherited
// static interfaces methods should always have a body
    // call via the interfaces name

    static void greeting() {
        System.out.println("Hey I am static methof");
    }



    default void fun() {
        System.out.println("I am in A");
    }
}
