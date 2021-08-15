package Udemi.JUnit5_Quick_Start.practice3_bugFix_practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleUtilitiesTest {
    @Test
    public void testGetPerimeter() {
        int height = 4;
        int width = 6;
        int expected = 20;
        int actual = RectangleUtilities.getPerimeter(height, width);

        assertEquals(expected, actual);
    }
}
