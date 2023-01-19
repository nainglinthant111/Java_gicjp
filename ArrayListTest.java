package ArrayTest;

import java.lang.reflect.Array;
import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();

        arrayList.add("Star cola");
        arrayList.add("Pocari Sweat");
        arrayList.add("Alpin");

        System.out.println("ArrayList contents : " + arrayList);
        String str = "Fantasy";
        arrayList.add(1, str);
        System.out.println("ArrayLis content after condition : "+arrayList);
        arrayList.remove(3);
        System.out.println("ArrayList content after delete : " + arrayList);

        System.out.println("Get element : " + arrayList.get(2));

        System.out.println("data size : " + arrayList.size());

        arrayList.clear();
        System.out.println("Delete all : " + arrayList);

        if (arrayList.isEmpty()){
            System.out.println("Is enpty : " + arrayList);
        }else {
            System.out.println("Is not enpty : "+arrayList.get(0));
        }

        String str1 = "wine";
        arrayList.add(str);
        System.out.println(arrayList);
        if (arrayList.isEmpty()){
            System.out.println("Is enpty : " + str1);
        }else {
            System.out.println("Is not enpty : "+str1);
        }

    }
}
