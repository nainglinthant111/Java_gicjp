package Exercise_2;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {

        Scanner myInput = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a value :  ");

        String iValue = myInput.nextLine();         // Read user input
        int mValue=Integer.parseInt(iValue);        //String to Integer
        int result;                                 //Declare for result


            //for multiplication result
            for(int i=1; i<=12; i++){
                result = mValue * i;
                System.out.println(mValue + "*" + i +" = "+ result);
            }

    }
}
