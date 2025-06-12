package com.aashish.Multithreading.Synchronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairnessLockExample {

    private final Lock lock =new ReentrantLock(true);

    public void accessResource() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName()+" acquired the lock");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }finally {
            lock.unlock();
            System.out.println(Thread.currentThread().getName() + " released the lock");
        }
    }

    public static void main(String[] args) {
        FairnessLockExample FairnessLockExample = new FairnessLockExample();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                FairnessLockExample example = null;
                example.accessResource();
            }
        };

        Thread thread1 = new Thread(task, "Thread 1");
        Thread thread2 = new Thread(task, "Thread 2");
        Thread thread3 =new Thread(task,"Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();
    }

}
