package Udemi.Hamcrest_Quick_start.part03_Custom_Hamcrest_Matchers.practice13_custom_matchers_StartsWith;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

public class StartsWith extends TypeSafeMatcher<String> {
    char c; String lhs;

    public StartsWith(char c) {
        this.c = c;
    }

    public static StartsWith startsWith(char c) {
        return new StartsWith(c);
    }

    @Override
    protected boolean matchesSafely(String lhs) {
        if(lhs.length() == 0) return false;
        else {
            this.lhs = lhs;
            return lhs.charAt(0) == c;
        }
    }

    @Override
    public void describeTo(Description description) {
        description.appendText(lhs + " does not start with " + c);
    }
}
