package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> a1=new LinkedList<String>();
        a1.add("Red");
        a1.add("Green");
        a1.add("Blue");
        a1.add("Yellow");
        Iterator<String> itr=a1.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}
