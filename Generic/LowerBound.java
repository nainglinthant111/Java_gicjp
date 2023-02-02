package Generic;

import java.util.Arrays;
import java.util.List;

public class LowerBound {
    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(1,2,3);
        System.out.println("Display the integer values ");
        addNumbers(l1);
        List<Number> l2 = Arrays.asList(1.0,2.0,3.0);
        System.out.println("Display the Number values ");
        addNumbers(l2);


    }
    public static void addNumbers(List<? super Integer> list){
        for (Object n:list){
            System.out.println(n);
        }
    }
}
