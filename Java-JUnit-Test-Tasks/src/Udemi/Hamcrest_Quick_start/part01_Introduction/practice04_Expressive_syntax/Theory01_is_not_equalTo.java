package Udemi.Hamcrest_Quick_start.part01_Introduction.practice04_Expressive_syntax;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class Theory01_is_not_equalTo {
    @Test
    public void test1() {
        String s = "abc def";
        String t = "abc def";
        String u = "xyz";

        assertThat(s, is(equalTo(t)));
        assertThat(t, not(equalTo(u)));
        assertThat(t, is(not(equalTo(u))));
    }
}
