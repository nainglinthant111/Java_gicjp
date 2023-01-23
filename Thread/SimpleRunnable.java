package Thread;

public class SimpleRunnable implements Runnable{
String nameThread;
public  SimpleRunnable(String str){
    nameThread=str;
}
    @Override
    public void run() {
    for (int i=0; i<10; i++)
        System.out.println("This is the Thread : " + i);

    }
}
