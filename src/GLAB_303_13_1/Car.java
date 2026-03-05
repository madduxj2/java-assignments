package GLAB_303_13_1;

public class Car {
    private String name;
    private double mpg;
    private int cylinders;
    private double displacement;
    private double horsepower;
    private double weight;
    private double acceleration;
    private int model;
    private String origin;

    public Car() {}

    public Car(String name, double mpg, int cylinders, double displacement, double horsepower,
               double weight, double acceleration, int model, String origin) {
        this.name = name;
        this.mpg = mpg;
        this.cylinders = cylinders;
        this.displacement = displacement;
        this.horsepower = horsepower;
        this.weight = weight;
        this.acceleration = acceleration;
        this.model = model;
        this.origin = origin;
    }

    public String getName() { return name; }
    public double getMpg() { return mpg; }
    public int getCylinders() { return cylinders; }
    public double getDisplacement() { return displacement; }
    public double getHorsepower() { return horsepower; }
    public double getWeight() { return weight; }
    public double getAcceleration() { return acceleration; }
    public int getModel() { return model; }
    public String getOrigin() { return origin; }

    @Override
    public String toString() {
        return "GLAB_303_13_1.Car{" +
                "name='" + name + '\'' +
                ", mpg=" + mpg +
                ", cylinders=" + cylinders +
                ", displacement=" + displacement +
                ", horsepower=" + horsepower +
                ", weight=" + weight +
                ", acceleration=" + acceleration +
                ", model=" + model +
                ", origin='" + origin + '\'' +
                '}';
    }
}