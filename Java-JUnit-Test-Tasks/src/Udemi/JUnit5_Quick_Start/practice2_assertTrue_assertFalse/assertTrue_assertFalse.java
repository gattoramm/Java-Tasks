package Udemi.JUnit5_Quick_Start.practice2_assertTrue_assertFalse;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class assertTrue_assertFalse {
    int x = 2;
    int y = 2;
    int z = 3;

    boolean a = (x == y);
    boolean b = (y == z);

    @Test
    public void test1() {
        assertTrue(a);
    }

    @Test
    public void test2() {
        assertFalse(b);
    }
}
