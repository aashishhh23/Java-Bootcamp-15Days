package com.aashish.Multithreading.executorframework;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Main {



//    public static void main(String[] args) throws ExecutionException, InterruptedException {
//
//        // COUNTDOWN LATCH
//
//        int numberOfServices = 3;
////        ExecutorService executorService = Executors.newFixedThreadPool(numberOfServices);
//        CountDownLatch latch = new CountDownLatch(numberOfServices);
//        for (int i = 0; i < numberOfServices; i++) {
//            new Thread(new DependentService(latch)).start();
//        }
//
//        latch.await(5, TimeUnit.SECONDS);
//
//        System.out.println("Main");
//    }
//}
//
//
//    class DependentService implements Runnable {
//
//    private final CountDownLatch latch;
//
//    public DependentService(CountDownLatch latch) {
//        this.latch =latch;
//    }
//
//    @Override
//        public void run() {
//        try {
//            System.out.println(Thread.currentThread().getName() + " service started.");
//            Thread.sleep(2000);
//        } catch (Exception e) {
//
//        } finally {
//            latch.countDown();
//        }
//
//
//        }
//
    }



                                 // CYCLIC BARRIER

//public static void main(String[] args) throws ExecutionException, InterruptedException {
//
//    int numberOfServices = 3;
////        ExecutorService executorService = Executors.newFixedThreadPool(numberOfServices);
//  CyclicBarrier barrier = new CyclicBarrier(numberOfServices);
//    for (int i = 0; i < numberOfServices; i++) {
//        new Thread(new DependentService(barrier)).start();
//    }
//
//    barrier.await(5, TimeUnit.SECONDS);
//
//    System.out.println("Main");
//}
//}
//
//
//class DependentService implements Runnable {
//
//    private final CyclicBarrier barrier;
//
//    public DependentService(CyclicBarrier barrier {
//        this.barrier =barrier;
//    }
//
//    @Override
//    public void run() {
//        try {
//            System.out.println(Thread.currentThread().getName() + " service started.");
//
//            Thread.sleep(2000);
//            System.out.println(Thread.currentThread().getName() + " is waiting at the barrier");
//            barrier.await();
//
//        return "ok";
//
//
//    }
//
//}














//        ExecutorService executorService =Executors.newFixedThreadPool(3);
//        Future<String> future1 = executorService.submit(new DependentService());
//        Future<String> future2 = executorService.submit(new DependentService());
//        Future<String>future3 = executorService.submit(new DependentService());
//
//        future1.get();
//        future2.get();
//        future3.get();
//
//        System.out.println("All dependent services finished. Starting main service...");
//        executorService.shutdown();
//
//    }



//        static class DependentService implements Callable<String>{
//
//            public DependentService(CountDownLatch latch) {
//
//            }
//
//            @Override
//            public String call() throws Exception {
//                System.out.println(Thread.currentThread().getName() + "service started.");
//                Thread.sleep(2000);
//                return "ok";
//
//            }
//        }














     ////  ScheduledExecutorService :- to do work at regular interval

//        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
//
//        scheduler.scheduleAtFixedRate (
//                () -> System.out.println("task executed after 5 second delay !"),
//                5,
//                5,
//                TimeUnit.SECONDS);
//
//        scheduler.scheduleWithFixedDelay(() -> System.out.println("Task executed after every 5 seconds !"),
//        5,5,
//        TimeUnit.SECONDS);
//
//        scheduler.schedule(() -> {
//            System.out.println("Initiating shutdown...");
//            scheduler.shutdown();
//        }, 20, TimeUnit.SECONDS);
//
//
//    }

















//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        Future<Integer> future = executorService.submit(() -> {
//            try {
//                Thread.sleep(2000);
//            }catch (InterruptedException e) {
//                System.out.println("Exception occured: " + e);
//            }
//            return 42;
//                });
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            System.out.println("Exception occured: " + e);
//        }
//
//        future.cancel(false);
//        System.out.println(future.isCancelled());
//        System.out.println(future.isDone());
//        executorService.shutdown();
//    }





















//        ExecutorService executorService = Executors.newFixedThreadPool(2);
//
//        Callable<Integer> callable1 = () -> {
//            System.out.println("Task 1");
//            Thread.sleep(1000);
//            return 1;
//        };
//
//        Callable<Integer> callable2 = () -> {
//            System.out.println("Task 2");
//            Thread.sleep(1000);
//            return 2;
//        };
//
//        Callable<Integer> callable3 = () -> {
//            System.out.println("Task 3");
//            Thread.sleep(1000);
//            return 3;
//        };
//
//        List<Callable<Integer>> list = Arrays.asList(callable2, callable3, callable1);
//
//        List<Future<Integer>> futures = executorService.invokeAll(list, 1, TimeUnit.SECONDS);
//        for (Future<Integer> f: futures) {
//            System.out.println(f.get());
//        }
//
//
//        executorService.shutdown();
//
//    }



















  //  }
//        // ExAmple 2
//  public static void main(String[] args) throws ExecutionException, InterruptedException {
//        ExecutorService executorService = Executors.newFixedThreadPool(2);
//        Future<Integer> submit = executorService.submit(() ->1 + 2);
//        Integer i = submit.get();
//        System.out.println("sum is " + i);
//        executorService.shutdown();
//
//                                               //SHUTDOWN METHOD
//
////        System.out.println(executorService.isShutdown());
//
//                                                  // IS TERMINATED
//
//        System.out.println(executorService.isTerminated());
//
//
//
//
//    }

    // EXAMPLE 1
//public static void main(String[] args) throws ExecutionException, InterruptedException {
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        Future<?> future = executorService.submit(() -> System.out.println("hello"));
//        future.get();
//        executorService.shutdown();
//        executorService.submit(() -> System.out.println("Hello"), "success");
//
//        }
//
//
//
//    }








        // Callable - If We want to "return"






//  public static void main(String[] args) throws ExecutionException, InterruptedException {

//        long startTime = System.currentTimeMillis();
//        ExecutorService executor = Executors.newFixedThreadPool(9);
//
//
//        for (int i = 1; i < 10; i++) {
//            int finalI = i;
//            executor.submit(() -> {
//                long result = factorial(finalI);
//                System.out.println(result);
//            });
//        }
//        executor.shutdown();
//        try {
//      while (!executor.awaitTermination(10, TimeUnit.MILLISECONDS)) {
//          System.out.println("Waiting....");
//      }
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("Total time: " + (System.currentTimeMillis() - startTime));
//    }
//
//
//
//
////                       this method give us factorial
//
//private static long factorial(int n) {
//        try {
//            Thread.sleep(1000);
//        }catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        long result = 1;
//    for(int i =1; i <= n; i++) {
//        result *=i;
//
//    }
//return result;
//    }
//}
