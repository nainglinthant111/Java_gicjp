package gicjp;

public class Logical {
    public static void main(String[] args) {
        int x =100;
        int y=21;
        boolean b= x == 100 | y > 1000;
        boolean d= x == 55 ^ y < 33;
        System.out.println(b);
        System.out.println(d);
    }
}
