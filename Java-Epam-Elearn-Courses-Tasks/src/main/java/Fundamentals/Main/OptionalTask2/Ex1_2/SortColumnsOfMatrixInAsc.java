package Fundamentals.Main.OptionalTask2.Ex1_2;

import Fundamentals.Main.OptionalTask2.Matrix;

import java.util.Scanner;

/**
 * Задание. Ввести с консоли n - размерность матрицы a [n] [n].
 * Задать значения элементов матрицы в интервале значений от -M до M
 * с помощью генератора случайных чисел (класс Random).
 *
 *  Упорядочить столбцы матрицы в порядке возрастания
 *  значений элементов k-й строки.
 *
 *  note: row - строка, column - столбец
 */

public class SortColumnsOfMatrixInAsc {
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
            int tempValueRowColumn = matrix[row-1][out];

            while (in > 0 && matrix[row-1][in-1] >= tempValueRowColumn) {
                changeColumnsOfMatrix(in, in - 1, matrix);
                --in;
            }
        }
    }

    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert dimension: ");
        int inputValue = scanner.nextInt();

        System.out.print("Insert max value: ");
        int maxValue = scanner.nextInt();

        int[][] matrix = Matrix.createMatrix(inputValue, maxValue);

        System.out.println("Before:");
        Matrix.printMatrix(matrix);

        System.out.print("Insert column: ");
        int column = scanner.nextInt();

        sortedColumnOfMatrix(column, matrix);

        System.out.println("After:");
        Matrix.printMatrix(matrix);
    }
}

class App {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размерность квадратной матрицы: ");

        int inputValue = scanner.nextInt();
        System.out.print("Введите максимальное число: ");

        int maxValue = scanner.nextInt();*/

        //int[][] matrix = Matrix.createMatrix(inputValue, maxValue);

        int maxDimension = 5; int maxValue = 50;
        int[][] matrix = Matrix.createRandomMatrix(maxDimension, maxValue);

        System.out.println("Before :");
        Matrix.printMatrix(matrix);
    }
}
