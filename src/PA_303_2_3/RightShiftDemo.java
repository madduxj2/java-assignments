package PA_303_2_3;

public class RightShiftDemo {

    public static void main(String[] args) {
        runRightShift(150);
        runRightShift(225);
        runRightShift(1555);
        runRightShift(32456);
    }

    private static void runRightShift(int start) {
        int x = start;

        System.out.println("START x = " + x + " (bin: " + Integer.toBinaryString(x) + ")");

        // Prediction: right shifting by 2 divides by 4 (integer division, truncates).
        // predicted decimal = start / 4
        // predicted binary  = startBinary without last 2 bits
        x = x >> 2;

        System.out.println("AFTER x>>2 = " + x + " (bin: " + Integer.toBinaryString(x) + ")");
        System.out.println("-----");
    }
}
