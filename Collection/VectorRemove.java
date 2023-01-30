package Collection;

import java.util.Vector;

public class VectorRemove {
    public static void main(String[] args) {
        Vector v=new Vector();

        v.add(1);
        v.add(2);
        v.add("person");
        v.add("forPeople");
        v.add(4);
        System.out.println("Before Remove : " + v );

        v.remove(1);

        System.out.println("After Removal : " + v );
    }
}
