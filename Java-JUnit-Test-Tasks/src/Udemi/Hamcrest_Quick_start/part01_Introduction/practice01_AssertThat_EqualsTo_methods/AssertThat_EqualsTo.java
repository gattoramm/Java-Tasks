package Udemi.Hamcrest_Quick_start.part01_Introduction.practice01_AssertThat_EqualsTo_methods;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class AssertThat_EqualsTo {
    @Test
    void test1() {
        String s ="abc";
        assertThat(s.length(), equalTo(3));
        System.out.println("I print if the assert passes.");
    }

    @Test
    void test2() {
        String s ="abc";
        assertThat("my optional custom error message", s.length(), equalTo(3));
        System.out.println("I also print if the assert passes.");
    }
}
