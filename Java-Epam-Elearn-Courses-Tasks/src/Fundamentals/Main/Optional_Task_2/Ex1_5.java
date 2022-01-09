package Fundamentals.Main.Optional_Task_2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Задание. Ввести с консоли n - размерность матрицы a [n] [n].
 * Задать значения элементов матрицы в интервале значений от -M до M
 * с помощью генератора случайных чисел (класс Random).
 *
 * Найти максимальный элемент в матрице и удалить из матрицы
 * все строки и столбцы, его содержащие
 */

public class Ex1_5 {
    // поиск максимального элемента в матрице и количество таких элементов
    private static int[] findMaxValueAndCountInMatrix(int[][] matrix) {
        int maxValue = matrix[0][0];
        int countMaxValue = 0;
        int[] result = new int[2];

        for (int[] outs : matrix)
            for (int ints : outs)
                if (ints > maxValue) {
                    maxValue = ints;
                    countMaxValue++;
                }

        result[0] = maxValue;
        result[1] = countMaxValue;

        return result;
    }

    // поиск позиций максимальных элементов матрицы
    private static int[][] findIndexOfValue(int[][] matrix, int maxValue) {
        int count = findMaxValueAndCountInMatrix(matrix)[1];
        int[][] indexesOfMaxValue = new int[count][2];
        int j = 0;

        for (int out = 0; out < matrix.length; out++) {
            for (int in = 0; in < matrix[out].length; in++) {
                if (matrix[out][in] == maxValue) {
                    indexesOfMaxValue[j][0] = out;
                    indexesOfMaxValue[j][1] = in;
                    j++;
                }
            }
        }

        return indexesOfMaxValue;
    }

    // поиск уникальных значений строк/столбцов
    //private static

    // поиск уникальных значений строк
    private static int[] uniqueRowsWithMaxValueOfMatrix(int[][] matrix, int[][] ceil) {
        int[][] indexesOfMaxElements = findIndexOfValue(matrix, findMaxValueAndCountInMatrix(matrix)[0]);
        int[] rowsOfMaxElements = indexesOfMaxElements[0];
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);

        int[] result = new int[rowsOfMaxElements.length];

        int count = 0;

        result[count++] = rowsOfMaxElements[0];

        for (int out = 1; out < rowsOfMaxElements.length; out++) {
            int countOfRows = 1;
            int currentValue = rowsOfMaxElements[out];

            for (int in = out; in > 0; in--)
                if (rowsOfMaxElements[in] == currentValue) countOfRows++;

            if (countOfRows == 1)
                result[count++] = rowsOfMaxElements[out];
        }

        return result;
    }

    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert n: ");
        int inputValue = scanner.nextInt();

        int[][] matrix = Matrix.createMatrix(inputValue, 5);

        Matrix.printMatrix(matrix);

    }
}
