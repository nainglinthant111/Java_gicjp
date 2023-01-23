package Thread;

public class myRunnable {
    public static void main(String[] args) {
            SimpleRunnable r=new SimpleRunnable("Thread Name : ");
            Thread myThread=new Thread(r);
            myThread.start();
    }
}
