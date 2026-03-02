package GLAB_303_3_1;

public class ConcatDemo {
    public static void main(String[] args) {

        String str1 = "Learn ";
        String str2 = "Java";

        System.out.println(str1.concat(str2));
        System.out.println(str2.concat(str1));

        String s3 = "hello";
        String s4 = "Learners";
        String s5 = s3 + s4;

        String message = "Welcome " + "to " + "Java";
        String s = "Chapter" + 2;
        String s1 = "Supplement" + 'B';

        System.out.println(s5);
        System.out.println(message);
        System.out.println(s);
        System.out.println(s1);
    }
}
