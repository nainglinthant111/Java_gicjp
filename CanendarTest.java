package Date;

import java.util.*;


public class CanendarTest {
    public static void main(String[] args) {
        Calendar c1=Calendar.getInstance();
        Object obj =Calendar.getInstance();

        System.out.println("Calendar Instance : "+c1);
        System.out.println("Calendar Get Obj : "+obj);
        System.out.println("Show date : "+ c1.get(Calendar.YEAR) +" - "+ (c1.get(Calendar.MONTH)+1) + " - "+c1.get(Calendar.DATE));
    }
}
