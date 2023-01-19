package control_flow;

public class ContinueDemo {
    public static void main(String[] args) {
        int i = 0;
        while ( i <= 8){
            if (i == 0){
                i++;
                continue;
            }
            System.out.println(10 / i);
            i++;
        }
    }
}
