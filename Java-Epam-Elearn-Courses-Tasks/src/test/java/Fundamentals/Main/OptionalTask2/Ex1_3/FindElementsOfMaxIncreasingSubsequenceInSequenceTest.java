package Fundamentals.Main.OptionalTask2.Ex1_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindElementsOfMaxIncreasingSubsequenceInSequenceTest {
    private int returnFirstIndexOfMaxIncreasingSequenceInRowOfMatrix(int[] sequence) {
        // индекс начала возрастающей последовательности
        return FindElementsOfMaxIncreasingSequenceInMatrix.findIndexesOfMaxIncreasingSequenceInRowOfMatrix(sequence)[0];
    }

    private int returnSecondIndexOfMaxIncreasingSequenceInRowOfMatrix(int[] sequence) {
        // индекс конца возрастающей последовательности
        return FindElementsOfMaxIncreasingSequenceInMatrix.findIndexesOfMaxIncreasingSequenceInRowOfMatrix(sequence)[1];
    }

    @Test
    public void sequenceWithTwoPositiveIncreasingElements() {
        int[] t = {1, 2, 0};
        assertEquals(0, returnFirstIndexOfMaxIncreasingSequenceInRowOfMatrix(t));
        assertEquals(1, returnSecondIndexOfMaxIncreasingSequenceInRowOfMatrix(t));
    }

    @Test
    public void sequenceWithTwoPositiveIncreasingSequences() {
        int[] t = {1, 2, 0, 5, 6};
        assertEquals(2, returnFirstIndexOfMaxIncreasingSequenceInRowOfMatrix(t));
        assertEquals(4, returnSecondIndexOfMaxIncreasingSequenceInRowOfMatrix(t));
    }

    @Test
    public void sequenceWithTwoEqualsPositiveIncreasingSequences() {
        int[] t = {1, 2, 10, 15, 1, 2, 10, 15};
        assertEquals(4, returnFirstIndexOfMaxIncreasingSequenceInRowOfMatrix(t));
        assertEquals(7, returnSecondIndexOfMaxIncreasingSequenceInRowOfMatrix(t));
    }

    @Test
    public void sequenceWithOnePositiveIncreasingElements() {
        int[] t = {1};
        assertEquals(0, returnFirstIndexOfMaxIncreasingSequenceInRowOfMatrix(t));
        assertEquals(0, returnSecondIndexOfMaxIncreasingSequenceInRowOfMatrix(t));
    }

    @Test
    public void sequenceWithoutElements() {
        int[] t = {};
        assertEquals(-1, returnFirstIndexOfMaxIncreasingSequenceInRowOfMatrix(t));
        assertEquals(-1, returnSecondIndexOfMaxIncreasingSequenceInRowOfMatrix(t));
    }

    @Test
    public void sequenceWithFivePositiveEqualsElements() {
        int[] t = {1, 1, 1, 1, 1};
        assertEquals(0, returnFirstIndexOfMaxIncreasingSequenceInRowOfMatrix(t));
        assertEquals(0, returnSecondIndexOfMaxIncreasingSequenceInRowOfMatrix(t));
    }

    @Test
    public void sequenceWithFivePositiveIncreasingElements() {
        int[] t = {1, 2, 3, 4, 5};
        assertEquals(0, returnFirstIndexOfMaxIncreasingSequenceInRowOfMatrix(t));
        assertEquals(4, returnSecondIndexOfMaxIncreasingSequenceInRowOfMatrix(t));
    }

    @Test
    public void sequenceWithOneNegativeElement() {
        int[] t = {-100};
        assertEquals(0, returnFirstIndexOfMaxIncreasingSequenceInRowOfMatrix(t));
        assertEquals(0, returnSecondIndexOfMaxIncreasingSequenceInRowOfMatrix(t));
    }

    @Test
    public void sequenceWithThreeNegativeIncreasingElements() {
        int[] t = {-100, -2, -1};
        assertEquals(0, returnFirstIndexOfMaxIncreasingSequenceInRowOfMatrix(t));
        assertEquals(2, returnSecondIndexOfMaxIncreasingSequenceInRowOfMatrix(t));
    }

    @Test
    public void sequenceWithThreeNegativeAndPositiveIncreasingElements() {
        int[] t = {-100, 0, 1000};
        assertEquals(0, returnFirstIndexOfMaxIncreasingSequenceInRowOfMatrix(t));
        assertEquals(2, returnSecondIndexOfMaxIncreasingSequenceInRowOfMatrix(t));
    }

    @Test
    public void sequenceWithFiveNegativeAndPositiveIncreasingElements() {
        int[] t = {-32, -10, -10, 24, 40};
        assertEquals(2, returnFirstIndexOfMaxIncreasingSequenceInRowOfMatrix(t));
        assertEquals(4, returnSecondIndexOfMaxIncreasingSequenceInRowOfMatrix(t));
    }

    @Test
    public void sequenceWithMaxIntValue() {
        int[] t = {Integer.MAX_VALUE};
        assertEquals(0, returnFirstIndexOfMaxIncreasingSequenceInRowOfMatrix(t));
        assertEquals(0, returnSecondIndexOfMaxIncreasingSequenceInRowOfMatrix(t));
    }

    @Test
    public void sequenceWithMinIntValue() {
        int[] t = {Integer.MIN_VALUE};
        assertEquals(0, returnFirstIndexOfMaxIncreasingSequenceInRowOfMatrix(t));
        assertEquals(0, returnSecondIndexOfMaxIncreasingSequenceInRowOfMatrix(t));
    }

    @Test
    public void sequenceWithMinAndMaxIntValue() {
        int[] t = {Integer.MIN_VALUE, Integer.MAX_VALUE};
        assertEquals(0, returnFirstIndexOfMaxIncreasingSequenceInRowOfMatrix(t));
        assertEquals(1, returnSecondIndexOfMaxIncreasingSequenceInRowOfMatrix(t));
    }

    @Test
    public void sequenceFromMinByteValueToMaxByteValue() {
        int len = Byte.MAX_VALUE - Byte.MIN_VALUE + 1;
        int[] t = new int[len];
        t[0] = Byte.MIN_VALUE;

        for (int i = 1; i < len; i++) {
            t[i] = t[i-1]+1;
        }
        assertEquals(0, returnFirstIndexOfMaxIncreasingSequenceInRowOfMatrix(t));
        assertEquals(len-1, returnSecondIndexOfMaxIncreasingSequenceInRowOfMatrix(t));
    }
}
