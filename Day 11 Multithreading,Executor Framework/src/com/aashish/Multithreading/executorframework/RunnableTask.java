package com.aashish.Multithreading.executorframework;

public class RunnableTask implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(1);
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
