package Exercise_2;

import java.util.Scanner;

public class ColorTest {
    public static void main(String[] args) {


        Scanner myInput = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a color code :  ");

        String color = myInput.nextLine();  // Read user input

        //Color Test Condition
        switch (color){
            case "b":
                System.out.println("The color is : Blue color");
                break;
            case "r":
                System.out.println("The color is : Red color");
                break;
            case "g":
                System.out.println("The color is : Green color");
                break;
            default:
                System.out.println("The color is : Another color");
        }

    }
}
