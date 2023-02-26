package Fundamentals.Main.OptionalTask1.Ex1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class AppTests {
    @Test
    @DisplayName("Пустой массив (Array)")
    public void testEmptyMassive_Array() {
        assertNull(ShortLong.shortLong_Array(null));
    }

    @Test
    @DisplayName("Пустой массив (Stream)")
    public void testEmptyMassive_Stream() {
        assertNull(ShortLong.shortLong_Stream(null));
    }

    @Test
    @DisplayName("Массив с одним элементом (Array)")
    public void testOneElementInMassive_Array() {
        int[] t = new int[]{0};
        assertEquals(0, ShortLong.shortLong_Array(t)[0]);
        assertEquals(0, ShortLong.shortLong_Array(t)[1]);
    }

    @Test
    @DisplayName("Массив с одним элементом (Stream)")
    public void testOneElementInMassive_Stream() {
        int[] t = new int[]{0};
        assertEquals(0, ShortLong.shortLong_Stream(t)[0]);
        assertEquals(0, ShortLong.shortLong_Stream(t)[1]);
    }

    @Test
    @DisplayName("Массив с двумя элементами одинаковой длины и противоположными знаками (Array)")
    public void testTwoElementsWithEqualsOfLengthAndDifferenceSignInMassive_Array() {
        int[] t = new int[]{-2, 22};
        assertEquals(-2, ShortLong.shortLong_Array(t)[0]);
        assertEquals(22, ShortLong.shortLong_Array(t)[1]);
    }

    @Test
    @DisplayName("Массив с двумя элементами одинаковой длины и противоположными знаками (Stream)")
    public void testTwoElementsWithEqualsOfLengthAndDifferenceSignInMassive_Stream() {
        int[] t = new int[]{-2, 22};
        assertEquals(-2, ShortLong.shortLong_Stream(t)[0]);
        assertEquals(22, ShortLong.shortLong_Stream(t)[1]);
    }

    @Test
    @DisplayName("Массив с двумя элементами - минимальное и максимальное значение int (Array)")
    public void testTwoElementMinIntAndMaxIntInMassive_Array() {
        int[] t = new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE};
        assertEquals(Integer.MAX_VALUE, ShortLong.shortLong_Array(t)[0]);
        assertEquals(Integer.MIN_VALUE, ShortLong.shortLong_Array(t)[1]);
    }

    @Test
    @DisplayName("Массив с двумя элементами - минимальное и максимальное значение int (Stream)")
    public void testTwoElementMinIntAndMaxIntInMassive_Stream() {
        int[] t = new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE};
        assertEquals(Integer.MAX_VALUE, ShortLong.shortLong_Stream(t)[0]);
        assertEquals(Integer.MIN_VALUE, ShortLong.shortLong_Stream(t)[1]);
    }
}
