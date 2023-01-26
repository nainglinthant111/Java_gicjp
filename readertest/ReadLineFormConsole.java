package readertest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLineFormConsole {
    public static void main(String[] args) {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Please enter the input 1 : ");
            String phrase1= br.readLine();
            System.out.println("Please enter the input 2 :");
            String phrase2=br2.readLine();
            System.out.println("Your Input 1 = "+phrase1);
            System.out.println("Your Input 2 = "+phrase2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
