package part3.Exercises.Ex14_StringOperations;

// Напишите метод, который получает два аргумента String, выполняет с ними
// все операции логических сравнений и выводит результаты. Для операций ==
// и != также выполните проверку equals(). Вызовите свой метод из main()
// для нескольких разных объектов String.

public class Ex14 {
    static void f(boolean b) {
        System.out.println(b);
    }

    static void stringTest(String str1, String str2) {
        //Арифметические операции
        System.out.println("str1 = " + str1 + ", str2 = " + str2);
        System.out.println("str1+str2 = " + str1+str2);
        // Операции сравнения и логические операции
        System.out.println("str1!=str2");
        f(str1!=str2);
        System.out.println("str1==str2");
        f(str1==str2);
        System.out.println("str1.equals(str2)");
        f(str1.equals(str2));

    }

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = new String("Hello");

        stringTest(str1, str2);
        System.out.println("------------");
        stringTest(str1, str3);
    }
}
