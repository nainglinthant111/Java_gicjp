package control_flow;

public class GrammarSwitch {
    public static void main(String[] args) {
        char c =(char) (Math.random() * 26 + 'a');
        System.out.println("The character "+ c);
        switch (c) {
            case 'a':

            case 'e':

            case 'i':

            case 'o':

            case 'u':

                System.out.println(" It's a vowel.");
            break;


            default:
                System.out.println(" It's a consonant.");
        }
    }
}
