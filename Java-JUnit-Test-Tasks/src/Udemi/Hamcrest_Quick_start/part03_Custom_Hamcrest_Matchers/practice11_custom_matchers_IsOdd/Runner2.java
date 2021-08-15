package Udemi.Hamcrest_Quick_start.part03_Custom_Hamcrest_Matchers.practice11_custom_matchers_IsOdd;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class Runner2 {
    @Test
    public void test1() {
        Integer lhs = 5;
        assertThat(lhs, IsOdd.isOdd());
    }
}
