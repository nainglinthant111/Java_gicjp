package Exercises2;

public class TestIncrement {
    public static void main(String[] args) {
        int i = 100;        //Declare integer variable"i" - to assign value "100" in "i" variable
        int iLnc;           //Declare integer variable "iLc"


        //Increment after operation
        iLnc = i++;         //increase after opp..(i + 1)

        System.out.println("The value of Postfix iLnc  = "+ iLnc);
        System.out.println("The value of i = "+ i);

        //Increment before operation
        i = 100;            //Declare integer variable"i" - to assign value "100" in "i" variable
        iLnc = ++i;         //increase before opp..(i + 1)

        System.out.println("The value of Prefix iLnc  = "+ iLnc);
        System.out.println("The value of i = "+ i);
    }
}
