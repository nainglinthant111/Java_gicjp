package Collection;

import javax.swing.event.TreeSelectionEvent;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeTest {
    public static void main(String[] args) {

        //Creating and adding elements
        TreeSet<String> set=new TreeSet<String>();
        set.add("Black");
        set.add("Pink");
        set.add("White");
        set.add("Red");
        set.add("Apple");
        set.add("1");
        set.add("Four");
        set.add("Father");
        set.add("Food");
        set.add("food");
        set.add("9");

        //traversing elements
        Iterator<String> irt= set.iterator();
        while (irt.hasNext()){
            System.out.println(irt.next());
        }


    }
}
