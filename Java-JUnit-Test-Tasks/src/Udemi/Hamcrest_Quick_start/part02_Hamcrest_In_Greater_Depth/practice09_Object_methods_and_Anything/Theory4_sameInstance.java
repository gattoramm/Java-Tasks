package Udemi.Hamcrest_Quick_start.part02_Hamcrest_In_Greater_Depth.practice09_Object_methods_and_Anything;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.sameInstance;

public class Theory4_sameInstance {
    @Test
    public void test1() {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = list1;

        assertThat(list1, sameInstance(list2));
    }

}
