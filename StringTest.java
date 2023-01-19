package ArrayTest;

public class StringTest {
    public static void main(String[] args) {
        String a1,a2,a3,a4;
        boolean b1;
        a1 = new String("Hello");
        a2 = new String("Hello");
        a3 = "Good Morning";
        a4 = "Good Morning";
        if (a3 == a4 ){
            //if (a1.equals(a2)){
            //if (a1 ==a2){
            b1 =true;
        }else {
            b1 =false;
        }
        System.out.println("I am b1 = "+b1);
    }
}
