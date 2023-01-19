package Polymorphism;

public class Triangle extends  GeometricShape{

    private double base;
    private double height;
    private double side1;
    private double side2;
    public Triangle(){
        this(2.0,2.0,3.0,5.0);
    }
    public Triangle(double b ,double h,double s1,double s2){
        this.base=b;
        this.height=h;
        this.side1=s1;
        this.side2=s2;
    }
    public String toString(){
        return "Trigle -> base = " + base + "height = " + height + "Side1 =" + side1 + "side2 =" + side2;
    }
    @Override
    public double calculateArea() {
        return (0.5 * base *height);
    }

    @Override
    public double calculatePerimeter() {
        return base + side1 + side2;
    }

    @Override
    public String identity() {
        return super.getColor() + "Triangle";
    }
}
