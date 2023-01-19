package control_flow;

public class GrammarWhile {
    public static void main(String[] args) {
        if (args.length > 0){
            int x = 0;
            try {
                x = Integer.parseInt(args[0]);

            }catch ( Exception e){
                System.out.println("This is the catch case");


            }
            int i = 0;
            while ( i <= x ) {
                System.out.println(i);
                i++;
            }
        }else {
            System.out.println("You must specify a number\n" + "in the command line.");
        }
    }
}
