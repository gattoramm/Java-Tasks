package Fundamentals.Main.MainTask;

import java.util.Scanner;

/**
 * Приветствовать любого пользователя при вводе его имени через командную строку.
 * */

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert username: ");
        String user  = scanner.next();

        System.out.print("Hello, " + user);
    }
}
