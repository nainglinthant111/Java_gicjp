package Generic;

import java.util.ArrayList;
import java.util.List;

public class WildCardTest {
    public static void main(String[] args) {
        List<Rectangle> list1=new ArrayList<Rectangle>();
        list1.add(new Rectangle());

        List<Circle> list2 = new ArrayList<Circle>();
        list2.add(new Circle());
        list2.add(new Circle());
        list2.add(new Circle());

        drawShapes(list1);
        drawShapes(list2);

    }
    public static void drawShapes(List<? extends Shape> lists){
        for(Shape s: lists){
            s.draw();
        }
    }
}
