package Game;

import java.util.Random;
import java.util.Scanner;

public class MiniGame {
    public static void main(String[] args) {

        Random randomValue = new Random();
        int random = randomValue.nextInt(99);


        int i;
        int inputValue = 0;

       for ( i=1; i <= 5; i++){
           System.out.print("Enter a number 1 to 99 : ");

           Scanner inputData = new Scanner(System.in);
           inputValue = inputData.nextInt();

         if(random > inputValue){

                System.out.println("You need increase your number! remaining " + (5-i) +" times");


         }else if(random < inputValue){
                System.out.println("You need decrease your number! remaining " + (5-i) +" times");

         }else if(random == inputValue){
                System.out.println();
                System.out.println("Good Game");
                System.out.println("Input number is : " + inputValue);
                System.out.println("Random number is " +random);
                break;
         }


        }

        if(random != inputValue){
            System.out.println();
            System.out.println("Game Over!");
            System.out.println("The answer is : "+random);
        }

    }
}
