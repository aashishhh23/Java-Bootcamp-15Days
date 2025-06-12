package com.aashish.Multithreading.Synchronization;

public class Test {
    public static void main(String[] args) {
        Counter counter = new Counter(); //object
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {

        }
        System.out.println(counter.getCount());
    }
}
 // here output is not 2000 ( since we run a loop upto 2000 times )
// here is different different output like 1234, 1938...
//  because We share one object between multiple threads thats why value is different.
// to make sure that only one method to be access while other are waiting
// so to correct this we need to use synchronized keyword
// now always show output of 2000
