package Date;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date date1 = new Date();
        long now =date1.getTime();
        System.out.println(now);

        Date date2 =new Date(now +5000);
        System.out.println("Date 1 : "+date1);
        System.out.println("Date 2 : "+date2);

        System.out.println("d1 is after d2 ? : "+ date1.after(date2));
        System.out.println("d1 is before d2 ?  : "+ date1.before(date2));
        System.out.println("d1 is same as d2 ? : "+date1.equals(date2));
        System.out.println("d1 is after d2 ? :"+ date1.compareTo(date2));
        System.out.println("d2 is after d1 ? : "+ date2.compareTo(date1));
    }
}
