package Fundamentals.Main.Main_Task;

/**
 * Отобразить в окне консоли аргументы командной строки в обратном порядке.
 */

public class Ex2 {
    public static void main(String[] args) {
        if(args.length == 0) return;

        for(int i = args.length - 1; i >= 0; i--) {
            System.out.println(args[i]);
        }

    }
}
