package Polymorphism;
public abstract class GeometricShape {
    private String color = "red";
    GeometricShape(){}  //constructor without parameter
    protected GeometricShape(String c){
        this.color = c;

    }

    public String getColor(){
        return color;
    }
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    public abstract String identity();
}
