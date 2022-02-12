package Fundamentals.Main.MainTask;

/**
 * Ввести целые числа как аргументы командной строки, подсчитать их сумму
 * (произведение) и вывести результат на консоль.
 */

public class Ex4 {
    public static void main(String[] args) {
        if(args.length == 0) return;

        int sum = 0, mul = 1;

        for (String item : args) {
            sum +=  Integer.parseInt(item);
            mul *=  Integer.parseInt(item);
        }
        System.out.println("Sum = " + sum);
        System.out.println("Mult = " + mul);
    }
}
