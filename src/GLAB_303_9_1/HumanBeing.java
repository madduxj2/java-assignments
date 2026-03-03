package GLAB_303_9_1;

public class HumanBeing {

    private float weight;
    private float height;
    private float bmi;

    // Constructor with parameters
    public HumanBeing(float weight, float height, float bmi) {
        this.weight = weight;
        this.height = height;
        this.bmi = bmi;
    }

    // Default constructor
    public HumanBeing() {
    }

    // Getter and Setter for weight
    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    // Getter and Setter for height
    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    // Getter and Setter for bmi
    public float getBmi() {
        return bmi;
    }

    public void setBmi(float bmi) {
        this.bmi = bmi;
    }
}