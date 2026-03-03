package GLAB_303_9_1;

public class EncapsulationExample {

    public static void main(String[] args) {

        HumanBeing h1 = new HumanBeing();

        // Using setters
        h1.setHeight(1.65f);
        h1.setWeight(68f);
        h1.setBmi(calculateBmi(h1));

        // Using getters
        System.out.println("Person has " + h1.getWeight() +
                " kgs and is " + h1.getHeight() +
                " meters in height, which results in BMI of " + h1.getBmi());
    }

    public static float calculateBmi(HumanBeing h1) {
        return h1.getWeight() / (h1.getHeight() * h1.getHeight());
    }
}