package com.aashish.Multithreading.Synchronization;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private int balance = 100;

    private final Lock lock = new ReentrantLock(); //

    public void withdraw(int amount)  {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw "+ amount);

        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                if (balance >= amount) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " proceeding with withdrawl");
                        Thread.sleep(3000); // simulate time taken to process the withdrawl
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " completed withdrwal. Remaining balance: " + balance);
                    } catch (Exception e) {
                        Thread.currentThread().interrupt();
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + "insufficient balance");
                }
            }else{
                System.out.println(Thread.currentThread().getName() + "could not acquire the lock");
            }
            }catch (Exception e){
            Thread.currentThread().interrupt();

        }
        if (Thread.currentThread().isInterrupted()){
            System.out.println("");
        }

























//        if (balance>= amount) {
//            System.out.println(Thread.currentThread().getName()+ " proceeding with withdrawl");
//try {
//    Thread.sleep(10000);
//} catch (InterruptedException e) {
//
//}
//balance -= amount;
//            System.out.println(Thread.currentThread().getName()+"completed withdrawl.Remaining balance: " + balance);
//        }else {
//            System.out.println(Thread.currentThread().getName() +"insufficient balance");
//        }
   }
}

