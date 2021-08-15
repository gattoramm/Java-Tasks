package Udemi.Hamcrest_Quick_start.part02_Hamcrest_In_Greater_Depth.practice09_Object_methods_and_Anything;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.is;

public class Theory5_anything {
    @Test
    public void test1() {
        String s = "car";
        String t = null;
        List<Integer> list1 = null;
        List<Integer> list2 = new ArrayList<>();

        assertThat(100, anything());
        assertThat(null, anything());
        assertThat("hello", anything());
        assertThat(s, anything());
        assertThat(t, anything());
        assertThat(list1, anything());
        assertThat(list2, anything());

        assertThat("abc", is(anything()));
    }
}
