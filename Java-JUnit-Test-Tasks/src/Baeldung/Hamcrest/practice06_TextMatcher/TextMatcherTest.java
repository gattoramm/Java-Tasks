package Baeldung.Hamcrest.practice06_TextMatcher;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TextMatcherTest {
    // To check if a String is empty
    @Test
    public void givenString_whenEmpty_thenCorrect() {
        String str = "";
        assertThat(str, isEmptyString());
    }

    // To check if a String is empty or null
    @Test
    public void givenString_whenEmptyOrNull_thenCorrect() {
        String str = null;
        assertThat(str, isEmptyOrNullString());
    }

    // to check for equality of two Strings while ignoring white space
    @Test
    public void given2Strings_whenEqualRegardlessWhiteSpace_thenCorrect() {
        String str1 = "text";
        String str2 = " text";
        assertThat(str1, equalToIgnoringWhiteSpace(str2));
    }
}
