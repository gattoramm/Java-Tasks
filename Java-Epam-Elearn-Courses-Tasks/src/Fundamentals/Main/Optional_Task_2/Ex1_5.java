package Fundamentals.Main.Optional_Task_2;

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
    // поиск максимального элемента в матрице
    private static int findMaxValueMatrix(int[][] matrix) {
        int maxValue = matrix[0][0];

        for (int[] outs : matrix)
            for (int ints : outs)
                if (ints > maxValue) maxValue = ints;

        return maxValue;
    }

    // поиск позиций по значению элемента матрицы
    private static int[][] findIndexOfValue(int[][] matrix, int value) {
        int count = 0;
        for (int[] outs : matrix)
            for (int ints : outs)
                if (ints == value) count++;

        int[][] indexesOfMaxValue = new int[count][2];

        int j = 0;

        for (int out = 0; out < matrix.length; out++) {
            for (int in = 0; in < matrix[out].length; in++) {
                if (matrix[out][in] == value) {
                    indexesOfMaxValue[j][0] = out;
                    indexesOfMaxValue[j][1] = in;
                    j++;
                }
            }
        }
        return indexesOfMaxValue;
    }

    // новый массив с уникальными значениями индексов (столбцов или строк) найденных элементов
    // разность индексов исходного массива и индексов найденных значений
    private static int[] uniqueIndex(int[] indexesOfMatrix, int[] indexesFindElements) {
        // индексы матрицы - от 0 до длины массива
        // индексы найденных значений - любые по возрастанию с дублированием
        int lenIndexesOfMatrix = indexesOfMatrix.length;
        int lenIndexesFindElements = indexesFindElements.length;

        // найдем количество уникальных индексов найденных значений
        int countUniqueIndexesFindElement = 0;
        for (int i = 1; i < lenIndexesFindElements; i++) {
            if (indexesFindElements[i] != indexesFindElements[i-1]) {
                countUniqueIndexesFindElement++;
                i++;
            }
        }

        // создадим массив с уникальными индексами найденых значений
        int lenNewUniqueIndexesFindElements = lenIndexesFindElements - countUniqueIndexesFindElement;
        int[] newUniqueIndexesFindElements = new int[lenNewUniqueIndexesFindElements];
        int j = 0;

        for (int i = 1; i < lenIndexesOfMatrix; i++) {
            if (indexesFindElements[i] != indexesFindElements[i-1]) {
                newUniqueIndexesFindElements[j] = indexesFindElements[i];
                j++;
            }
        }

        // новый массив индексов без индексов найденных элементов
        int lenNewMassiveForIndexes = lenIndexesOfMatrix - lenNewUniqueIndexesFindElements;
        int[] newMassiveOfIndexes = new int[lenNewMassiveForIndexes];

        // заполнение
        int s = 0;
        for (int i = 0; i < lenIndexesOfMatrix; i++) {
            for (int k = 0; k < lenNewMassiveForIndexes; k++) {
                if (i != newUniqueIndexesFindElements[k]) {
                    newMassiveOfIndexes[s] = i;
                    s++;
                } else {
                    i++;k++;
                }
            }
        }

        return newMassiveOfIndexes;
    }

    // новая матрица с удалеными строками и столбцами с максимальным элементом
    private static int[][] newMatrixWithoutElement(int[][] matrix, int value) {
        // матрица с позициями максимальных элементов
        int maxValue = findMaxValueMatrix(matrix);
        int[][] tmp = findIndexOfValue(matrix, maxValue);
        

        return null;
    }

    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert n: ");
        int inputValue = scanner.nextInt();

        int[][] matrix = Matrix.createMatrix(inputValue, 5);

        Matrix.printMatrix(matrix);

    }
}
