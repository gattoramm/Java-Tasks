package Fundamentals.Main.Optional_Task_2;

import java.util.Scanner;

/**
 * Задание. Ввести с консоли n - размерность матрицы a [n] [n].
 * Задать значения элементов матрицы в интервале значений от -M до M
 * с помощью генератора случайных чисел (класс Random).
 *
 *  Упорядочить столбцы матрицы в порядке возрастания
 *  значений элементов k-й строки.
 */

public class Ex1_2 {
    // замена столбцов
    private static void changeColumnsOfMatrix(int column1, int column2, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int tmp = matrix[i][column1];
            matrix[i][column1] = matrix[i][column2];
            matrix[i][column2] = tmp;
        }
    }

    // сортировка столбцов матрицы k-й строки
    private static void sortedColumnOfMatrix(int row, int[][] matrix){
        // сортировка вставкой
        for (int out = 1; out < matrix.length; out++) {
            int in = out;
            int tempValueRowColumn = matrix[row][out];

            while (in > 0 && matrix[row][in-1] >= tempValueRowColumn) {
                changeColumnsOfMatrix(in, in - 1, matrix);
                --in;
            }
        }
    }

    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert n: ");
        int inputValue = scanner.nextInt();

        int[][] matrix = Matrix.createMatrix(inputValue, 50);

        System.out.println("Before:");
        Matrix.printMatrix(matrix);

        System.out.print("Insert column: ");
        int column = scanner.nextInt();

        sortedColumnOfMatrix(column, matrix);

        System.out.println("After:");
        Matrix.printMatrix(matrix);
    }
}
