package part2.Exercises.Ex7_8_IncrementableStatic;

public class Ex7_8 {
    static class StaticTest {
        static int i = 47;
    }

    static class Incrementable {
        static void increment() {
            StaticTest.i++;
        }
    }

    public static void main(String[] args) {
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();

        System.out.println("Before increment");
        System.out.println("st1 = " + st1.i);
        System.out.println("st2 = " + st1.i);

        Incrementable sf = new Incrementable();
        sf.increment();

        System.out.println("After increment");
        System.out.println("st1 = " + st1.i);
        System.out.println("st2 = " + st2.i);

        Incrementable.increment();
        System.out.println("new objects StaticTest with Incrementable.increment()");
        StaticTest st3 = new StaticTest();
        StaticTest st4 = new StaticTest();

        System.out.println("st3 = " + st3.i);
        System.out.println("st4 = " + st4.i);

    }
}
