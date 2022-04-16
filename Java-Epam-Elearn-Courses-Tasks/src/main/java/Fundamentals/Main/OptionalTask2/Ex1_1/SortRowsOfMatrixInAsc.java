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

class SortRowsOfMatrixInAsc {
    // перестановка 2х строк
    protected static int[][] matrixWithSwapTwoRowsO(int row1, int row2, int[][] matrix) {
        int[][] matrixWithSwapRows = matrix;
        for (int i = 0; i <  matrixWithSwapRows[0].length; i++) {
            int tmp = matrixWithSwapRows[row1][i];
            matrixWithSwapRows[row1][i] = matrixWithSwapRows[row2][i];
            matrixWithSwapRows[row2][i] = tmp;
        }
        return matrixWithSwapRows;
    }

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
            indexesOfSortedSequence[out] = in;
        }

        return indexesOfSortedSequence;
    }

    // новые индексы строк после сортировки значений (по возрастанию) в данном столбце
    protected static int[] findIndexesOfSortedByValuesInColumn(int column, int[][] matrix) {
        // создадим массив со значениями индексов выбранного столбца
        // отсортируем значения выбранного столбца и сохраним переставленные индексы
        int[] indexesOfSortedByValuesInColumn = new int[matrix[0].length];

//        // сортировка вставкой
//        for (int out = 1; out < matrix[0].length; out++) {
//            int in = out;
//            int tempValueRowColumn = matrix[out][column-1];
//
//            while (in > 0 && matrix[in-1][column-1] >= tempValueRowColumn) {
//                swapTwoRowsOfMatrix(in, in - 1, matrix);
//                --in;
//            }
//        }
        return null;
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

//        SortRowsOfMatrixInAsc.sortingRowsOfMatrix(row, matrix);
//
//        System.out.println("After :");
//        Matrix.printMatrix(matrix);
    }
}
