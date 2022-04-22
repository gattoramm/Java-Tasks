package Fundamentals.Main.OptionalTask2.Ex1_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindIndexesOfSortedSequenceTest {
    private int[] getIndexesOfSortedSequence(int[] sequence) {
        return SortRowsOfMatrixInAsc.findIndexesOfSortedSequence(sequence);
    }

    @Test
    public void sequenceWithFiveIncreaseElements() {
        int[] t = {1, 2, 3, 4, 999};
        assertArrayEquals(new int[]{0, 1, 2, 3, 4}, getIndexesOfSortedSequence(t));
    }

    @Test
    public void sequenceWithFiveDecreaseElements() {
        int[] t = {4, 3, 2, 1, 7};
        assertArrayEquals(new int[]{3, 2, 1, 0, 4}, getIndexesOfSortedSequence(t));
    }

    @Test
    public void sequenceWithFiveEqualsElements() {
        int[] t = {-345246, -345246, -345246, -345246, -345246};
        assertArrayEquals(new int[]{0, 1, 2, 3, 4}, getIndexesOfSortedSequence(t));
    }

    @Test
    public void sequenceWithThreeAnyElements() {
        int[] t = {22, 22, -13};
        assertArrayEquals(new int[]{2, 0, 1}, getIndexesOfSortedSequence(t));
    }

    @Test
    public void sequenceWithSevenAnyElements() {
        int[] t = {-345246, 345246, -128, -4, -Integer.MIN_VALUE, Integer.MAX_VALUE, (int)Byte.MIN_VALUE};
        assertArrayEquals(new int[]{4, 0, 2, 6, 3, 1, 5}, getIndexesOfSortedSequence(t));
    }
}
