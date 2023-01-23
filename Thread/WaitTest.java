package Thread;

public class WaitTest implements Runnable {
    @Override
    public synchronized void run() {
        try{
            System.out.println("I am form wait Test .....");
            wait();
            System.out.println("WaitTest has awaked");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
