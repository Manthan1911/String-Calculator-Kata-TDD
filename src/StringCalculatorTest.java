import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    @Test
    public void shouldReturnZeroIfEmptyStringIsProvided() {
        StringCalculator strCalc = new StringCalculator();
        assertEquals("if empty string is provided than add() method should return 0", 0, strCalc.add(""));
    }

    @Test
    public void shouldReturnNumberItselfIfOneNumberIsProvided() {
        StringCalculator strCalc = new StringCalculator();
        assertEquals("if only one number is provided then add() method should return that number itself", 100,
                strCalc.add("100"));
    }
}