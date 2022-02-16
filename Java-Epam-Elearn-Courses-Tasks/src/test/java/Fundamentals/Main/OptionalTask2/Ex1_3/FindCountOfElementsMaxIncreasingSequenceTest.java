package Fundamentals.Main.OptionalTask2.Ex1_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindCountOfElementsMaxIncreasingSequenceTest {
    private int getCountsElementsMaxIncreasingSequence(int[] sequence) {
        return FindElementsOfMaxIncreasingSequenceInMatrix.findCountsOfElementsMaxIncreasingSequence(sequence);
    }

    @Test
    public void sequenceWithoutElements() {
        int[] t = {};
        assertEquals(0, getCountsElementsMaxIncreasingSequence(t));
    }

    @Test
    public void sequenceWithOnePositiveElement() {
        int[] t = {1};
        assertEquals(1, getCountsElementsMaxIncreasingSequence(t));
    }

    @Test
    public void sequenceWithOneNegativeElement() {
        int[] t = {-10000};
        assertEquals(1, getCountsElementsMaxIncreasingSequence(t));
    }

    @Test
    public void sequenceWithOneMaxIntegerElement() {
        int[] t = {Integer.MAX_VALUE};
        assertEquals(1, getCountsElementsMaxIncreasingSequence(t));
    }

    @Test
    public void sequenceWithOneMinIntegerElement() {
        int[] t = {Integer.MIN_VALUE};
        assertEquals(1, getCountsElementsMaxIncreasingSequence(t));
    }

    @Test
    public void sequenceWithTwoIncreasePositiveElement() {
        int[] t = {1, 1000};
        assertEquals(2, getCountsElementsMaxIncreasingSequence(t));
    }

    @Test
    public void sequenceWithTwoIncreaseNegativeElement() {
        int[] t = {-45641, -1000};
        assertEquals(2, getCountsElementsMaxIncreasingSequence(t));
    }

    @Test
    public void sequenceWithTwoEqualsPositiveElement() {
        int[] t = {45641, 45641};
        assertEquals(1, getCountsElementsMaxIncreasingSequence(t));
    }

    @Test
    public void sequenceWithTwoEqualsNegativeElement() {
        int[] t = {-1000, -1000};
        assertEquals(1, getCountsElementsMaxIncreasingSequence(t));
    }

    @Test
    public void sequenceWithTwoEqualsIncreaseSubsequence() {
        int[] t = {-45641, 45641, 45642, 1, 2, 3};
        assertEquals(3, getCountsElementsMaxIncreasingSequence(t));
    }

    @Test
    public void sequenceWithTwoIncreaseSubsequence() {
        int[] t = {-45641, 45641, 45642, 1, 2, 3, 4};
        assertEquals(4, getCountsElementsMaxIncreasingSequence(t));
    }

    @Test
    public void sequenceWithThreeIncreaseSubsequence() {
        int[] t = {Integer.MIN_VALUE, -45641, 45641, 1, 2, 3, 4, 5, 1, 100, 1000, 10000};
        assertEquals(5, getCountsElementsMaxIncreasingSequence(t));
    }
}