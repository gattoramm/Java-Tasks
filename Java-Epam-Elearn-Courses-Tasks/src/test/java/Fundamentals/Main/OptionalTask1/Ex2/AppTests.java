package Fundamentals.Main.OptionalTask1.Ex2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTests {
    @Test
    @DisplayName("Пустой массив")
    public void testEmptyMassive() {
        assertNull(App.sortedByLength(null));
    }

    @Test
    @DisplayName("Массив с одним элементом")
    public void testOneElementInMassive() {
        int[] t = new int[]{0};
        assertArrayEquals(new int[]{0}, App.sortedByLength(t));
    }

    @Test
    @DisplayName("Массив с двумя элементами одинаковой длины и противоположными знаками")
    public void testTwoElementsWithEqualsOfLengthAndDifferenceSignInMassive() {
        int[] t = new int[]{-2, 22};
        assertArrayEquals(new int[]{-2, 22}, App.sortedByLength(t));
    }

    @Test
    @DisplayName("Массив с двумя элементами - минимальное и максимальное значение int")
    public void testTwoElementMinIntAndMaxIntInMassive() {
        int[] t = new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE};
        assertArrayEquals(new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE}, App.sortedByLength(t));
    }
}
