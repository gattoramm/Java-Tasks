package Udemi.Hamcrest_Quick_start.part01_Introduction.practice03_Number_methods;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

public class Theory02_closeTo {
    @Test
    public void test2() {
        double x = 10.2;
        assertThat(x, closeTo(10.19, 0.01));
    }
}
