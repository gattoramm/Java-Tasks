package Udemi.JUnit5_Quick_Start.practice4_future_request_tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TriangleUtilitiesTest {
    @Test
    public void testIsEquilateral() {
        assertFalse(TriangleUtilities.isEquilateral(2, 3, 4));
        assertFalse(TriangleUtilities.isEquilateral(2, 3, 3));
        assertTrue(TriangleUtilities.isEquilateral(4, 4, 4));
    }
}
