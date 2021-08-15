package Udemi.Hamcrest_Quick_start.part03_Custom_Hamcrest_Matchers.practice12_custom_matchers_Sum;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

public class Sum extends TypeSafeMatcher<Integer> {
    final private int a, b, c;

    public Sum(final int a, final int b, final int c) {
        this.a = a; this.b = b; this.c = c;
    }

    public static Sum sum (final int a, final int b, final int c) {
        return new Sum(a, b, c);
    }

    @Override
    protected boolean matchesSafely(Integer lhs) {
        return lhs == a + b + c;
    }

    @Override
    public void describeTo(Description description) {
        description.appendText(a + b + c + "");
    }
}
