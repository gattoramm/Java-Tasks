package Adapter.task2;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class systemOut {
    public static void main(String[] args) {
        // запоминаем PrintStream в переменную
        PrintStream consoleStream = System.out;

        // создаем динамический массив
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        // создаем адаптер к классу PrintStream
        PrintStream stream = new PrintStream(outputStream);
        // устанавливаем его как текущий System.out
        System.setOut(stream);

        printSomething();

        // преобразуем записанные в ByteArrayOutputStream данные в строку
        String result = outputStream.toString();

        // возвращаем как было
        System.setOut(consoleStream);

        StringBuilder stringBuilder = new StringBuilder(result);
        stringBuilder.reverse();
        String reverseString = stringBuilder.toString();

        System.out.println(reverseString);

    }
    public static void printSomething() {
        System.out.println("Hi");
        System.out.println("Hello!");
        System.out.println("Bye!");
    }
}
