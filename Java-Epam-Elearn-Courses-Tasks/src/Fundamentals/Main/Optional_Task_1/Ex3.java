package Fundamentals.Main.Optional_Task_1;

/**
 * Задание. Ввести n чисел с консоли.
 * Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.
 */

public class Ex3 {
    public static void main(String[] args) {
        if(args.length == 0) return;

        String[] list = new String[args.length];

        int avrLenght = 0;

        for (int i = 0; i < args.length; i++) {
            avrLenght += args[i].length();
            list[i] = args[i];
        }
        avrLenght /= list.length;

        for(String item : list) {
            if (item.length() > avrLenght)
                System.out.println(item);
        }
    }
}
