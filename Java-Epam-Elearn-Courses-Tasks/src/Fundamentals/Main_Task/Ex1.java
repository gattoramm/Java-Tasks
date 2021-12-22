package Fundamentals.Main_Task;

/**
 * Приветствовать любого пользователя при вводе его имени через командную строку.
 * */

public class Ex1 {
    public static void main(String[] args) {
        if(args.length == 0) return;

        System.out.println("Hello " + args[0]);
    }
}
