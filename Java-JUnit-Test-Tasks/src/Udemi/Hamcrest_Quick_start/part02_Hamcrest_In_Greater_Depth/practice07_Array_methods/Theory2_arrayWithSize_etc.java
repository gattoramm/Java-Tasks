package Udemi.Hamcrest_Quick_start.part02_Hamcrest_In_Greater_Depth.practice07_Array_methods;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class Theory2_arrayWithSize_etc {
    @Test
    public void test1() {
        String[] animals = {"alpaca", "bat", "cat"};
        assertThat(animals, arrayWithSize(3));

        assertThat(animals, hasItemInArray("bat"));

        assertThat(animals, arrayContaining("alpaca", "bat", "cat"));

        assertThat(animals, arrayContainingInAnyOrder("alpaca", "cat", "bat"));
    }
}
