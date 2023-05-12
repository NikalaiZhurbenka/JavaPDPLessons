package volatileTest;

import java.util.concurrent.atomic.AtomicInteger;

public class volatilePDP {
    public static  int value = 0;
    public static volatile int value_volatile = 0;
    public static AtomicInteger atomic = new AtomicInteger(0);

    public void increaseValue_default() {
        value++;
    }
    public void increaseValue_atomic(){
        atomic.incrementAndGet();
    }
    public void increaseValue_volatile(){
        value_volatile++;
    }
    public int getValue(){
        return value;
    }
    public int getValue_volatile(){
        return value_volatile;
    }

    public static void main(String[] args) throws InterruptedException {
        volatilePDP test = new volatilePDP();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000000; i++) {
                test.increaseValue_default();
                System.out.println("Counter value1_default: " + test.getValue());
                test.increaseValue_atomic();
                System.out.println("Counter value1_atomic: " + atomic.get());
                test.increaseValue_volatile();
                System.out.println("Counter value1_atomic: " + test.getValue_volatile());
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int n = 0; n < 1000000; n++) {
                test.increaseValue_default();
                System.out.println("Counter value2_default: " + test.getValue());
                test.increaseValue_atomic();
                System.out.println("Counter value2_atomic: " + atomic.get());
                test.increaseValue_volatile();
                System.out.println("Counter value2_atomic: " + test.getValue_volatile());
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(test.getValue()+"check default");
        System.out.println(test.getValue_volatile()+"check volatile");
        System.out.println(atomic.get()+"check atomic");
    }
}
