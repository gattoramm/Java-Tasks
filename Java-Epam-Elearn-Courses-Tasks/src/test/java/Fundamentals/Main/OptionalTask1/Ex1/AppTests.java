package Fundamentals.Main.OptionalTask1.Ex1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTests {
    App p = new App();

    @Test
    @DisplayName("Пустой массив")
    public void testEmptyMassive() {
        int[] t = null;
        assertEquals(-1, p.minMax(t));
    }
}
