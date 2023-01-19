package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateTest {
    public static void main(String[] args) {
        Date date1=new Date();
        System.out.println(date1);

        SimpleDateFormat d1=new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(d1.format(date1));

        d1.applyPattern("dd/MM/yyyy");
        System.out.println(d1.format(date1));
    }
}
