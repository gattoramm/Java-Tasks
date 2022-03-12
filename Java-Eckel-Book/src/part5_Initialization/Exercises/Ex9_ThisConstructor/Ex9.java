package part5_Initialization.Exercises.Ex9_ThisConstructor;

// Подготовьте класс с двумя (перегруженными) конструкторами. Используя
// ключевое слово this, вызовите второй конструктор из первого.

public class Ex9 {
    static class ThisConstructor {
        public ThisConstructor() {
            this("12",12);
            System.out.println("Внутри конструктора без параметров");
        }

        public ThisConstructor(int someNum) {
            this();
            System.out.println("Внутри конструктора с параметром int, s = " + someNum);
        }

        public ThisConstructor(String someStr) {
            this(12);
            System.out.println("Внутри конструктора с параметром String, s = " + someStr);
        }

        ThisConstructor(String someStr, int someNum) {
            System.out.print("Внутри конструктора с параметром String, s = " + someStr);
            System.out.println(" и int = " + someNum);
        }
    }

    public static void main(String[] args) {
        System.out.println("        Вызываем конструктор без параметров");
        new ThisConstructor();
        System.out.println();

        System.out.println("        Вызываем конструктор с int");
        new ThisConstructor(5);
        System.out.println();

        System.out.println("        Вызываем конструктор с String");
        new ThisConstructor("World");
        System.out.println();

        System.out.println("        Вызываем конструктор с int и String");
        new ThisConstructor("WWW",3);
    }
}