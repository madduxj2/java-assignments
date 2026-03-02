package PA_303_2_3;

public class LeftShiftDemo {

    public static void main(String[] args) {
        runLeftShift(2);
        runLeftShift(9);
        runLeftShift(17);
        runLeftShift(88);
    }

    private static void runLeftShift(int start) {
        int x = start;

        System.out.println("START x = " + x + " (bin: " + Integer.toBinaryString(x) + ")");

        // Prediction: left shifting by 1 multiplies by 2.
        // predicted decimal = start * 2
        // predicted binary  = startBinary + "0"
        x = x << 1;

        System.out.println("AFTER x<<1 = " + x + " (bin: " + Integer.toBinaryString(x) + ")");
        System.out.println("-----");
    }
}