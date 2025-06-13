package com.aashish.Multithreading.ThreadCommunication;


class SharedResource {
        private int data;
        private boolean hasData;

        public synchronized void produce(int value) {
            while (hasData) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

            data = value;
            hasData = true;
            System.out.println("Produced: " + value);
            notify();
        }
        public synchronized int consume() {
            while (!hasData) {
                try {
                    wait();
                }catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }

            }
            hasData=false;
            System.out.println("Consumed: " + data);
            notify();
            return data;
        }
    }

    class Producer implements  Runnable {
        private SharedResource resource;

        public Producer(SharedResource resource) {
            this.resource = resource;


        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i ++){
                resource.produce(i);
            }
            return null;
        }
    }



    class Consumer implements  Runnable {
        private SharedResource resource;

        public Consumer(SharedResource resource) {
            this.resource = resource;


        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i ++){
                resource.consume();
            }
            return null;
        }
    }

    public class ThreadCommunication {
        public void main(String[] args) {
            SharedResource resource = new SharedResource();
            Thread producerThread = new Thread(new Producer(resource));
            Thread consumerThread = new Thread(new Producer(resource));

            producerThread.start();
            consumerThread.start();

        }

    }

