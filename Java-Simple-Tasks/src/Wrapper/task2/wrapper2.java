package Wrapper.task2;

public class wrapper2 {
    public static void main(String[] args) {
        Integer a = new Integer(0);
        Integer b = new Integer(0);

        int aa = 0;
        int bb = 0;

        System.out.println("Класс-обертка");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        b = a;
        a = 1;
        System.out.println("b = a, a = 1");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        System.out.println("------------------------------");

        System.out.println("Примитив");
        System.out.println("aa: " + aa);
        System.out.println("bb: " + bb);
        bb = aa;
        aa = 1;
        System.out.println("bb = aa, aa = 1");
        System.out.println("aa: " + aa);
        System.out.println("bb: " + bb);

    }
}
