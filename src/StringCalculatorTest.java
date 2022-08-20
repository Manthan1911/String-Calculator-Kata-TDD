import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    @Test
    public void shouldReturnZeroIfEmptyStringIsProvided() {
        StringCalculator strCalc = new StringCalculator();
        assertEquals("if empty string is provided than add() method should return 0", 0, strCalc.add(""));
    }

}