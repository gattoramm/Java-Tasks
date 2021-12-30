package Fundamentals.Main.Optional_Task_2;

import java.util.Scanner;

/**
 * Задание. Ввести с консоли n - размерность матрицы a [n] [n].
 * Задать значения элементов матрицы в интервале значений от -M до M
 * с помощью генератора случайных чисел (класс Random).
 *
 *  Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.
 */

public class Ex1_3 {
    public static int findMaxSequenceInMatrix(int[][] matrix) {
        int maxSequence = 0;
        int maxSequenceInRow;
        int[] valuesOfRowMatrix;

        for (int[] ints : matrix) {
            valuesOfRowMatrix = new int[matrix.length];

            for (int in = 0; in < matrix[0].length; in++)
                valuesOfRowMatrix[in] = ints[in];

            maxSequenceInRow = countIncreaseArray(valuesOfRowMatrix);
            maxSequence = maxSequence > maxSequenceInRow ? maxSequence : maxSequenceInRow;
        }
        return maxSequence;
    }

    public static int countIncreaseArray (int[] sequence) {
        int maxSequenceInRow = 0;
        int maxSubSequence = 1;

        for (int i = 1; i < sequence.length; i++) {
            if (sequence[i] > sequence[i-1]) {
                maxSubSequence++;
            }
            else {
                if (maxSubSequence > maxSequenceInRow) {
                    maxSequenceInRow = maxSubSequence;
                }
                maxSubSequence = 1;
            }
        }
        return maxSequenceInRow;
    }

    public static void printMatrix (int[][] matrix) {
        for (int out = 0; out <  matrix[0].length; out++) {
            for (int in = 0; in <  matrix[0].length; in++) {
                System.out.print("a[" + (out + 1) + "][" + (in + 1) + "]=" + matrix[out][in] + "\t");
            }
            System.out.println();
        }
    }

    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert n: ");
        int inputValue = scanner.nextInt();

        int[][] matrix = new int[inputValue][inputValue];
        int M = 50;

        for (int out = 0; out < inputValue; out++) {
            for (int in = 0; in < inputValue; in++) {
                matrix[out][in] = (int) (Math.random() * (2 * M + 1)) - M;
            }
        }

        printMatrix(matrix);

        System.out.println();
        System.out.println(findMaxSequenceInMatrix(matrix));
    }
}
