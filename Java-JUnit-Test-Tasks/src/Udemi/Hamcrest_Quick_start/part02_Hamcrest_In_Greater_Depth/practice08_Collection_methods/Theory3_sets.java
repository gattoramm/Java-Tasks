package Udemi.Hamcrest_Quick_start.part02_Hamcrest_In_Greater_Depth.practice08_Collection_methods;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class Theory3_sets {
    @Test
    public void test1() {
        Set<Integer> set = null;
        assertThat(set, nullValue());

        set = new HashSet<>();
        assertThat(set, empty());

        set.add(3); set.add(4); set.add(5);

        assertThat(set, hasSize(3));
        assertThat(set, hasItem(3));
        assertThat(set, hasItems(3, 4));
        assertThat(set, containsInAnyOrder(3, 4, 5));
    }
}
