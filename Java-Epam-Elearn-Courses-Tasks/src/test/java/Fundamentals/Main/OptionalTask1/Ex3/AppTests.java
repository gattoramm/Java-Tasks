package Fundamentals.Main.OptionalTask1.Ex3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class AppTests {
    @Test
    @DisplayName("Пустой массив")
    public void testEmptyMassive() {
        assertNull(App.valuesMoreThatMedian(null));
    }

    @Test
    @DisplayName("Массив с одним элементом")
    public void testOneElementInMassive() {
        int[] t = new int[]{0};
        assertArrayEquals(new int[]{0}, App.valuesMoreThatMedian(t));
    }

    @Test
    @DisplayName("Массив с двумя элементами одинаковой длины и противоположными знаками")
    public void testTwoElementsWithEqualsOfLengthAndDifferenceSignInMassive() {
        int[] t = new int[]{-2, 22};
        assertArrayEquals(new int[]{-2, 22}, App.valuesMoreThatMedian(t));
    }

    @Test
    @DisplayName("Массив с разными числами 1")
    public void testWithRandom1ValuesInMassive() {
        int[] t = new int[]{-20, 45, 100, 15, -50, 1, 500, -600};
        assertArrayEquals(new int[]{45, 15, 1}, App.valuesMoreThatMedian(t));
    }

    @Test
    @DisplayName("Массив с разными числами 2")
    public void testWithRandom2ValuesInMassive() {
        int[] t = new int[]{-20, 45, 100, 15, -50, 1, 500, -600, 80000, 100000};
        assertArrayEquals(new int[]{-20, 45, 100, 15, -50, 1, 500}, App.valuesMoreThatMedian(t));
    }
}
