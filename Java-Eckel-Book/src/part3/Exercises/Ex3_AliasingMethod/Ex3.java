package part3.Exercises.Ex3_AliasingMethod;

class Letter{
    char c;
}

public class Ex3 {
    static void f(Letter y) {
        y.c = 'z';
    }
    public static void main(String[] args) {
        Letter x1 = new Letter();
        Letter x2 = new Letter();
        Letter x3 = new Letter();
        Letter x4 = new Letter();

        x1.c = 'a';
        x2.c = 'b';
        x3.c = 'z';
        x4.c = 'd';

        System.out.println("1: x1.c = " + x1.c + ", x2.c = " + x2.c);
        System.out.println();

        x1 = x2;
        System.out.println("x1 = x2");
        System.out.println("2: x1.c = " + x1.c + ", x2.c = " + x2.c);
        System.out.println("Ссылки на один объект x1 и x2: " + x1.equals(x2));
        System.out.println();

        f(x1);
        System.out.println("f(x1)");
        System.out.println("3: x1.c = " + x1.c + ", x2.c = " + x2.c);
        System.out.println("Ссылки на один объект x1 и x2: " + x1.equals(x2));
        System.out.println();

        System.out.println("4: x3.c = " + x3.c + ", x4.c = " + x4.c);
        System.out.println();

        x3.c = x4.c;
        System.out.println("x3.c = x4.c");
        System.out.println("5: x3.c = " + x3.c + ", x4.c = " + x4.c);
        System.out.println("Ссылки на один объект x3 и x4: " + x3.equals(x4));
        System.out.println();

        f(x3);f(x4);
        System.out.println("f(x3),f(x4)");
        System.out.println("6: x3.c = " + x3.c + ", x4.c = " + x4.c);
        System.out.println("Ссылки на один объект x3 и x4: " + x3.equals(x4));
        System.out.println();
    }
}
