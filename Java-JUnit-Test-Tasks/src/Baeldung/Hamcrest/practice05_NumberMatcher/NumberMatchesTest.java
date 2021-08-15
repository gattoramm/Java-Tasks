package Baeldung.Hamcrest.practice05_NumberMatcher;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class NumberMatchesTest {
    // To check greaterThan condition
    @Test
    public void givenAnInteger_whenGreaterThan0_thenCorrect() {
        assertThat(1, greaterThan(0));
    }

    // To check greaterThan or equalTo condition
    @Test
    public void givenAnInteger_whenGreaterThanOrEqTo5_thenCorrect() {
        assertThat(5, greaterThanOrEqualTo(5));
    }

    // To check lessThan condition
    @Test
    public void givenAnInteger_whenLessThan0_thenCorrect() {
        assertThat(-1, lessThan(0));
    }

    // To check lessThan or equalTo condition
    @Test
    public void givenAnInteger_whenLessThanOrEqTo5_thenCorrect() {
        assertThat(-1, lessThanOrEqualTo(5));
    }

    // To check closeTo condition
    @Test
    public void givenADouble_whenCloseTo_thenCorrect() {
        assertThat(1.2, closeTo(1, 0.5));
    }
}
