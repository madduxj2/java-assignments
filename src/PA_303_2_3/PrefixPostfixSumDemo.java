package PA_303_2_3;

public class PrefixPostfixSumDemo {

    public static void main(String[] args) {

        // Prefix version
        int x1 = 5;
        int y = 8;
        int sum1 = ++x1 + y; // x1 becomes 6 first, then sum = 6 + 8 = 14
        System.out.println("PREFIX: x=5, y=8, sum=++x+y => sum = " + sum1 + ", x after = " + x1);

        // Postfix version
        int x2 = 5;
        int sum2 = x2++ + y; // sum = 5 + 8 = 13, then x2 becomes 6
        System.out.println("POSTFIX: x=5, y=8, sum=x++ + y => sum = " + sum2 + ", x after = " + x2);
    }
}