package Fundamentals.Main.MainTask;

import java.util.Scanner;

/**
 * Отобразить в окне консоли аргументы командной строки в обратном порядке.
 */

public class Ex2 {
    public static void main(String[] args) {
//        if(args.length == 0) return;
//
//        for(int i = args.length - 1; i >= 0; i--) {
//            System.out.println(args[i]);
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert text: ");
        String str = scanner.nextLine();

        for(int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.toCharArray()[i]);
        }
    }
}
