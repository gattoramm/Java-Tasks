package Fundamentals.Main.OptionalTask2.Ex1_1;

import Fundamentals.Main.OptionalTask2.Matrix;

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
    protected static void changeTwoRowsOfMatrix(int rowOne, int row2, int[][] matrix) {
        for (int i = 0; i <  matrix[0].length; i++) {
            int tmp = matrix[rowOne][i];
            matrix[rowOne][i] = matrix[row2][i];
            matrix[row2][i] = tmp;
        }
    }

    // сортировка строк матрицы k-го столбца
    protected static void sortedColumnOfMatrix(int column, int[][] matrix) {
        // сортировка вставкой
        for (int out = 1; out < matrix[0].length; out++) {
            int in = out;
            int tempValueRowColumn = matrix[out][column-1];

            while (in > 0 && matrix[in-1][column-1] >= tempValueRowColumn) {
                changeTwoRowsOfMatrix(in, in - 1, matrix);
                --in;
            }
        }
    }
}

class App {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert dimension: ");
        int inputValue = scanner.nextInt();

        System.out.print("Insert max value: ");
        int maxValue = scanner.nextInt();

        int[][] matrix = Matrix.createMatrix(inputValue, maxValue);

        System.out.println("Before :");
        Matrix.printMatrix(matrix);

        System.out.print("Insert row: ");
        int row = scanner.nextInt();

        Ex1_1.sortedColumnOfMatrix(row, matrix);

        System.out.println("After :");
        Matrix.printMatrix(matrix);
    }
}
