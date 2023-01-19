package control_flow;

public class BreakDemo {
    public static void main(String[] args) {
        int i = 0;
        boolean b1=true;
        while ( b1 ){
            if( i == 10 ){
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("This is the outside of the while");
    }
}
