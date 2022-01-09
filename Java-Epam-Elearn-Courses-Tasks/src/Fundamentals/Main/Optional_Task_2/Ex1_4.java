package Fundamentals.Main.Optional_Task_2;

import java.util.Scanner;

/**
 * Задание. Ввести с консоли n - размерность матрицы a [n] [n].
 * Задать значения элементов матрицы в интервале значений от -M до M
 * с помощью генератора случайных чисел (класс Random).
 *
 *  Найти сумму элементов матрицы,
 *  расположенных между первым и вторым положительными элементами
 *  каждой строки
 */

public class Ex1_4 {
    // подсчет 2х положительных элементов в строке
    private static int sumTwoPositiveValuesMatrixRow(int[] row) {
        int count = 0;
        int sum = 0;
        int j = 0;
        int[] arrTwoPositiveValues = new int[]{-1, -1};

        for (int i = 0; i < row.length && count < 2; i++) {
            if (row[i] >= 0) {
                count++;
                arrTwoPositiveValues[j] = i;
                j++;
            }
        }

        if (arrTwoPositiveValues[0] < 0 && arrTwoPositiveValues[1] < 0) return 0;

        for (int i = arrTwoPositiveValues[0]; i < arrTwoPositiveValues[1] - 1; i++)
            sum += row[i + 1];

        return sum;
    }

    // вывод суммы элементов матрицы, расположенных первыми 2мя положительными элементами каждой строки
    private static void printSumTwoPositiveValuesMatrixRow(int[][] matrix) {
        int[] row = new int[matrix.length];

        for (int out = 0; out < matrix.length; out++) {
            for (int in = 0; in < matrix[out].length; in++) {
                row[in] = matrix[out][in];
            }
            System.out.println("Row " + out + " : " + sumTwoPositiveValuesMatrixRow(row));
        }
    }

    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert n: ");
        int inputValue = scanner.nextInt();

        int[][] matrix = Matrix.createMatrix(inputValue, 50);

        Matrix.printMatrix(matrix);

        System.out.println("Print sum: ");
        printSumTwoPositiveValuesMatrixRow(matrix);
    }
}
