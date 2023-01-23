package Thread;
public class SimpleThrad extends Thread {
        public  SimpleThrad(String str){
            super(str);
        }
        public void run(){
            for(int i = 0; i < 10; i++){
                System.out.println("This is the thread : " + getName() + i);
            }
        }
}

