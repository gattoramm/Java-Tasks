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
    // поиск максимального числа возрастающих элементов в строке матрице
    private static int findMaxCountSubsequenceInSequence (int[] sequence) {
        int maxSequenceInRow = 0;
        int maxSubSequence = 1;

        for (int i = 1; i < sequence.length; i++) {
            if (sequence[i] > sequence[i-1]) {
                maxSubSequence++;
            }
            else if (maxSubSequence > maxSequenceInRow) {
                    maxSequenceInRow = maxSubSequence;
                }
                maxSubSequence = 1;
        }
        return maxSequenceInRow;
    }

    // поиск максимального числа возрастающих элементов в матрице
    private static int findMaxCountSequenceInMatrix(int[][] matrix) {
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

    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert n: ");
        int inputValue = scanner.nextInt();

        int[][] matrix = Matrix.createMatrix(inputValue, 50);

        Matrix.printMatrix(matrix);

        System.out.println();
        System.out.println(findMaxCountSequenceInMatrix(matrix));
    }
}
