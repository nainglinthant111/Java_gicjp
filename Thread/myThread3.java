package Thread;

public class myThread3 {
    public static void main(String[] args) {

        System.out.println("MyThreadClass starts ");
        Runnable rn = new WaitTest();
        Thread th = new Thread(rn);
        System.out.println("To call run() from waitTest : Strat Stage");
        th.start();
        try {
            Thread.sleep(10000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (rn) {
            rn.notify();
        }
        System.out.println("My ThreadClass end");
    }
}
