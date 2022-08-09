package Fundamentals.Main.MainTask;

import java.util.Random;
import java.util.Scanner;

/**
 * Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
 */

public class Ex3 {
    public static void main(String[] args) {
//        if(args.length == 0) return;

//        int num = Integer.parseInt(args[0]);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert dimension: ");
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            String[] myString = new String[]{" ", System.lineSeparator()};
            int ln = (int) (Math.random() * myString.length);
            System.out.print(new Random().nextInt() + myString[ln]);
        }
    }
}
