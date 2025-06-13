package com.aashish.Multithreading.ThreadCommunication;

public class LambdaExpression {
    public static void main(String[] args) {
        // THIS
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        };

        // OR THIS [ LAMBDA EXPRESSION ]
//        Runnable task1= () -> {
//            System.out.println("Hello");
//        };
//        Thread t1= new Thread(task1);
//        t1.start();

        // OR THIS

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello");
            }
        });
        t1.start();
    }
}
