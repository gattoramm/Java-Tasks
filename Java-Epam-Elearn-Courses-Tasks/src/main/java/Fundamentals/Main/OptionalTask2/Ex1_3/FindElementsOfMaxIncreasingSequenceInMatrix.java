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
    // поиск количества наибольших возрастающих элементов в строке массива
    protected static int findCountsOfElementsMaxIncreasingSequence(int[] sequence) {
        if (sequence.length == 0)
            return 0;

        int countSequence = 1;
        int countSubSequence = 1;

        for (int i = 1; i < sequence.length; i++) {
            if (sequence[i] > sequence[i-1])
                countSubSequence++;
            else
                countSubSequence = 1;

            if (countSubSequence > countSequence)
                countSequence = countSubSequence;
        }

        return countSequence;
    }

    // поиск индексов начала и конца первой последовательности с наибольшими возрастающими элементами в строке массива
    protected static int[] findIndexesOfMaxIncreasingSequenceInRowOfMatrix(int[] sequence) {
        int countsOfMaxIncreasingSequence = findCountsOfElementsMaxIncreasingSequence(sequence);

        if (countsOfMaxIncreasingSequence == 0)
            return new int[]{-1, -1};

        int startIndexSequence = 0;
        int stopIndexSequence = 0;

        int countSubSequence = 1;

        int i = 1;

        while (i < sequence.length && countSubSequence != countsOfMaxIncreasingSequence) {
            if (sequence[i] > sequence[i - 1]) {
                countSubSequence++;
            } else {
                countSubSequence = 1;
                startIndexSequence = i;
            }
            stopIndexSequence = i;

            i++;
        }

        return new int[]{startIndexSequence, stopIndexSequence};
    }

    // поиск индексов начала и конца наибольших возрастающих элементов по всем строкам массива
    protected static int[][] findIndexesOfMaxIncreasingSequenceInMatrix(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[][]{{-1, -1}, {-1, -1}};
        }

        int[] countsOfMaxIncreasingSequenceInRowsMatrix = new int[matrix.length];


        for (int i = 0; i < matrix.length; i++) {
            countsOfMaxIncreasingSequenceInRowsMatrix[i] =
                    findCountsOfElementsMaxIncreasingSequence(matrix[i]);
        }

        int maxCountsOfIncreaseSequenceMatrix = 0;
        int rowWithMaxIncreaseSequence = 0;

        for (int i = 0; i < countsOfMaxIncreasingSequenceInRowsMatrix.length; i++) {
            int item = countsOfMaxIncreasingSequenceInRowsMatrix[i];
            if (item > maxCountsOfIncreaseSequenceMatrix) {
                maxCountsOfIncreaseSequenceMatrix = item;
                rowWithMaxIncreaseSequence = i;
            }
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
