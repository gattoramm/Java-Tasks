package part3.Exercises.Ex2_AliasingFloat;

class Aliasing {
    float num;
}

public class Ex2 {

    public static void main(String[] args) {
        Aliasing al1 = new Aliasing();
        Aliasing al2 = new Aliasing();
        Aliasing al3 = new Aliasing();
        Aliasing al4 = new Aliasing();

        al1.num = 12.6f;
        al2.num = 1.7f;

        System.out.println("1: al1.num = " + al1.num + ", al2.num = " + al2.num);
        System.out.println();

        al1 = al2;

        System.out.println("Присваиваем ссылки: al1 = al2");
        System.out.println("2: al1.num = " + al1.num + ", al2.num = " + al2.num);
        System.out.println("Ссылки на один объект: " + al1.equals(al2));
        System.out.println();

        al1.num = 8.0f;
        System.out.println("al1.num = 8.0");
        System.out.println("3: al1.num = " + al1.num + ", al2.num = " + al2.num);
        System.out.println();

        al3.num = 12.6f;
        al4.num = 1.7f;
        System.out.println("al3.num = " + al3.num + ", al4.num = " + al4.num);
        System.out.println();

        al3.num = al4.num;
        System.out.println("al3.num = al4.num");
        System.out.println("4: al3.num = " + al3.num + ", al4.num = " + al4.num);
        System.out.println("Ссылки на один объект: " + al3.equals(al4));
        System.out.println();

        al3.num = 14.0f;
        System.out.println("al3.num = 14.0");
        System.out.println("5: al3.num = " + al3.num + ", al4.num = " + al4.num);
        System.out.println("Ссылки на один объект: " + al3.equals(al4));
        System.out.println();
    }
}
