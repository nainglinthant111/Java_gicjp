package control_flow;

public class GrammarDo {
        public static void main (String[] args) {
            if (args.length > 0) {
                int x = Integer.parseInt(args[0]);
                int i = 0;
                do {
                    System.out.println(i);
                    i++;
                } while (i<=x);
            } else {
                System.out.println("You must specify a number in the command line.");
            }
        }
}
