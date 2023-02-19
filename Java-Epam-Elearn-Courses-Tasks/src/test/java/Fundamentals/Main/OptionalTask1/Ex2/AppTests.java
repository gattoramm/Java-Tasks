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

    @Test
    @DisplayName("Массив с возврастающими положительными элементами")
    public void testIncreasesPositiveElementsInMassive() {
        int[] t = new int[]{1, 22, 333, 4444, 55555, 666666, 7777777, 88888888, 999999999};
        assertArrayEquals(t, App.sortedByLength(t));
    }

    @Test
    @DisplayName("Массив с убывающими положительными элементами")
    public void testDecreasesPositiveElementsInMassive() {
        int[] t = new int[]{999999999, 88888888, 7777777, 666666, 55555, 4444, 333, 22, 1};
        assertArrayEquals(
                new int[]{1, 22, 333, 4444, 55555, 666666, 7777777, 88888888, 999999999},
                App.sortedByLength(t));
    }

    @Test
    @DisplayName("Массив с возрастающими отрицательными элементами")
    public void testIncreasesNegativeElementsInMassive() {
        int[] t = new int[]{-999999999, -88888888, -7777777, -666666, -55555, -4444, -333, -22, -1};
        assertArrayEquals(
                new int[]{-1, -22, -333, -4444, -55555, -666666, -7777777, -88888888, -999999999},
                App.sortedByLength(t));
    }

    @Test
    @DisplayName("Массив с убывающими отрицательными элементами")
    public void testDecreasesNegativeElementsInMassive() {
        int[] t = new int[]{-1, -22, -333, -4444, -55555, -666666, -7777777, -88888888, -999999999};
        assertArrayEquals(t, App.sortedByLength(t));
    }
}
