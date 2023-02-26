package Fundamentals.Main.OptionalTask1.Ex2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTests {
    @Test
    @DisplayName("Пустой массив (Array)")
    public void testEmptyMassive_Array() {
        assertNull(Sorted.sortedByLength_Array(null));
    }

//    @Test
//    @DisplayName("Пустой массив (Stream)")
//    public void testEmptyMassive_Stream() {
//        assertNull(Sorted.sortedByLength_Stream(null));
//    }

    @Test
    @DisplayName("Массив с одним элементом (Array)")
    public void testOneElementInMassive_Array() {
        int[] t = new int[]{0};
        assertArrayEquals(new int[]{0}, Sorted.sortedByLength_Array(t));
    }

//    @Test
//    @DisplayName("Массив с одним элементом (Stream)")
//    public void testOneElementInMassive_Stream() {
//        int[] t = new int[]{0};
//        assertArrayEquals(new int[]{0}, Sorted.sortedByLength_Stream(t));
//    }

    @Test
    @DisplayName("Массив с двумя элементами одинаковой длины и противоположными знаками (Array)")
    public void testTwoElementsWithEqualsOfLengthAndDifferenceSignInMassive_Array() {
        int[] t = new int[]{-2, 22};
        assertArrayEquals(new int[]{-2, 22}, Sorted.sortedByLength_Array(t));
    }

//    @Test
//    @DisplayName("Массив с двумя элементами одинаковой длины и противоположными знаками (Stream)")
//    public void testTwoElementsWithEqualsOfLengthAndDifferenceSignInMassive_Stream() {
//        int[] t = new int[]{-2, 22};
//        assertArrayEquals(new int[]{-2, 22}, Sorted.sortedByLength_Stream(t));
//    }

    @Test
    @DisplayName("Массив с двумя элементами - минимальное и максимальное значение int (Array)")
    public void testTwoElementMinIntAndMaxIntInMassive_Array() {
        int[] t = new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE};
        assertArrayEquals(new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE}, Sorted.sortedByLength_Array(t));
    }

//    @Test
//    @DisplayName("Массив с двумя элементами - минимальное и максимальное значение int (Stream)")
//    public void testTwoElementMinIntAndMaxIntInMassive_Stream() {
//        int[] t = new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE};
//        assertArrayEquals(new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE}, Sorted.sortedByLength_Stream(t));
//    }

    @Test
    @DisplayName("Массив с возврастающими положительными элементами (Array)")
    public void testIncreasesPositiveElementsInMassive_Array() {
        int[] t = new int[]{1, 22, 333, 4444, 55555, 666666, 7777777, 88888888, 999999999};
        assertArrayEquals(t, Sorted.sortedByLength_Array(t));
    }

//    @Test
//    @DisplayName("Массив с возврастающими положительными элементами (Stream)")
//    public void testIncreasesPositiveElementsInMassive_Stream() {
//        int[] t = new int[]{1, 22, 333, 4444, 55555, 666666, 7777777, 88888888, 999999999};
//        assertArrayEquals(t, Sorted.sortedByLength_Stream(t));
//    }

    @Test
    @DisplayName("Массив с убывающими положительными элементами (Array)")
    public void testDecreasesPositiveElementsInMassive_Array() {
        int[] t = new int[]{999999999, 88888888, 7777777, 666666, 55555, 4444, 333, 22, 1};
        assertArrayEquals(
                new int[]{1, 22, 333, 4444, 55555, 666666, 7777777, 88888888, 999999999},
                Sorted.sortedByLength_Array(t));
    }

//    @Test
//    @DisplayName("Массив с убывающими положительными элементами (Stream)")
//    public void testDecreasesPositiveElementsInMassive_Stream() {
//        int[] t = new int[]{999999999, 88888888, 7777777, 666666, 55555, 4444, 333, 22, 1};
//        assertArrayEquals(
//                new int[]{1, 22, 333, 4444, 55555, 666666, 7777777, 88888888, 999999999},
//                Sorted.sortedByLength_Stream(t));
//    }

    @Test
    @DisplayName("Массив с возрастающими отрицательными элементами (Array)")
    public void testIncreasesNegativeElementsInMassive_Array() {
        int[] t = new int[]{-999999999, -88888888, -7777777, -666666, -55555, -4444, -333, -22, -1};
        assertArrayEquals(
                new int[]{-1, -22, -333, -4444, -55555, -666666, -7777777, -88888888, -999999999},
                Sorted.sortedByLength_Array(t));
    }

//    @Test
//    @DisplayName("Массив с возрастающими отрицательными элементами (Stream)")
//    public void testIncreasesNegativeElementsInMassive_Stream() {
//        int[] t = new int[]{-999999999, -88888888, -7777777, -666666, -55555, -4444, -333, -22, -1};
//        assertArrayEquals(
//                new int[]{-1, -22, -333, -4444, -55555, -666666, -7777777, -88888888, -999999999},
//                Sorted.sortedByLength_Stream(t));
//    }

    @Test
    @DisplayName("Массив с убывающими отрицательными элементами (Array)")
    public void testDecreasesNegativeElementsInMassive_Array() {
        int[] t = new int[]{-1, -22, -333, -4444, -55555, -666666, -7777777, -88888888, -999999999};
        assertArrayEquals(t, Sorted.sortedByLength_Array(t));
    }

//    @Test
//    @DisplayName("Массив с убывающими отрицательными элементами (Stream)")
//    public void testDecreasesNegativeElementsInMassive_Stream() {
//        int[] t = new int[]{-1, -22, -333, -4444, -55555, -666666, -7777777, -88888888, -999999999};
//        assertArrayEquals(t, Sorted.sortedByLength_Stream(t));
//    }
}
