package Collection;

import java.util.Vector;

public class victorTest {
    public static void main(String[] args) {
        Vector v1=new Vector<>();

        v1.add(1);
        v1.add(2);
        v1.add("geeks");
        v1.add("forGeeks");
        v1.add(3);

        System.out.println("vector v1 is : " + v1);

        Vector<Integer> v2= new Vector<Integer>();
        v2.add(5);
        v2.add(9);
        v2.add(8);
        v2.add(7);
        v2.add(3);

        System.out.println("Vector v2 is : " + v2);

    }
}
