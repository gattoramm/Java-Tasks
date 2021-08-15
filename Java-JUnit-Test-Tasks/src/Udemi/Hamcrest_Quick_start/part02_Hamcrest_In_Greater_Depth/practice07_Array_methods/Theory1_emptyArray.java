package Udemi.Hamcrest_Quick_start.part02_Hamcrest_In_Greater_Depth.practice07_Array_methods;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.emptyArray;

public class Theory1_emptyArray {
    @Test
    public void test1() {
        String[] array = {};
        assertThat(array, emptyArray());

        Integer[] numbers = {};
        assertThat(numbers, emptyArray());

        Car[] cars = {};
        assertThat(cars, emptyArray());
    }
}

class Car {

}
