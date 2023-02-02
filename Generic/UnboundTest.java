package Generic;

import java.util.Arrays;
import java.util.List;

public class UnboundTest {
    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(1,2,3);
        System.out.println("Display the integer values ");
        display(l1);
        List<String> l2 = Arrays.asList("One","Two","Three");
        System.out.println("Display the String values ");
        display(l2);
        List<Double> l3=Arrays.asList(4.5,6.7,222.333,888.777);
        System.out.println("Displaying the Double ");
        display(l3);

    }
    public static void display(List<?> list){
        for (Object o:list){
            System.out.println(o);
        }
    }
}
