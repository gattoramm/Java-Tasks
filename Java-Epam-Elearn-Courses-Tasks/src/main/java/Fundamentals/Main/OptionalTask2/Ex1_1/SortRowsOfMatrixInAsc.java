package Fundamentals.Main.OptionalTask2.Ex1_1;

import Fundamentals.Main.OptionalTask2.Matrix;

import java.util.Scanner;

/**
 * Задание. Ввести с консоли n - размерность матрицы a [n] [n].
 * Задать значения элементов матрицы в интервале значений от -M до M
 * с помощью генератора случайных чисел (класс Random).
 *  Упорядочить строки матрицы в порядке возрастания
 *  значений элементов k-го столбца.
 *  note: row - строка, column - столбец
 */

class SortRowsOfMatrixInAsc {
    // новые индексы массива после сортировки значений
    protected static int[] findIndexesOfSortedSequence(int[] sequence) {
        int len = sequence.length;
        int[] indexesOfSortedSequence = new int[len];
        for(int i=0; i<len; i++)
            indexesOfSortedSequence[i] = i;

        // сортировка вставкой
        for (int out = 1; out < len; out++) {
            int in = out;
            int tempValue = sequence[out];

            while (in>0 && sequence[in-1] > tempValue) {
                sequence[in] = sequence[in-1];
                indexesOfSortedSequence[in] = indexesOfSortedSequence[in-1];
                in--;
            }
            sequence[in] = tempValue;
            indexesOfSortedSequence[in] = out;
        }
        return indexesOfSortedSequence;
    }

    // новая матрица с переставленными строками
    protected static int[][] matrixWithSortedColumnsByRow(int row, int[][] matrix) {
        int[] rowValue = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++)
            rowValue[i] = matrix[i][row];
        int[] indexSortedSequence = findIndexesOfSortedSequence(rowValue);

        int[][] resMatrix = new int[matrix.length][matrix[0].length];
        for (int out = 0; out < matrix.length; out++)
            System.arraycopy(matrix[indexSortedSequence[out]], 0, resMatrix[out], 0, matrix[0].length);

        return resMatrix;
    }
}

class App {
    public static void main (String[] args){
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

        int row = (int) (Math.random() * matrix.length);

        System.out.println("row = " + row);

        int[][] res = SortRowsOfMatrixInAsc.matrixWithSortedColumnsByRow(row, matrix);

        System.out.println("After: ");

        Matrix.printMatrix(res);

    }
}
