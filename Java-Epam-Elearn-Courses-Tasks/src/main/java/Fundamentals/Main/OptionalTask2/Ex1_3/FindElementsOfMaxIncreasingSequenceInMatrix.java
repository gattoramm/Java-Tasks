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

class FindElementsOfMaxIncreasingSequenceInMatrix {
    // поиск индексов начала и конца наибольших возрастающих элементов в строке массива
    protected static int[] findIndexesOfMaxIncreasingSequenceInRowOfMatrix(int[] sequence) {
        if (sequence.length == 0) {
            return new int[]{-1, -1};
        }

        int countSequence = 1;
        int countSubSequence = 1;

        int startIndexSequence = 0;
        int stopIndexSequence = 0;

        int startIndexSubSequence = 0;
        int stopIndexSubSequence;

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
    protected static int[][] findIndexesOfMaxIncreasingSequenceInMatrix(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[][]{{-1, -1}, {-1, -1}};
        }

        int countElementsInSequence = 1;
        int countElementsInSequenceInRow;
        int[] rowOfMatrix;

        int startIndexMaxSequenceOfMatrix = 0;
        int stopIndexMaxSequenceOfMatrix = 0;
        int resultRow = 0;

        for (int out = 0; out < matrix.length; out++) {
            int[] ints = matrix[out];
            rowOfMatrix = new int[matrix.length];

            for (int in = 0; in < matrix[0].length; in++)
                rowOfMatrix[in] = ints[in];

            int startIndexMaxSequenceInRow = findIndexesOfMaxIncreasingSequenceInRowOfMatrix(rowOfMatrix)[0];
            int stopIndexMaxSequenceInRow = findIndexesOfMaxIncreasingSequenceInRowOfMatrix(rowOfMatrix)[1];

            countElementsInSequenceInRow = stopIndexMaxSequenceInRow - startIndexMaxSequenceInRow + 1;

            if (countElementsInSequenceInRow >= countElementsInSequence) {
                countElementsInSequence = countElementsInSequenceInRow;
                startIndexMaxSequenceOfMatrix = startIndexMaxSequenceInRow;
                stopIndexMaxSequenceOfMatrix = stopIndexMaxSequenceInRow;
                resultRow = out;
            }
        }
        return new int[][]{{resultRow, startIndexMaxSequenceOfMatrix}, {resultRow, stopIndexMaxSequenceOfMatrix}};
    }
}

class App {
    public static void main (String[]args){
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размерность квадратной матрицы: ");

        int inputValue = scanner.nextInt();
        System.out.print("Введите максимальное число: ");

        int maxValue = scanner.nextInt();*/

        //int[][] matrix = Matrix.createMatrix(inputValue, maxValue);
        //int[][] matrix = Matrix.createMatrix(0, 50);
        int[][] matrix = Matrix.createRandomMatrix(4, 10);

        int[][] indexesOfMaxIncreaseSequence;
        indexesOfMaxIncreaseSequence =
                FindElementsOfMaxIncreasingSequenceInMatrix.findIndexesOfMaxIncreasingSequenceInMatrix(matrix);

        int rowIncreaseSequence = indexesOfMaxIncreaseSequence[0][0];
        int startIndexIncreaseSequence = indexesOfMaxIncreaseSequence[0][1];
        int stopIndexIncreaseSequence = indexesOfMaxIncreaseSequence[1][1];

        int countOfIncreaseSequence;

        if (rowIncreaseSequence != -1) {
            countOfIncreaseSequence = stopIndexIncreaseSequence - startIndexIncreaseSequence + 1;
            System.out.println("Матрица:");
            Matrix.printMatrix(matrix);
            System.out.print("Наибольшее число возрастающих элементов матрицы, идущих подряд = " + countOfIncreaseSequence);
            System.out.println("Индекс строки = " + rowIncreaseSequence);
            System.out.println("Данные последовательности : ");

            for (int i = 1; i < countOfIncreaseSequence; i++) {
                System.out.print(matrix[rowIncreaseSequence][startIndexIncreaseSequence + i-1] + " ");
            }

        } else {
            System.out.println("Матрица пустая");
        }
    }
}
