package Udemi.JUnit5_Quick_Start.practice6_assertArrayEquals;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class GraphicsUtilitiesTest {

    @Test
    public void testDim() {
        int[] pixel = {1, 2, 3};
        GraphicsUtilities.dim(pixel);
        int[] expected = {0, 1, 2};
        assertArrayEquals(expected, pixel);
        GraphicsUtilities.dim(pixel);
        expected = new int[]{0, 0, 1};
        assertArrayEquals(expected, pixel);
    }

    @Test
    public void testBrighten() {
        int[] pixel = {0, 254, 254};
        GraphicsUtilities.brighten(pixel);
        int[] expected = {1, 255, 255};
        assertArrayEquals(expected, pixel);
        GraphicsUtilities.brighten(pixel);
        expected = new int[]{2, 255, 255};
        assertArrayEquals(expected, pixel);
    }
}
