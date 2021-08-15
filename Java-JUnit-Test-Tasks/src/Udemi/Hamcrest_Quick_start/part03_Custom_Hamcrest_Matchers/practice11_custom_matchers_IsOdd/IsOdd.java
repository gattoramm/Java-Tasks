package Udemi.Hamcrest_Quick_start.part03_Custom_Hamcrest_Matchers.practice11_custom_matchers_IsOdd;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

public class IsOdd extends TypeSafeMatcher<Integer> {

    public static IsOdd isOdd() {
        return new IsOdd();
    }

    @Override
    protected boolean matchesSafely(Integer lhs) {
        return lhs %2 == 1;
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("we want an odd number");
    }
}
