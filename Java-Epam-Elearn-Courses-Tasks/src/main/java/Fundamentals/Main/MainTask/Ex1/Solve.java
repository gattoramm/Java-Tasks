package Fundamentals.Main.MainTask.Ex1;

import java.util.Scanner;

/**
 * Приветствовать любого пользователя при вводе его имени через командную строку.
 * */

public class Solve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert username: ");
        String user  = scanner.next();

        System.out.print("Hello, " + user);
    }
}
