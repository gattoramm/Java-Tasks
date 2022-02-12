package Fundamentals.Main.OptionalTask2.Ex1_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMaxElementsOfIncreasingSequenceInRowOfMatrixTest {
    private final FindMaxElementsOfIncreasingSequenceInRowOfMatrix seq = new FindMaxElementsOfIncreasingSequenceInRowOfMatrix();

    @Test
    public void sequenceWithTwoPositiveIncreasingElements() {
        assertEquals(0, seq.findIndexesOfMaxIncreasingSequenceInRowOfMatrix(new int[]{1, 2, 0})[0]);
        assertEquals(1, seq.findIndexesOfMaxIncreasingSequenceInRowOfMatrix(new int[]{1, 2, 0})[1]);
    }

    @Test
    public void sequenceWithOnePositiveIncreasingElements() {
        assertEquals(0, seq.findIndexesOfMaxIncreasingSequenceInRowOfMatrix(new int[]{1})[0]);
        assertEquals(0, seq.findIndexesOfMaxIncreasingSequenceInRowOfMatrix(new int[]{1})[1]);
    }

    @Test
    public void sequenceWithoutElements() {
        assertEquals(0, seq.findIndexesOfMaxIncreasingSequenceInRowOfMatrix(new int[]{})[0]);
        assertEquals(0, seq.findIndexesOfMaxIncreasingSequenceInRowOfMatrix(new int[]{})[1]);
    }

    @Test
    public void sequenceWithFivePositiveEqualsElements() {
        assertEquals(0, seq.findIndexesOfMaxIncreasingSequenceInRowOfMatrix(new int[]{1, 1, 1, 1, 1})[0]);
        assertEquals(0, seq.findIndexesOfMaxIncreasingSequenceInRowOfMatrix(new int[]{1, 1, 1, 1, 1})[1]);
    }

    @Test
    public void sequenceWithFivePositiveIncreasingElements() {
        assertEquals(0, seq.findIndexesOfMaxIncreasingSequenceInRowOfMatrix(new int[]{1, 2, 3, 4, 5})[0]);
        assertEquals(4, seq.findIndexesOfMaxIncreasingSequenceInRowOfMatrix(new int[]{1, 2, 3, 4, 5})[1]);
    }

    @Test
    public void sequenceWithOneNegativeElement() {
        assertEquals(0, seq.findIndexesOfMaxIncreasingSequenceInRowOfMatrix(new int[]{-100})[0]);
        assertEquals(0, seq.findIndexesOfMaxIncreasingSequenceInRowOfMatrix(new int[]{-100})[1]);
    }

    @Test
    public void sequenceWithThreeNegativeIncreasingElements() {
        assertEquals(0, seq.findIndexesOfMaxIncreasingSequenceInRowOfMatrix(new int[]{-100, -2, -1})[0]);
        assertEquals(2, seq.findIndexesOfMaxIncreasingSequenceInRowOfMatrix(new int[]{-100, -2, -1})[1]);
    }

    @Test
    public void sequenceWithThreeNegativeAndPositiveIncreasingElements() {
        assertEquals(0, seq.findIndexesOfMaxIncreasingSequenceInRowOfMatrix(new int[]{-100, 0, 1000})[0]);
        assertEquals(2, seq.findIndexesOfMaxIncreasingSequenceInRowOfMatrix(new int[]{-100, 0, 1000})[1]);
    }

    @Test
    public void sequenceWithMaxIntValue() {
        assertEquals(0, seq.findIndexesOfMaxIncreasingSequenceInRowOfMatrix(new int[]{Integer.MAX_VALUE})[0]);
        assertEquals(0, seq.findIndexesOfMaxIncreasingSequenceInRowOfMatrix(new int[]{Integer.MAX_VALUE})[1]);
    }

    @Test
    public void sequenceWithMinIntValue() {
        assertEquals(0, seq.findIndexesOfMaxIncreasingSequenceInRowOfMatrix(new int[]{Integer.MIN_VALUE})[0]);
        assertEquals(0, seq.findIndexesOfMaxIncreasingSequenceInRowOfMatrix(new int[]{Integer.MIN_VALUE})[1]);
    }

    @Test
    public void sequenceWithMinAndMaxIntValue() {
        assertEquals(0, seq.findIndexesOfMaxIncreasingSequenceInRowOfMatrix(new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE})[0]);
        assertEquals(1, seq.findIndexesOfMaxIncreasingSequenceInRowOfMatrix(new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE})[1]);
    }
}
