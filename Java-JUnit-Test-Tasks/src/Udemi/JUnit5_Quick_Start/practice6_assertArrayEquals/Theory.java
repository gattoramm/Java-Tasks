package Udemi.JUnit5_Quick_Start.practice6_assertArrayEquals;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Theory {
    @Test
    public void myTest() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int[] array3 = {1, 7, 7};
        int[] array4 = {1, 2, 3, 4};

        assertArrayEquals(array1, array2);
    }
}
