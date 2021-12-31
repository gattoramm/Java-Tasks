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
    // заполнение матрицы случайными числами
    public static int[][] createMatrix(int dimension, int maxValue) {
        int[][] matrix = new int[dimension][dimension];

        for (int out = 0; out < dimension; out++) {
            for (int in = 0; in < dimension; in++) {
                matrix[out][in] = (int) (Math.random() * (2 * maxValue + 1)) - maxValue;
            }
        }
        return matrix;
    }

    // поиск максимального числа возрастающих элементов в строке матрице
    public static int findMaxCountSubsequenceInSequence (int[] sequence) {
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

    // поиск максимального числа возрастающих элементов в матрице
    public static int findMaxCountSequenceInMatrix(int[][] matrix) {
        int maxSequence = 0;
        int maxSequenceInRow;
        int[] valuesOfRowMatrix;

        for (int[] ints : matrix) {
            valuesOfRowMatrix = new int[matrix.length];

            for (int in = 0; in < matrix[0].length; in++)
                valuesOfRowMatrix[in] = ints[in];

            maxSequenceInRow = findMaxCountSubsequenceInSequence(valuesOfRowMatrix);
            maxSequence = maxSequence > maxSequenceInRow ? maxSequence : maxSequenceInRow;
        }
        return maxSequence;
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

        int[][] matrix = createMatrix(inputValue, 50);

        printMatrix(matrix);

        System.out.println();
        System.out.println(findMaxCountSequenceInMatrix(matrix));
    }
}
