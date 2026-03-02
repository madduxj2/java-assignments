package PA_303_2_3;

public class IncrementWaysDemo {

    public static void main(String[] args) {
        int x = 0;
        System.out.println("Start x = " + x);

        // Way 1: x++
        x++;
        System.out.println("After x++  x = " + x);
        x++;
        System.out.println("After x++  x = " + x);

        // Way 2: ++x
        ++x;
        System.out.println("After ++x  x = " + x);
        ++x;
        System.out.println("After ++x  x = " + x);

        // Way 3: x += 1
        x += 1;
        System.out.println("After x+=1 x = " + x);
        x += 1;
        System.out.println("After x+=1 x = " + x);
    }
}