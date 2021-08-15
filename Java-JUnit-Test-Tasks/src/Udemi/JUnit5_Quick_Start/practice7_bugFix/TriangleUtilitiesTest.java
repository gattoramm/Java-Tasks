package Udemi.JUnit5_Quick_Start.practice7_bugFix;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TriangleUtilitiesTest {
    @Test
    public void testIsIsosceless() {
        int sideA = 3;
        int sideB = 2;
        int sideC = 3;

        assertTrue(TriangleUtilities.isIsosceless(sideA, sideB, sideC));
    }
}
