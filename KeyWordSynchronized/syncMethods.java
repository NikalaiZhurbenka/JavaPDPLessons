package KeyWordSynchronized;

public class syncMethods implements Runnable {
    public int value=0;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new syncMethods(), "Thread1");
        thread.start();
        try{
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        syncMethods test = new syncMethods();
        test.firstThread();

    }
  synchronized  public void firstThread() {
        for (int i = 0; i < 15; i++) {
            value++;
            System.out.println("i Value:" + value);
        }

    }
    public void run() {
        for (int j = 0; j < 15; j++) {
            value++;
            System.out.println("j Value:" + value);
        }
    }
}
