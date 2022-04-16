package Fundamentals.Main.OptionalTask2.Ex1_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindIndexesOfSortedSequenceTest {
    private int[] getSortRowsOfMatrixInAsc(int[] sequence) {
        return SortRowsOfMatrixInAsc.findIndexesOfSortedSequence(sequence);
    }

    @Test
    public void sequenceWithFiveIncreaseElements() {
        int[] t = {1, 2, 3, 4};
        assertArrayEquals(new int[]{0, 1, 2, 3}, getSortRowsOfMatrixInAsc(t));
    }

    @Test
    public void sequenceWithFiveDecreaseElements() {
        int[] t = {4, 3, 2, 1};
        assertArrayEquals(new int[]{3, 2, 1, 0}, getSortRowsOfMatrixInAsc(t));
    }
}
