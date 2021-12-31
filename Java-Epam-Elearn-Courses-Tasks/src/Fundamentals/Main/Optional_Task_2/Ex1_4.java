package Fundamentals.Main.Optional_Task_2;

import java.util.Scanner;

/**
 * Задание. Ввести с консоли n - размерность матрицы a [n] [n].
 * Задать значения элементов матрицы в интервале значений от -M до M
 * с помощью генератора случайных чисел (класс Random).
 *
 *  Найти сумму элементов матрицы, расположенных между первым и вторым
 *  положительными элементами каждой строки
 */

public class Ex1_4 {
    // заполнение матрицы случайными числами
    public static int[][] createMatrix(int dimension, int maxValue) {
        int[][] matrix = new int[dimension][dimension];

        for (int out = 0; out < dimension; out++) {
            for (int in = 0; in < dimension; in++) {
                matrix[out][in] = (int) (Math.random() * (2 * maxValue + 1)) - maxValue;
            }
        }
        return matrix;
    }

    // распечатка матрицы
    public static void printMatrix (int[][] matrix) {
        for (int out = 0; out <  matrix[0].length; out++) {
            for (int in = 0; in <  matrix[0].length; in++) {
                System.out.print("a[" + (out + 1) + "][" + (in + 1) + "]=" + matrix[out][in] + "\t");
            }
            System.out.println();
        }
    }

    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert n: ");
        int inputValue = scanner.nextInt();

        int[][] matrix = createMatrix(inputValue, 50);

        printMatrix(matrix);

    }
}
