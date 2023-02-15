package Fundamentals.Main.OptionalTask1.Ex1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class AppTests {
    @Test
    @DisplayName("Пустой массив")
    public void testEmptyMassive() {
        assertNull(App.shortLong(null));
    }

    @Test
    @DisplayName("Массив с одним элементом")
    public void testOneElementInMassive() {
        int[] t = new int[]{0};
        assertEquals(0, App.shortLong(t)[0]);
        assertEquals(0, App.shortLong(t)[1]);
    }

    @Test
    @DisplayName("Массив с двумя элементами одинаковой длины и противоположными знаками")
    public void testTwoElementsWithEqualsOfLengthAndDifferenceSignInMassive() {
        int[] t = new int[]{-2, 22};
        assertEquals(-2, App.shortLong(t)[0]);
        assertEquals(22, App.shortLong(t)[1]);
    }

    @Test
    @DisplayName("Массив с двумя элементами - минимальное и максимальное значение int")
    public void testTwoElementMinIntAndMaxIntInMassive() {
        int[] t = new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE};
        assertEquals(Integer.MAX_VALUE, App.shortLong(t)[0]);
        assertEquals(Integer.MIN_VALUE, App.shortLong(t)[1]);
    }
}
