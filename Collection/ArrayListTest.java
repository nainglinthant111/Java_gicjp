package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();     //create arraylist

        list.add("Red");                                    //add object in arraylist
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");

        //traversing list through iterator

        Iterator<String > itr=list.iterator();


        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
