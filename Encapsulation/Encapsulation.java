package Encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
        int number =1;
        Quee q=new Quee();

        while (q.push(number)){
            System.out.println("Number push is " + number);
            number++;

        }
        System.out.println();
        boolean thereAreItems =true;

        while (thereAreItems){
            number = q.pop();
            if (number!=-1)
                System.out.println("Number pop is " +number);
            else
                thereAreItems =false;
        }
    }
}
