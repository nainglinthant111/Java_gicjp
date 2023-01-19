package Polymorphism;

public class Rectangle extends GeometricShape{

    private double width;
    private double length;

    public Rectangle(){
        this (1.0, 1.0);
    }

    public Rectangle(double b, double len) {
        this(b,len,"white");

    }
    public Rectangle(double wid,double len,String color){
        super(color);
        this.width=wid;
        this.length=len;
    }

    @Override
    public double calculateArea() {
        return width * length;
    }

    @Override
    public double calculatePerimeter() {
        return 2 *(length + width);
    }

    @Override
    public String identity() {
        return super.getColor() + "Rectangle";

    }

    public String toString(){
        return "Rectangle -> width = " +width + "length = " + length;
    }
}
