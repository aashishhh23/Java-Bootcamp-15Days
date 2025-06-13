package com.aashish.Multithreading.executorframework;

import java.util.concurrent.Callable;

public class CallableTask implements Callable {

    @Override
    public Object call() throws Exception {
     Thread.sleep(10);
     return 1;
    }
}
