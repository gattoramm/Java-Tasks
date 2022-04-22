package p5_InitializationAndCleanup.Exercises.Ex2_TwoObjConstrAndInit;

/**
 * Создайте класс с полем String, инизиализируемым в точке определения,
 * и другим полем, инизиализируемым конструктором. Чем отличаются эти
 * два подхода?
 */

public class Ex2 {
    static class SomeString {
        String someStr;
        SomeString() {
            someStr = "SomeStr";
        }

        SomeString(String str) {
            someStr = str;
        }
    }

    public static void main(String[] args) {
        SomeString str1 = new SomeString();
        SomeString str2 = new SomeString("asd");

        System.out.println(str1.someStr);
        System.out.println(str2.someStr);
    }
}