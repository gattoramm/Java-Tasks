package Udemi.Hamcrest_Quick_start.part03_Custom_Hamcrest_Matchers.practice12_custom_matchers_Sum;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class Runner2 {
    @Test
    public void test1() {
        Integer lhs = 6;
        assertThat(lhs, Sum.sum(1, 2, 3));
    }
}
