package part5.Initialization.Exercises.Ex3_DefaultConstructor;

// Создайте класс с конструктором по умолчанию (без параметров), который выводит
// на экран сообщение. Создайте объект этого класса


public class Ex3 {
    static class SomeStr {
        public SomeStr() {
            System.out.println("Hello!");
        }
    }

    public static void main(String[] args) {
        SomeStr str = new SomeStr();
    }
}