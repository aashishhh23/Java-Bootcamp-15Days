package com.aashish.MultiThreading;

public class World extends Thread {

// 2nd method to create thread
//public class World extends implements Runnable {
    @Override
    public void run() {
        for (; ; ) {
            System.out.println("World");
        }
    }


    }
