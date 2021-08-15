package Udemi.Hamcrest_Quick_start.part02_Hamcrest_In_Greater_Depth.practice09_Object_methods_and_Anything;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.isA;

public class Theory2_instanceOf_isA {
    @Test
    public void test1() {
        List<Integer> list = new ArrayList<>();
        assertThat(list, instanceOf(List.class));

        Map<String, Integer> map = new HashMap<>();
        assertThat(map, instanceOf(Map.class));

        assertThat(map, isA(Map.class));
    }
}
