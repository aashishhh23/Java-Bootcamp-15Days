package com.aashish.Multithreading.Synchronization;

public class Counter {
    private int count = 0;

 //   to synchronized all method
//    public synchronized void increment(){
//        count++;
//    }

    // to synchronized only one block that only one thread access one time

    public void increment() {
        synchronized (this) {
            count++;
        }
    }
    public int getCount() {
        return count;
    }
}

