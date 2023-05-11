package ExecutersPDP;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

public class ExecutersPDP {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 100; i++) {
            executorService.submit(new Threads0());
            executorService.submit(new Thread1());
            executorService.submit(new Thread2());
        }
    }
}

class Threads0 extends Thread {
    public void run() {
        System.out.println(1);
    }
}

class Thread1 extends Thread {
    public void run() {
        System.out.println(2);
    }
}

class Thread2 extends Thread {
    public void run() {
        System.out.println(3);
    }
}

