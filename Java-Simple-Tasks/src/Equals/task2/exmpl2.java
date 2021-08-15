package Equals.task2;

public class exmpl2 {
    public static void main(String[] args) {
        String s1 = "JavaRush";
        String s2 = new String("JavaRush");
        String s3 = new String("JavaRush");

        System.out.println(s1 == s2);
        System.out.println(s1 == s2.intern());
        System.out.println(s3 == s2.intern());
    }
}