package Exercise4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class RandonNumber {
    public static void main(String[] args) throws IOException {
        int result;
        FileWriter wr=new FileWriter("random.txt");
        BufferedWriter b=new BufferedWriter(wr);
        Random val = new Random();

        for(int i=1; i<=10; i++){
            result= val.nextInt(100);
            System.out.println(i +". The random Number is : "+ result);
        }


    }
}
