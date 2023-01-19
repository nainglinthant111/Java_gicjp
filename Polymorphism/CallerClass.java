package Polymorphism;

import java.util.LinkedList;

public class CallerClass{
    public static void main(String[] args) {
        GeometricShape shape1 = new Rectangle(9.0, 4.0);
        GeometricShape shape2 = new Triangle(6.0, 4.0, 5.0, 5.0);

        LinkedList shapeList = new LinkedList();
        shapeList.add(0, shape1);
        shapeList.add(1, shape2);

        for (int i = 0; i < shapeList.size(); i++)
            display((GeometricShape) shapeList.get(i));
    }
         static void display(GeometricShape shape) {
            System.out.println(shape.toString());
            System.out.println("The arc of " + shape.identity() + "is" + shape.calculateArea());
            System.out.println("The perimeter is"+ shape.calculatePerimeter());
        }

}
