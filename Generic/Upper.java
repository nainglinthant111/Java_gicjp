package Generic;

import java.util.ArrayList;

public class Upper {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        l1.add(10);
        l1.add(20);
        System.out.println("Displaying the sm = "+ addition(l1));

        ArrayList<Double> l2 = new ArrayList<Double>();
        l2.add(30.0);
        l2.add(40.0);
        System.out.println("Displaying THE SUM = "+ addition(l2));

    }
    private static Double addition(ArrayList<? extends Number>num){
        double sum=0.0;
        for (Number n:num){
            sum = sum +n.doubleValue();
        }
        return sum;

    }
}
