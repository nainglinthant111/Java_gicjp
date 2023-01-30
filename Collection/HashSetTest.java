package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<String>();
        set.add("Red");
        set.add("Blue");
        set.add("Green");
        set.add(null);
        set.add("Pink");
        set.add("Orange");
        set.add("Red");


        Iterator<String> itr= set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
