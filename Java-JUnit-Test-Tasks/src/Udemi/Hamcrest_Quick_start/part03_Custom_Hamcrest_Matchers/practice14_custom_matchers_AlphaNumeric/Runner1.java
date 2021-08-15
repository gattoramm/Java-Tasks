package Udemi.Hamcrest_Quick_start.part03_Custom_Hamcrest_Matchers.practice14_custom_matchers_AlphaNumeric;

import org.junit.jupiter.api.Test;

import static Udemi.Hamcrest_Quick_start.part03_Custom_Hamcrest_Matchers.practice14_custom_matchers_AlphaNumeric.AlphaNumeric.alphaNumeric;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

public class Runner1 {
    @Test
    public void test1() {
        assertThat("apple", is(alphaNumeric()));
    }

    @Test
    public void test2() {
        assertThat("123xyz", is(alphaNumeric()));
    }

    @Test
    public void test3() {
        assertThat("1-2-3", is(not(alphaNumeric())));
    }

    @Test
    public void test4() {
        assertThat("", is(not(alphaNumeric())));
    }
}
