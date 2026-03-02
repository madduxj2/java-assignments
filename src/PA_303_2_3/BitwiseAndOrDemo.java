package PA_303_2_3;

public class BitwiseAndOrDemo {

    public static void main(String[] args) {
        int x = 7;   // bin: 00111
        int y = 17;  // bin: 10001

        // Prediction for AND:
        // 00111
        // 10001
        // -----
        // 00001  => 1
        int zAnd = x & y;

        System.out.println("x = " + x + " (bin: " + Integer.toBinaryString(x) + ")");
        System.out.println("y = " + y + " (bin: " + Integer.toBinaryString(y) + ")");
        System.out.println("x & y = " + zAnd + " (bin: " + Integer.toBinaryString(zAnd) + ")");
        System.out.println("-----");

        // Prediction for OR:
        // 00111
        // 10001
        // -----
        // 10111 => 23
        int zOr = x | y;

        System.out.println("x | y = " + zOr + " (bin: " + Integer.toBinaryString(zOr) + ")");
    }
}