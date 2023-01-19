package ArrayTest;
public class ArrayTest {
    public static void main(String[] args) {
        String[] strMenus ={"coffee","Tea","Juic","Ice Cream"};
        int[] iPrice = {180,160,200,220};
        System.out.println("Menu  "+ "      Price");
        for (int i=0; i<strMenus.length; i++){
            System.out.println(strMenus[i]+"     "+iPrice[i]);
        }
    }
}
