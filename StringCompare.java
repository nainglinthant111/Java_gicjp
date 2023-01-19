package StringComparisonTest;

public class StringCompare {
    public static void main(String[] args) {
        String s1 = "Program";
        String s2 = "Program";
        String s3 = new String("Program");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
    }
}
