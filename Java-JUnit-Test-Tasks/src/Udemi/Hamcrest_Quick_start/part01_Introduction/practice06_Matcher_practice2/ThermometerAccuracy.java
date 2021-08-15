package Udemi.Hamcrest_Quick_start.part01_Introduction.practice06_Matcher_practice2;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

public class ThermometerAccuracy {
    @Test
    public void test1() {
        double[] actualValues = {22.1, 25.0, 33.4, 56.2};
        double[] thermometerValues = {22.0, 24.8, 33.4, 56.1};

        for(int i = 0; i < 4; i++) {
            double actual = actualValues[i];
            double thermometer = thermometerValues[i];

            assertThat(thermometer, closeTo(actual, 0.2));
        }
    }
}
