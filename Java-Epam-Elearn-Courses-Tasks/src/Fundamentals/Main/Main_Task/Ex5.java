package Fundamentals.Main.Main_Task;

/**
 * Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу.
 * Осуществить проверку корректности ввода чисел.
 */

public class Ex5 {
    private enum Year {
        January,
        February,
        March,
        April,
        May,
        June,
        July,
        August,
        September,
        October,
        November,
        December
    }

    public static void main(String[] args) {
        if(args.length == 0) return;

        int num = Integer.parseInt(args[0]);

        if (num < 1 || num > 12) return;

        System.out.println(Year.values()[num - 1]);
    }
}
