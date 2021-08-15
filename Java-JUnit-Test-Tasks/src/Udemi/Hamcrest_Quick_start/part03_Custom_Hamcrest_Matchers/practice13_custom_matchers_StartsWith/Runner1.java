package Udemi.Hamcrest_Quick_start.part03_Custom_Hamcrest_Matchers.practice13_custom_matchers_StartsWith;

import org.junit.jupiter.api.Test;

import static Udemi.Hamcrest_Quick_start.part03_Custom_Hamcrest_Matchers.practice13_custom_matchers_StartsWith.StartsWith.startsWith;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.not;

public class Runner1 {
    @Test
    public void test1() {
        assertThat("Banana", startsWith('B'));
    }

    @Test
    public void test2() {
        assertThat("Banana", not(startsWith('b')));
    }

    @Test
    public void test3() {
        assertThat("", not(startsWith('b')));
    }
}
