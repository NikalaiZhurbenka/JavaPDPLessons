package volatileTest;

public class volatilePDP {
    public volatile int value = 0;

    public void increaseValue() {
        value++;
    }
    public int getValue(){
        return value;
    }

    public static void main(String[] args) throws InterruptedException {
        volatilePDP test = new volatilePDP();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                test.increaseValue();
                System.out.println("Counter value1: " + test.getValue());
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                test.increaseValue();
                System.out.println("Counter value2: " + test.getValue());
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

    }
}
