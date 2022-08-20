import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    private StringCalculator strCalc;

    @Before
    public void instantiateClassStringCalculator() {
        strCalc = new StringCalculator();
    }

    @Test
    public void shouldReturnZeroIfEmptyStringIsProvided() {
        assertEquals("if empty string is provided than add() method should return 0", 0, strCalc.add(""));
    }

    @Test
    public void shouldReturnNumberItselfIfOneNumberIsProvided() {
        assertEquals("if only one number is provided then add() method should return that number itself", 100,
                strCalc.add("100"));
    }

    @Test
    public void shouldReturnAdditionOfNumberIfStringIsSeperatedByComa() {
        assertEquals("if string is coma seperated then addition of that values is returned by add() method", 3,
                strCalc.add("1,2"));
    }
}