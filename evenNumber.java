package Exercise_2;

public class evenNumber {
    public static void main(String[] args) {


        int addEven=0;                                  //Declare for add Even result
        System.out.println("The evenNumber is ");


        for ( int i=1; i<=100; i++){                    //"for loop" for condition

            if (i % 2 == 0) {                             //if loop for even test

                System.out.println("{"+ i + "} ");
                addEven += i;
            }
        }

        System.out.println("The sun of Even number "+ addEven);
    }
}
