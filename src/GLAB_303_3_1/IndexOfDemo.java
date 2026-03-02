package GLAB_303_3_1;

public class IndexOfDemo {
    public static void main(String[] args) {

        String str1 = "Java is fun";

        System.out.println(str1.indexOf('s'));
        System.out.println(str1.lastIndexOf('J'));
        System.out.println(str1.lastIndexOf('a'));
        System.out.println(str1.lastIndexOf('j'));
        System.out.println(str1.lastIndexOf("ava"));
        System.out.println(str1.lastIndexOf("java"));
    }
}