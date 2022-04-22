package p5_InitializationAndCleanup.Exercises.Ex4_OverConstructors;

// Создайте класс с конструктором по умолчанию (без параметров), который выводит
// на экран сообщение. Добавьте перегруженный конструктор, принимающий в качестве
// параметра строку (String) и расечатывающийее вместе с сообщением.


public class Ex4 {
    static class SomeStr {
        SomeStr() {
            System.out.println("Hello!");
        }

        SomeStr(String str) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        new SomeStr();
        new SomeStr("World!");
    }
}