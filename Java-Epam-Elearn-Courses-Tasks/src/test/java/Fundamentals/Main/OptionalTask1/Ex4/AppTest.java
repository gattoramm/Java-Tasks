package Fundamentals.Main.OptionalTask1.Ex4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    @DisplayName("Пустой массив")
    public void testEmptyMassive() {
        Exception exception = assertThrows(NullPointerException.class, () -> {
           App.differentDigitsInNumber(null);
        });
        assertTrue("Empty array".contains(exception.getMessage()));
    }

    @Test
    @DisplayName("Массив с одним элементом")
    public void testOneElementInMassive() {
        int[] t = new int[]{0};
        assertEquals(0, App.differentDigitsInNumber(t));
    }

    @Test
    @DisplayName("Массив с одним максимальным элементом ")
    public void testOneMaxLongElementInMassive() {
        int[] t = new int[]{Integer.MAX_VALUE};
        assertEquals(Integer.MAX_VALUE, App.differentDigitsInNumber(t));
    }

    @Test
    @DisplayName("Массив с одним отрицательным элементом ")
    public void testOneNegativeElementInMassive() {
        int[] t = new int[]{-11};
        assertEquals(-11, App.differentDigitsInNumber(t));
    }

    @Test
    @DisplayName("Массив с двумя одинаковыми элементами")
    public void testTwoEqualsElementInMassive() {
        int[] t = new int[]{11, 22};
        assertEquals(11, App.differentDigitsInNumber(t));
    }

    @Test
    @DisplayName("Массив с несколькими элементами")
    public void testWithRandomElementInMassive() {
        int[] t = new int[]
                {12245324563, 857436362, 22345643535, 2214552362};
        assertEquals(857436362345L, App.differentDigitsInNumber(t));
    }
}
