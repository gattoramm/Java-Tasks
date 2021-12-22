package Fundamentals.Optional_Task_1;

/**
 * Задание. Ввести n чисел с консоли.
 * Вывести числа в порядке возрастания (убывания) значений их длины.
 */

public class Ex2 {

    public static void main(String[] args) {
        if(args.length == 0) return;

        int[] list = new int[args.length];

        for (int i = 0; i < args.length; i++)
            list[i] = Integer.parseInt(args[i]);

        int in, out;

        for (out = 1; out < list.length; out++) {
            int temp = list[out];
            in = out;
            while (in > 0 && list[in-1] >= temp) {
                list[in] = list[in-1];
                --in;
            }
            list[in] = temp;
        }

        for (int item : list)
            System.out.println(item);
    }
}
