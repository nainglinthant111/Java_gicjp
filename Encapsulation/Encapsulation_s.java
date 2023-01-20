package Encapsulation;

public class Encapsulation_s {
    public static void main(String[] args) {
        int number = 1;
        Stack s=new Stack();

        while (s.push(number)){
            System.out.println("Number push is " + number);
            number++;

        }
        System.out.println();
        boolean thereAreItems =true;

        while (thereAreItems){
            number = s.pop();
            if (number!=-1)
                System.out.println("Number pop is " +number);
            else
                thereAreItems =false;
        }
    }
}
