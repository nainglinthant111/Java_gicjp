package ArrayTest;

import java.util.HashMap;
import java.util.Iterator;

public class TestHashMap {
    public static void main(String[] args) {
        HashMap hashMap =new HashMap();
        hashMap.put("Karaoke", "Instring");
        hashMap.put("Study","Boring");
        hashMap.put("Lunch","Delicious");
        System.out.println("Display hashMap : " + hashMap);
        String  str=(String) hashMap.get("Karaoke");
        System.out.println("Get Value : "+ str);
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()){
            String strKey=(String) it.next();
            String strValue = (String) hashMap.get(strKey);
            System.out.println(strKey + " : " + strValue);
        }

    }
}
