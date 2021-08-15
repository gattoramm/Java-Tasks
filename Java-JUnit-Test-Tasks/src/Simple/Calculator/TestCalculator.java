package Simple.Calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculator {
    @Test
    public void testCalc() {
        Calculator calculator = new Calculator();
        int result = calculator.add(3,4);
        assertEquals( 7, result);
    }
}
