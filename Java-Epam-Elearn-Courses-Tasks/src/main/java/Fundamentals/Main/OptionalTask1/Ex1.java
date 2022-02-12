package Fundamentals.Main.OptionalTask1;

/**
 * Задание. Ввести n чисел с консоли.
 * Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
 */

public class Ex1 {
    public static void main(String[] args) {
        if(args.length == 0) return;

        int min = 0, max = 0;
        int num;

        for (String arg : args) {
            num = Integer.parseInt(arg);
            if (num < min) min = num;
            if (num > max) max = num;
        }

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}
