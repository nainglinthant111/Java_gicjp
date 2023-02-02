package Generic;

public class GenericTest {

    public static void main(String[] args) {
        Integer[] intArray ={10,20,30,40,50};
        Character[] charArray= {'G','E','N','E','R','I','C','T','E','S','T'};

        System.out.println("Printing Integer Array");
        printArray(intArray);

        System.out.println("Printing Character Array");
        printArray(charArray);
    }
    public static  <E> void printArray(E[] elements){
        for(E a : elements){
            System.out.println(a);
        }
        System.out.println();
    }
}

