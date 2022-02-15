package Fundamentals.Main.OptionalTask2.Ex1_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindElementsOfMaxIncreasingSequenceInMatrixTest {
    private int getIndexOfRowOfMaxIncreasingSequenceInMatrix(int[][] matrix) {
        // индекс строки
        return FindElementsOfMaxIncreasingSequenceInMatrix.findIndexesOfMaxIncreasingSequenceInMatrix(matrix)[0][0];
    }

    private int indexOfRowOfMaxIncreasingSequenceInMatrix(int[][] matrix) {
        // индекс начала возрастающей последовательности
        return FindElementsOfMaxIncreasingSequenceInMatrix.findIndexesOfMaxIncreasingSequenceInMatrix(matrix)[0][1];
    }

    private int getIndexOfColumnOfMaxIncreasingSequenceInMatrix(int[][] matrix) {
        // индекс строки
        return FindElementsOfMaxIncreasingSequenceInMatrix.findIndexesOfMaxIncreasingSequenceInMatrix(matrix)[1][0];
    }

    private int indexOfColumnOfMaxIncreasingSequenceInMatrix(int[][] matrix) {
        // индекс конца возрастающей последовательности
        return FindElementsOfMaxIncreasingSequenceInMatrix.findIndexesOfMaxIncreasingSequenceInMatrix(matrix)[1][1];
    }

    @Test
    public void matrixWithEmptyMatrix() {
        int[][] t = {};
        // индекс строки
        assertEquals(-1, getIndexOfRowOfMaxIncreasingSequenceInMatrix(t));
        assertEquals(-1, getIndexOfColumnOfMaxIncreasingSequenceInMatrix(t));
        // индексы начали и конца возрастающей последовательности
        assertEquals(-1, indexOfRowOfMaxIncreasingSequenceInMatrix(t));
        assertEquals(-1, indexOfColumnOfMaxIncreasingSequenceInMatrix(t));
    }

    @Test
    public void matrixWithOnePositiveElement() {
        int[][] t = {{1}};
        // индекс строки
        assertEquals(0, getIndexOfRowOfMaxIncreasingSequenceInMatrix(t));
        assertEquals(0, getIndexOfColumnOfMaxIncreasingSequenceInMatrix(t));
        // индексы начали и конца возрастающей последовательности
        assertEquals(0, indexOfRowOfMaxIncreasingSequenceInMatrix(t));
        assertEquals(0, indexOfColumnOfMaxIncreasingSequenceInMatrix(t));
    }

    @Test
    public void matrixWithOneNegativeElement() {
        int[][] t = {{-1}};
        // индекс строки
        assertEquals(0, getIndexOfRowOfMaxIncreasingSequenceInMatrix(t));
        assertEquals(0, getIndexOfColumnOfMaxIncreasingSequenceInMatrix(t));
        // индексы начали и конца возрастающей последовательности
        assertEquals(0, indexOfRowOfMaxIncreasingSequenceInMatrix(t));
        assertEquals(0, indexOfColumnOfMaxIncreasingSequenceInMatrix(t));
    }

    @Test
    public void matrixWithOneMaxIntegerElement() {
        int[][] t = {{Integer.MAX_VALUE}};
        // индекс строки
        assertEquals(0, getIndexOfRowOfMaxIncreasingSequenceInMatrix(t));
        assertEquals(0, getIndexOfColumnOfMaxIncreasingSequenceInMatrix(t));
        // индексы начали и конца возрастающей последовательности
        assertEquals(0, indexOfRowOfMaxIncreasingSequenceInMatrix(t));
        assertEquals(0, indexOfColumnOfMaxIncreasingSequenceInMatrix(t));
    }

    @Test
    public void matrixWithOneMinIntegerElement() {
        int[][] t = {{Integer.MIN_VALUE}};
        // индекс строки
        assertEquals(0, getIndexOfRowOfMaxIncreasingSequenceInMatrix(t));
        assertEquals(0, getIndexOfColumnOfMaxIncreasingSequenceInMatrix(t));
        // индексы начали и конца возрастающей последовательности
        assertEquals(0, indexOfRowOfMaxIncreasingSequenceInMatrix(t));
        assertEquals(0, indexOfColumnOfMaxIncreasingSequenceInMatrix(t));
    }

    @Test
    public void matrixWithTwoPositiveElementsAndTwoIncreaseSequence() {
        int[][] t = {{1, 2}, {1, 2}};
        // индекс строки
        assertEquals(0, getIndexOfRowOfMaxIncreasingSequenceInMatrix(t));
        assertEquals(0, getIndexOfColumnOfMaxIncreasingSequenceInMatrix(t));
        // индексы начали и конца возрастающей последовательности
        assertEquals(0, indexOfRowOfMaxIncreasingSequenceInMatrix(t));
        assertEquals(1, indexOfColumnOfMaxIncreasingSequenceInMatrix(t));
    }

    @Test
    public void matrixWithTwoPositiveElementsAndOneIncreaseSequence() {
        int[][] t = {{2, 1}, {1, 2}};
        // индекс строки
        assertEquals(1, getIndexOfRowOfMaxIncreasingSequenceInMatrix(t));
        assertEquals(1, getIndexOfColumnOfMaxIncreasingSequenceInMatrix(t));
        // индексы начали и конца возрастающей последовательности
        assertEquals(0, indexOfRowOfMaxIncreasingSequenceInMatrix(t));
        assertEquals(1, indexOfColumnOfMaxIncreasingSequenceInMatrix(t));
    }

    @Test
    public void matrixWithTwoRowsWithoutIncreaseSequenceWithPositiveElements() {
        int[][] t = {{2, 1}, {100, 2}};
        // индекс строки
        assertEquals(0, getIndexOfRowOfMaxIncreasingSequenceInMatrix(t));
        assertEquals(0, getIndexOfColumnOfMaxIncreasingSequenceInMatrix(t));
        // индексы начали и конца возрастающей последовательности
        assertEquals(0, indexOfRowOfMaxIncreasingSequenceInMatrix(t));
        assertEquals(0, indexOfColumnOfMaxIncreasingSequenceInMatrix(t));
    }

    @Test
    public void matrixWithTwoRowsWithEqualsPositiveElements() {
        int[][] t = {{1, 1}, {1, 1}};
        // индекс строки
        assertEquals(0, getIndexOfRowOfMaxIncreasingSequenceInMatrix(t));
        assertEquals(0, getIndexOfColumnOfMaxIncreasingSequenceInMatrix(t));
        // индексы начали и конца возрастающей последовательности
        assertEquals(0, indexOfRowOfMaxIncreasingSequenceInMatrix(t));
        assertEquals(0, indexOfColumnOfMaxIncreasingSequenceInMatrix(t));
    }

    @Test
    public void matrixWithThreeRowsAnyElements1() {
        int[][] t = {{8, -7, 1}, {-1,-9, 7}, {-7,-9, 2}};
        // индекс строки
        assertEquals(0, getIndexOfRowOfMaxIncreasingSequenceInMatrix(t));
        assertEquals(0, getIndexOfColumnOfMaxIncreasingSequenceInMatrix(t));
        // индексы начали и конца возрастающей последовательности
        assertEquals(1, indexOfRowOfMaxIncreasingSequenceInMatrix(t));
        assertEquals(2, indexOfColumnOfMaxIncreasingSequenceInMatrix(t));
    }

    @Test
    public void matrixWithFivePositiveElementsAndTwoIncreaseSequence() {
        int[][] t = {{1, 2, 3, 0, 1}, {10, 2, 3, 10, 1}, {1, 2, 1, 0, 1}, {1, 2, 3, 0, 1}, {10, 2, 3, 0, 1}};
        // индекс строки
        assertEquals(0, getIndexOfRowOfMaxIncreasingSequenceInMatrix(t));
        assertEquals(0, getIndexOfColumnOfMaxIncreasingSequenceInMatrix(t));
        // индексы начали и конца возрастающей последовательности
        assertEquals(0, indexOfRowOfMaxIncreasingSequenceInMatrix(t));
        assertEquals(2, indexOfColumnOfMaxIncreasingSequenceInMatrix(t));
    }
}
