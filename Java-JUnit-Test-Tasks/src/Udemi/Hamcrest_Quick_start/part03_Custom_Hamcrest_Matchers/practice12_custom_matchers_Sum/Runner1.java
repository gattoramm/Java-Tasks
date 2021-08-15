package Udemi.Hamcrest_Quick_start.part03_Custom_Hamcrest_Matchers.practice12_custom_matchers_Sum;

import org.junit.jupiter.api.Test;

import static Udemi.Hamcrest_Quick_start.part03_Custom_Hamcrest_Matchers.practice12_custom_matchers_Sum.Sum.sum;
import static org.hamcrest.MatcherAssert.assertThat;

public class Runner1 {
    @Test
    public void test1() {
        Integer lhs = 6;
        assertThat(lhs, sum(1, 2, 3));
    }
}
