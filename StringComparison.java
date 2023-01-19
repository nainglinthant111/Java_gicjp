package StringComparisonTest;

public class StringComparison {
    public static void main(String[] args) {
        String s1="Program";
        String s2="Program";
        String s3=new String("Program");
        String s4="Logic";
        String s5="Program";
        String s6="Pr0grAm";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s5.equals(s6));
        System.out.println(s5.equalsIgnoreCase(s6));
    }
}
