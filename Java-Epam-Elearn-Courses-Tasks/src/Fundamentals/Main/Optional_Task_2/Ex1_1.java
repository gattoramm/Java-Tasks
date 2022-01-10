package Fundamentals.Main.Optional_Task_2;

import java.util.Scanner;

/**
 * Задание. Ввести с консоли n - размерность матрицы a [n] [n].
 * Задать значения элементов матрицы в интервале значений от -M до M
 * с помощью генератора случайных чисел (класс Random).
 *
 *  Упорядочить строки матрицы в порядке возрастания
 *  значений элементов k-го столбца.
 */

public class Ex1_1 {
    // замена строк
    private static void changeRowsOfMatrix(int row1, int row2, int[][] matrix) {
        for (int i = 0; i <  matrix[0].length; i++) {
            int tmp = matrix[row1][i];
            matrix[row1][i] = matrix[row2][i];
            matrix[row2][i] = tmp;
        }
    }

    // сортировка строк матрицы k-го столбца
    private static void sortedColumnOfMatrix(int column, int[][] matrix){
        // сортировка вставкой
        for (int out = 1; out < matrix[0].length; out++) {
            int in = out;
            int tempValueRowColumn = matrix[out][column];

            while (in > 0 && matrix[in-1][column] >= tempValueRowColumn) {
                changeRowsOfMatrix(in, in - 1, matrix);
                --in;
            }
        }
    }

    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert n: ");
        int inputValue = scanner.nextInt();

        int[][] matrix = Matrix.createMatrix(inputValue, 50);

        System.out.println("Before :");
        Matrix.printMatrix(matrix);

        System.out.print("Insert row: ");
        int row = scanner.nextInt();

        sortedColumnOfMatrix(row, matrix);

        System.out.println("After :");
        Matrix.printMatrix(matrix);
    }
}
