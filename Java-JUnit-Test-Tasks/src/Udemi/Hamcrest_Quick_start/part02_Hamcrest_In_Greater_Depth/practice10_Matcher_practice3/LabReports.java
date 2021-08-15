package Udemi.Hamcrest_Quick_start.part02_Hamcrest_In_Greater_Depth.practice10_Matcher_practice3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.everyItem;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;

public class LabReports {
    @Test
    public void test1() {
        List<Integer> labReportScores = Arrays.asList(70, 80, 85, 75, 90, 90, 74, 96, 85, 90);
        assertThat(labReportScores.size(), greaterThanOrEqualTo(8));
        assertThat(labReportScores, everyItem(greaterThanOrEqualTo(70)));
    }
}
