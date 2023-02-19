package Fundamentals.Main.OptionalTask1.Ex5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTests {
    @Test
    @DisplayName("Пустой массив")
    public void testEmptyMassive() {
        Exception exception = assertThrows(NullPointerException.class, () -> {
            App.onlyEvenCountAndEqualOddAndEven(null);
        });
        assertTrue("Empty array".contains(exception.getMessage()));
    }

    @Test
    @DisplayName("Один отрицательный четный элемент")
    public void testOneNegativeEvenElementInMassive() {
        int[] t = new int[]{-2};
        assertEquals(1, App.onlyEvenCountAndEqualOddAndEven(t)[0]);
        assertEquals(0, App.onlyEvenCountAndEqualOddAndEven(t)[1]);
    }

    @Test
    @DisplayName("Один отрицательный нечетный элемент")
    public void testOneNegativeOddElementInMassive() {
        int[] t = new int[]{-1};
        assertEquals(0, App.onlyEvenCountAndEqualOddAndEven(t)[0]);
        assertEquals(0, App.onlyEvenCountAndEqualOddAndEven(t)[1]);
    }

    @Test
    @DisplayName("Один положительный четный элемент")
    public void testOnePositiveEvenElementInMassive() {
        int[] t = new int[]{2};
        assertEquals(1, App.onlyEvenCountAndEqualOddAndEven(t)[0]);
        assertEquals(0, App.onlyEvenCountAndEqualOddAndEven(t)[1]);
    }

    @Test
    @DisplayName("Один положительный нечетный элемент")
    public void testOnePositiveOddElementInMassive() {
        int[] t = new int[]{1};
        assertEquals(0, App.onlyEvenCountAndEqualOddAndEven(t)[0]);
        assertEquals(0, App.onlyEvenCountAndEqualOddAndEven(t)[1]);
    }

    @Test
    @DisplayName("Два положительных четных элементов")
    public void testTwoPositiveEvalElementsInMassive() {
        int[] t = new int[]{2, 68};
        assertEquals(2, App.onlyEvenCountAndEqualOddAndEven(t)[0]);
        assertEquals(0, App.onlyEvenCountAndEqualOddAndEven(t)[1]);
    }
}
