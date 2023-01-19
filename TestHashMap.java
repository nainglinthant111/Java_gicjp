package Exercise_2;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
    public static void main(String[] args) {

        //Create HashMap obj
        HashMap MenuTable =new HashMap();

        // Add mappings into the table
        MenuTable.put("Coffee", "180");
        MenuTable.put("Tea","160");
        MenuTable.put("Juice","200");
        MenuTable.put("Ice Cream","220");

        System.out.println("Menu       " + "Price");

        // Iterating through the Set of keys
        Iterator iMenu = MenuTable.keySet().iterator();
        while (iMenu.hasNext()){
            String strKey=(String) iMenu.next();
            String strValue = (String) MenuTable.get(strKey);
            System.out.println(strKey + "   :   " + strValue);
        }

    }
}
