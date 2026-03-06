package GLAB_303_10_2;

public class Circle extends Shape {

    protected double radius;
    private final double PI = Math.PI;

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, double height){
        this.radius = radius;
        super.height = height;
    }

    public double getArea(){
        super.area = PI * Math.pow(radius,2);
        return super.area;
    }

    @Override
    public void displayshapName(){
        System.out.println("Drawing a Circle of radius " + radius);
    }

    @Override
    public String toString(){
        return "Circle[radius=" + radius + super.toString() + "]";
    }
}