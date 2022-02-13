package Fundamentals.Main.OptionalTask2.Ex1_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindElementsOfMaxIncreasingSequenceInMatrixTest {
    private int firstIndexOfRowOfMaxIncreasingSequenceInMatrix(int[][] matrix) {
        // индекс строки
        return FindElementsOfMaxIncreasingSequenceInMatrix.findIndexesOfMaxIncreasingSequenceInMatrix(matrix)[0][0];
    }

    private int secondIndexOfRowOfMaxIncreasingSequenceInMatrix(int[][] matrix) {
        // индекс начала возрастающей последовательности
        return FindElementsOfMaxIncreasingSequenceInMatrix.findIndexesOfMaxIncreasingSequenceInMatrix(matrix)[0][1];
    }

    private int firstIndexOfColumnOfMaxIncreasingSequenceInMatrix(int[][] matrix) {
        // индекс строки
        return FindElementsOfMaxIncreasingSequenceInMatrix.findIndexesOfMaxIncreasingSequenceInMatrix(matrix)[1][0];
    }

    private int secondIndexOfColumnOfMaxIncreasingSequenceInMatrix(int[][] matrix) {
        // индекс конца возрастающей последовательности
        return FindElementsOfMaxIncreasingSequenceInMatrix.findIndexesOfMaxIncreasingSequenceInMatrix(matrix)[1][1];
    }

    @Test
    public void matrixWithEmptyMatrix() {
        int[][] t = {};
        // индекс строки
        assertEquals(-1, firstIndexOfRowOfMaxIncreasingSequenceInMatrix(t));
        assertEquals(-1, firstIndexOfColumnOfMaxIncreasingSequenceInMatrix(t));
        // индексы начали и конца возрастающей последовательности
        assertEquals(-1, secondIndexOfRowOfMaxIncreasingSequenceInMatrix(t));
        assertEquals(-1, secondIndexOfColumnOfMaxIncreasingSequenceInMatrix(t));
    }

    @Test
    public void matrixWithOnePositiveElement() {
        int[][] t = {{1}};
        // индекс строки
        assertEquals(0, firstIndexOfRowOfMaxIncreasingSequenceInMatrix(t));
        assertEquals(0, firstIndexOfColumnOfMaxIncreasingSequenceInMatrix(t));
        // индексы начали и конца возрастающей последовательности
        assertEquals(0, secondIndexOfRowOfMaxIncreasingSequenceInMatrix(t));
        assertEquals(0, secondIndexOfColumnOfMaxIncreasingSequenceInMatrix(t));
    }

    @Test
    public void matrixWithOneNegativeElement() {
        int[][] t = {{-1}};
        // индекс строки
        assertEquals(0, firstIndexOfRowOfMaxIncreasingSequenceInMatrix(t));
        assertEquals(0, firstIndexOfColumnOfMaxIncreasingSequenceInMatrix(t));
        // индексы начали и конца возрастающей последовательности
        assertEquals(0, secondIndexOfRowOfMaxIncreasingSequenceInMatrix(t));
        assertEquals(0, secondIndexOfColumnOfMaxIncreasingSequenceInMatrix(t));
    }

    @Test
    public void matrixWithOneMaxIntegerElement() {
        int[][] t = {{Integer.MAX_VALUE}};
        // индекс строки
        assertEquals(0, firstIndexOfRowOfMaxIncreasingSequenceInMatrix(t));
        assertEquals(0, firstIndexOfColumnOfMaxIncreasingSequenceInMatrix(t));
        // индексы начали и конца возрастающей последовательности
        assertEquals(0, secondIndexOfRowOfMaxIncreasingSequenceInMatrix(t));
        assertEquals(0, secondIndexOfColumnOfMaxIncreasingSequenceInMatrix(t));
    }

    @Test
    public void matrixWithOneMinIntegerElement() {
        int[][] t = {{Integer.MIN_VALUE}};
        // индекс строки
        assertEquals(0, firstIndexOfRowOfMaxIncreasingSequenceInMatrix(t));
        assertEquals(0, firstIndexOfColumnOfMaxIncreasingSequenceInMatrix(t));
        // индексы начали и конца возрастающей последовательности
        assertEquals(0, secondIndexOfRowOfMaxIncreasingSequenceInMatrix(t));
        assertEquals(0, secondIndexOfColumnOfMaxIncreasingSequenceInMatrix(t));
    }

    @Test
    public void matrixWithTwoPositiveElementsAndTwoIncreaseSequence() {
        int[][] t = {{1, 2}, {1, 2}};
        // индекс строки
        assertEquals(1, firstIndexOfRowOfMaxIncreasingSequenceInMatrix(t));
        assertEquals(1, firstIndexOfColumnOfMaxIncreasingSequenceInMatrix(t));
        // индексы начали и конца возрастающей последовательности
        assertEquals(0, secondIndexOfRowOfMaxIncreasingSequenceInMatrix(t));
        assertEquals(1, secondIndexOfColumnOfMaxIncreasingSequenceInMatrix(t));
    }

    @Test
    public void matrixWithTwoPositiveElementsAndOneIncreaseSequence() {
        int[][] t = {{2, 1}, {1, 2}};
        // индекс строки
        assertEquals(1, firstIndexOfRowOfMaxIncreasingSequenceInMatrix(t));
        assertEquals(1, firstIndexOfColumnOfMaxIncreasingSequenceInMatrix(t));
        // индексы начали и конца возрастающей последовательности
        assertEquals(0, secondIndexOfRowOfMaxIncreasingSequenceInMatrix(t));
        assertEquals(1, secondIndexOfColumnOfMaxIncreasingSequenceInMatrix(t));
    }

    @Test
    public void matrixWithTwoRowsWithoutIncreaseSequenceWithPositiveElements() {
        int[][] t = {{2, 1}, {100, 2}};
        // индекс строки
        assertEquals(1, firstIndexOfRowOfMaxIncreasingSequenceInMatrix(t));
        assertEquals(1, firstIndexOfColumnOfMaxIncreasingSequenceInMatrix(t));
        // индексы начали и конца возрастающей последовательности
        assertEquals(0, secondIndexOfRowOfMaxIncreasingSequenceInMatrix(t));
        assertEquals(0, secondIndexOfColumnOfMaxIncreasingSequenceInMatrix(t));
    }

    @Test
    public void matrixWithTwoRowsWithEqualsPositiveElements() {
        int[][] t = {{1, 1}, {1, 1}};
        // индекс строки
        assertEquals(1, firstIndexOfRowOfMaxIncreasingSequenceInMatrix(t));
        assertEquals(1, firstIndexOfColumnOfMaxIncreasingSequenceInMatrix(t));
        // индексы начали и конца возрастающей последовательности
        assertEquals(0, secondIndexOfRowOfMaxIncreasingSequenceInMatrix(t));
        assertEquals(0, secondIndexOfColumnOfMaxIncreasingSequenceInMatrix(t));
    }

    @Test
    public void matrixWithThreeRowsAnyElements1() {
        int[][] t = {{8, -7, 1}, {-1,-9, 7}, {-7,-9, 2}};
        // индекс строки
        assertEquals(2, firstIndexOfRowOfMaxIncreasingSequenceInMatrix(t));
        assertEquals(2, firstIndexOfColumnOfMaxIncreasingSequenceInMatrix(t));
        // индексы начали и конца возрастающей последовательности
        assertEquals(1, secondIndexOfRowOfMaxIncreasingSequenceInMatrix(t));
        assertEquals(2, secondIndexOfColumnOfMaxIncreasingSequenceInMatrix(t));
    }

    @Test
    public void matrixWithFivePositiveElementsAndTwoIncreaseSequence() {
        int[][] t = {{1, 2, 3, 0, 1}, {10, 2, 3, 10, 1}, {1, 2, 1, 0, 1}, {1, 1, 3, 0, 1}, {10, 2, 3, 0, 1}};
        // индекс строки
        assertEquals(1, firstIndexOfRowOfMaxIncreasingSequenceInMatrix(t));
        assertEquals(1, firstIndexOfColumnOfMaxIncreasingSequenceInMatrix(t));
        // индексы начали и конца возрастающей последовательности
        assertEquals(1, secondIndexOfRowOfMaxIncreasingSequenceInMatrix(t));
        assertEquals(3, secondIndexOfColumnOfMaxIncreasingSequenceInMatrix(t));
    }
}
