package Fundamentals.Main.OptionalTask1.Ex1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTests {
    @Test
    @DisplayName("Пустой массив")
    public void testEmptyMassive() {
        int[] t = null;
        assertEquals(-1, App.minMax(t)[0]);
        assertEquals(-1, App.minMax(t)[1]);
    }

    @Test
    @DisplayName("Массив с одним элементом")
    public void testOneElementMassive() {
        int[] t = new int[]{0};
        assertEquals(1, App.minMax(t)[0]);
        assertEquals(1, App.minMax(t)[1]);
    }

    @Test
    @DisplayName("Массив с двумя элементами одинаковой длины и противоположными знаками")
    public void testTwoElementMassiveOfEqualLengthDifferenceSign() {
        int[] t = new int[]{-2, 22};
        assertEquals(2, App.minMax(t)[0]);
        assertEquals(2, App.minMax(t)[1]);
    }
}
