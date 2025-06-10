package com.aashish.MultiThreading;

public class MyThread extends Thread {



//    public MyThread(String name) {
//        super(name);
//    }

    //constructor of thread
//    public MyThread() {
//        super(name);
//    }

//    @Override
//    public void run() {
//        while (true) {
//            System.out.println("Hello world !");
//        }
//    }
//
//    public static void main(String[] args) {
//        MyThread myThread = new MyThread();
//        myThread.setDaemon(true);
//        MyThread t1 = new MyThread();
//        t1.start();
//        myThread.start(); // In RUnnable state
//        System.out.println("Main done");
//    }
//}
                                         // yield method


//        for (int i =0; i <5; i++){
//            System.out.println(Thread.currentThread().getName() + "is running");
//            Thread.yield();
//        }
//    }
//    public static void main(String[] args) throws InterruptedException {
//        MyThread t1 = new MyThread("t1");
//        MyThread t2 = new MyThread("t2");
//
//        t1.start();
//        t2.start();

 //   }
//        try {
//            Thread.sleep(1000);
//            System.out.println("thread is running....");
//        } catch (InterruptedException e) {
//            System.out.println("thread Interuppted: " + e);
//        }
//    }

//    public static void main(String[] args) {
//        MyThread t1 = new MyThread();
//        t1.start();
//        t1.interrupt();
//
//    }



//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 100000; j++) {
//
//            }
//
//            System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() + "- count: " + i);
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//
//            }
//
//        }
//
//    }

//    public static void main(String[] args) throws InterruptedException {
//        MyThread l = new MyThread("Low priority Thread");
//        MyThread m = new MyThread("Medium priority Thread");
//        MyThread h = new MyThread("High Priority Thread");
//        l.setPriority(Thread.MIN_PRIORITY);
//        m.setPriority(Thread.MIN_PRIORITY);
//        h.setPriority(Thread.MIN_PRIORITY);
//        l.start();
//        m.start();
//        h.start();


        // create new thread
//        Thread t1 = new Thread();
//        t1.start();









//        for (int i = 1; i<=5; i++){
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println(i);
//        }
//        System.out.println("Thread is running....");
//    }
//
//    public static void main(String[] args) throws InterruptedException {
//        MyThread t1 = new MyThread();
//        t1.start();
//        t1.join();
//        System.out.println("hello");

  //  }


//    @Override
//    public void run() {
//        System.out.println("Running");
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            System.out.println(e);
//        }
//
//    }
//
//    public static void main(String[] args) throws InterruptedException {
//        MyThread t1 = new MyThread();
//        System.out.println(t1.getState());
//        t1.start();
//        System.out.println(t1.getState());
//        Thread.sleep(100);
//        System.out.println(t1.getState());
//        t1.join();
//        System.out.println(t1.getState());



}
