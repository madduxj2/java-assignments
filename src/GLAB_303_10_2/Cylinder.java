package GLAB_303_10_2;

public class Cylinder extends Circle {

    private final double PI = Math.PI;

    public Cylinder(double radius,double height){
        super(radius,height);
    }

    public Cylinder(double radius){
        super(radius);
    }

    public double getVolumne(){
        return (PI * Math.pow(radius,2)) * height;
    }

    public double getSurfaceArea(){
        return 2.0 * Math.PI * radius * height;
    }

    @Override
    public void displayshapName(){
        System.out.println("Drawing a Cylinder for radius " + radius);
    }

    public String toString(){
        return "radius is: " + radius + " height is : " + height;
    }
}