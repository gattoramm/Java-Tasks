package Fundamentals.Main.OptionalTask1.Ex3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class AppTests {
    @Test
    @DisplayName("Пустой массив (Array)")
    public void testEmptyArray_Array() {
        assertNull(Median.valuesMoreThatMedianWithArray(null));
    }

    @Test
    @DisplayName("Пустой массив (ArrayList)")
    public void testEmptyArray_ArrayList() {
        assertNull(Median.valuesMoreThatMedianWithArrayList(null));
    }

    @Test
    @DisplayName("Пустой массив (Stream)")
    public void testEmptyArray_Stream() {
        assertNull(Median.valuesMoreThatMedianWithStream(null));
    }

    @Test
    @DisplayName("Массив с одним элементом (Array)")
    public void testOneElementInMassive_Array() {
        int[] t = new int[]{0};
        assertArrayEquals(new int[]{0}, Median.valuesMoreThatMedianWithArray(t));
    }

    @Test
    @DisplayName("Массив с одним элементом (ArrayList)")
    public void testOneElementInMassive_ArrayList() {
        int[] t = new int[]{0};
        assertArrayEquals(new int[]{0}, Median.valuesMoreThatMedianWithArrayList(t));
    }

    @Test
    @DisplayName("Массив с одним элементом (Stream)")
    public void testOneElementInMassive_Stream() {
        int[] t = new int[]{0};
        assertArrayEquals(new int[]{0}, Median.valuesMoreThatMedianWithStream(t));
    }

    @Test
    @DisplayName("Массив с двумя элементами одинаковой длины и противоположными знаками (Array)")
    public void testTwoElementsWithEqualsOfLengthAndDifferenceSignInMassive_Array() {
        int[] t = new int[]{-2, 22};
        assertArrayEquals(new int[]{-2, 22}, Median.valuesMoreThatMedianWithArray(t));
    }

    @Test
    @DisplayName("Массив с двумя элементами одинаковой длины и противоположными знаками (ArrayList)")
    public void testTwoElementsWithEqualsOfLengthAndDifferenceSignInMassive_ArrayList() {
        int[] t = new int[]{-2, 22};
        assertArrayEquals(new int[]{-2, 22}, Median.valuesMoreThatMedianWithArrayList(t));
    }

    @Test
    @DisplayName("Массив с двумя элементами одинаковой длины и противоположными знаками (Stream)")
    public void testTwoElementsWithEqualsOfLengthAndDifferenceSignInMassive_Stream() {
        int[] t = new int[]{-2, 22};
        assertArrayEquals(new int[]{-2, 22}, Median.valuesMoreThatMedianWithStream(t));
    }

    @Test
    @DisplayName("Массив с разными числами 1 (Array)")
    public void testWithRandom1ValuesInMassive_Array() {
        int[] t = new int[]{-20, 45, 100, 15, -50, 1, 500, -600};
        assertArrayEquals(new int[]{45, 15, 1}, Median.valuesMoreThatMedianWithArray(t));
    }

    @Test
    @DisplayName("Массив с разными числами 1 (ArrayList)")
    public void testWithRandom1ValuesInMassive_ArrayList() {
        int[] t = new int[]{-20, 45, 100, 15, -50, 1, 500, -600};
        assertArrayEquals(new int[]{45, 15, 1}, Median.valuesMoreThatMedianWithArrayList(t));
    }

    @Test
    @DisplayName("Массив с разными числами 1 (Stream)")
    public void testWithRandom1ValuesInMassive_Stream() {
        int[] t = new int[]{-20, 45, 100, 15, -50, 1, 500, -600};
        assertArrayEquals(new int[]{45, 15, 1}, Median.valuesMoreThatMedianWithStream(t));
    }

    @Test
    @DisplayName("Массив с разными числами 2 (Array)")
    public void testWithRandom2ValuesInMassive_Array() {
        int[] t = new int[]{-20, 45, 100, 15, -50, 1, 500, -600, 80000, 100000};
        assertArrayEquals(new int[]{-20, 45, 100, 15, -50, 1, 500}, Median.valuesMoreThatMedianWithArray(t));
    }

    @Test
    @DisplayName("Массив с разными числами 2 (ArrayList)")
    public void testWithRandom2ValuesInMassive_ArrayList() {
        int[] t = new int[]{-20, 45, 100, 15, -50, 1, 500, -600, 80000, 100000};
        assertArrayEquals(new int[]{-20, 45, 100, 15, -50, 1, 500}, Median.valuesMoreThatMedianWithArrayList(t));
    }

    @Test
    @DisplayName("Массив с разными числами 2 (Stream)")
    public void testWithRandom2ValuesInMassive_Stream() {
        int[] t = new int[]{-20, 45, 100, 15, -50, 1, 500, -600, 80000, 100000};
        assertArrayEquals(new int[]{-20, 45, 100, 15, -50, 1, 500}, Median.valuesMoreThatMedianWithStream(t));
    }
}
