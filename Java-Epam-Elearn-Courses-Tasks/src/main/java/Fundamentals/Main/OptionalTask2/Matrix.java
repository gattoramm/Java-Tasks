package Fundamentals.Main.OptionalTask2;

public class Matrix {
    // заполнение матрицы случайными числами
    public static int[][] createMatrix(int dimension, int maxValue) {
        int[][] matrix = new int[dimension][dimension];

        for (int out = 0; out < dimension; out++)
            for (int in = 0; in < dimension; in++)
                matrix[out][in] = (int) (Math.random() * (2 * maxValue + 1)) - maxValue;
        
        return matrix;
    }

    // распечатка матрицы
    public static void printMatrix(int[][] matrix) {
        for (int out = 0; out <  matrix.length; out++) {
            for (int in = 0; in <  matrix[0].length; in++)
                System.out.print("a[" + (out + 1) + "][" + (in + 1) + "]=" + matrix[out][in] + "\t");

            System.out.println();
        }
    }
}
