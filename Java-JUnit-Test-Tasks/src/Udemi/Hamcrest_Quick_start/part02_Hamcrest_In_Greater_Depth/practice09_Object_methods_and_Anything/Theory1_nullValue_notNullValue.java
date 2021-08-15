package Udemi.Hamcrest_Quick_start.part02_Hamcrest_In_Greater_Depth.practice09_Object_methods_and_Anything;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;

public class Theory1_nullValue_notNullValue {
    @Test
    public void test1() {
        String s = null;
        assertThat(s, nullValue());

        s = "abc";
        assertThat(s, notNullValue());
    }

    @Test
    public void test2() {
        List<String> list = null;
        assertThat(list, nullValue());

        list = new ArrayList<>();
        assertThat(list, notNullValue());
    }
}
