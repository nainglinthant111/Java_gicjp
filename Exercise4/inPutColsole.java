package Exercise4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inPutColsole {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Your Name : ");
        String name=br.readLine();
        System.out.println("Enter Your Address : ");
        String add=br.readLine();
        System.out.println("Enter Your Age : ");
        String age=br.readLine();
        System.out.println("Name : "+ name);
        System.out.println("Address : "+ add);
        System.out.println("Age : "+ age);




    }

}
