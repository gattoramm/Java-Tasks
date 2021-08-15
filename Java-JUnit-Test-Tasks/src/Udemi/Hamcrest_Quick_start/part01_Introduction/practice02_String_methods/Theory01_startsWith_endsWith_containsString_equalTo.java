package Udemi.Hamcrest_Quick_start.part01_Introduction.practice02_String_methods;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class Theory01_startsWith_endsWith_containsString_equalTo {
    @Test
    void test1() {
        String s = "abc def";
        String t = "abc def";
        assertThat(s, startsWith("ab"));
        assertThat(s, endsWith("ef"));
        assertThat(s, containsString("c de"));
        assertThat(s, equalTo(t));
    }

    @Test
    void test2() {
        String s = "abcdef";
        String t = "aBCdef";
        assertThat(s, startsWithIgnoringCase("aB"));
        assertThat(s, endsWithIgnoringCase("dEF"));
        assertThat(s, containsStringIgnoringCase("BcD"));
        assertThat(s, equalToIgnoringCase(t));
    }
}
