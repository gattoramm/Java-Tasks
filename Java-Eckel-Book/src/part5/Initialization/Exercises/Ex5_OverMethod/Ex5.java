package part5.Initialization.Exercises.Ex5_OverMethod;

// Создайте класс Dog с перегруженным методом bark(). Метод должен быть
// перегружен для разных примитивных типовданных с целью вывода сообщений
// о лае, завывании, поскуливании и т.п. в зависимости от версии
// перегруженного метода. Напишите метод main(), вызывающий все версиии.

public class Ex5 {
    static class Dog {
        void bark() {
            System.out.println("Лай");
        }

        void bark(String str) {
            System.out.println("Вой");
        }

        void bark(int num) {
            System.out.println("Поскуливание");
        }
    }

    public static void main(String[] args) {
        new Dog().bark();
        new Dog().bark(1);
        new Dog().bark("q");
    }
}
