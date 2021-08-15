package Udemi.Hamcrest_Quick_start.part03_Custom_Hamcrest_Matchers.practice14_custom_matchers_AlphaNumeric;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

public class AlphaNumeric extends TypeSafeMatcher<String> {

    public static AlphaNumeric alphaNumeric() {
        return new AlphaNumeric();
    }

    @Override
    protected boolean matchesSafely(String lhs) {
        if(lhs.length() == 0) return false;
        else {
            for(int i = 0; i < lhs.length(); i++) {
                char c = lhs.charAt(i);
                if(isAlphaNumericCharacter(c)) continue;
                else return false;
            }
        }
        return true;
    }

    private boolean isAlphaNumericCharacter(char c) {
        int asciiValue = (int)c;
        if(asciiValue >= 48 && asciiValue <=57) return true;
        else if(asciiValue >=65 && asciiValue <= 90) return true;
        else if(asciiValue >= 97 && asciiValue <= 122) return true;
        else return false;
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("alphanumeric");
    }
}
