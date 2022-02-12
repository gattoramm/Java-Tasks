package Fundamentals.Main.OptionalTask2.Ex1_3;

import Fundamentals.Main.OptionalTask2.Matrix;

import java.util.Scanner;

/**
 * Задание. Ввести с консоли n - размерность матрицы a [n] [n].
 * Задать значения элементов матрицы в интервале значений от -M до M
 * с помощью генератора случайных чисел (класс Random).
 *
 *  Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.
 */

public class FindMaxElementsOfIncreasingSequenceInRowOfMatrix {
    // поиск индексов начала и конца наибольших возрастающих элементов в строке массива
    public static int[] findIndexesOfMaxIncreasingSequenceInRowOfMatrix(int[] sequence) {
        int countSequence = 1;
        int countSubSequence = 1;

        int startIndexSequence = 0;
        int stopIndexSequence = 0;

        int startIndexSubSequence = 0;
        int stopIndexSubSequence = 0;

        for (int i = 1; i < sequence.length; i++) {
            if (sequence[i] > sequence[i-1]) {
                countSubSequence++;
            } else {
                startIndexSubSequence = i;
            }
            stopIndexSubSequence = i;

            if (countSubSequence > countSequence) {
                countSequence = countSubSequence;
                startIndexSequence = startIndexSubSequence;
                stopIndexSequence = stopIndexSubSequence;
            }
        }
        return new int[]{startIndexSequence, stopIndexSequence};
    }

    // поиск индексов начала и конца наибольших возрастающих элементов по всем строкам массива
    private static int findMaxLenSeqInMatrix(int[][] matrix) {
        int maxSequence = 0;
        int maxSequenceInRow;
        int[] valuesOfRowMatrix;
        for (int[] ints : matrix) {
            valuesOfRowMatrix = new int[matrix.length];
            for (int in = 0; in < matrix[0].length; in++)
                valuesOfRowMatrix[in] = ints[in];
            int startIndex = findIndexesOfMaxIncreasingSequenceInRowOfMatrix(valuesOfRowMatrix)[0];
            int stopIndex = findIndexesOfMaxIncreasingSequenceInRowOfMatrix(valuesOfRowMatrix)[0];
            maxSequenceInRow = stopIndex - startIndex + 1;
            if (maxSequence < maxSequenceInRow) {
                maxSequence = maxSequenceInRow;
            }
        }
        return maxSequence;
    }

    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert dimension: ");
        int inputValue = scanner.nextInt();
        System.out.print("Insert max value: ");
        int maxValue = scanner.nextInt();
        int[][] matrix = Matrix.createMatrix(inputValue, maxValue);
        Matrix.printMatrix(matrix);
        System.out.println();
        System.out.println("Наибольшее число возрастающих элементов матрицы, идущих подряд = " + findMaxLenSeqInMatrix(matrix));
    }
}
