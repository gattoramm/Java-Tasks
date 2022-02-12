package Fundamentals.Main.Optional_Task_2;

import java.util.Scanner;

/**
 * Задание. Ввести с консоли n - размерность матрицы a [n] [n].
 * Задать значения элементов матрицы в интервале значений от -M до M
 * с помощью генератора случайных чисел (класс Random).
 *
 *  Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.
 */

public class Ex1_3_findMaxLenOfIncreasingSeqInRowOfMatrix {
    // поиск максимального числа возрастающих элементов в массиве
    private static int findMaxLenOfIncreasingSeqInRowOfMatrix (int[] sequence) {
        int[] lengthOfIncreasingSeqAndStartIndex;

        int maxSequence = 1;
        int maxSubSequence = 1;

        int startIndex = 0;
        int stopIndex = 0;

        for (int i = 1; i < sequence.length; i++) {
            if (sequence[i] > sequence[i-1]) {
                maxSubSequence++;
            } else {
                startIndex = i;
            }
            stopIndex = i;

            if (maxSubSequence > maxSequence) {
                maxSequence = maxSubSequence;

            }

            maxSubSequence = 1;
        }
        return maxSequence;
    }

    // поиск максимального числа возрастающих элементов в матрице
    private static int findMaxLenSeqInMatrix(int[][] matrix) {
        int maxSequence = 0;
        int maxSequenceInRow;
        int[] valuesOfRowMatrix;

        for (int[] ints : matrix) {
            valuesOfRowMatrix = new int[matrix.length];

            for (int in = 0; in < matrix[0].length; in++)
                valuesOfRowMatrix[in] = ints[in];

            maxSequenceInRow = findMaxLenOfIncreasingSeqInRowOfMatrix(valuesOfRowMatrix);

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
