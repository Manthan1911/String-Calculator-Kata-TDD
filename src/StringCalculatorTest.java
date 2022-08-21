import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

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
    public void shouldReturnAdditionOfNumberIfStringIsSeparatedByComma() {
        assertEquals("if string is comma separated then addition of that values is returned by add() method", 3,
                strCalc.add("1,2"));
    }

    @Test
    public void shouldReturnAdditionOfUnknownAmountOfNumbers() {
        assertEquals("It shoud return sum of N number of comma separated values", 50,
                strCalc.add("5,10,15,20"));
    }

    @Test
    public void shouldReturnAdditionOfNumbersAlongWithAlphabets() {
        assertEquals("It shoud return sum of N number of comma separated values along with alphabets", 6,
                strCalc.add("1,2,a,b"));
    }

    @Test
    public void shouldThrowExceptionIfNegativeNumberIsPresentInString() {
        RuntimeException e = assertThrows(RuntimeException.class, () -> {
            strCalc.add("1,2,-3,a");
        });
        assertEquals("Negatives not allowed : -3", e.getMessage());
    }

    @Test
    public void shouldThrowExceptionIfMultipleNegativeNumbersArePresentInString() {
        RuntimeException e = assertThrows(RuntimeException.class, () -> {
            strCalc.add("1,-2,-3,-7,a");
        });
        assertEquals("Negatives not allowed : -2 -3 -7", e.getMessage());
    }

    @Test
    public void shouldIgnoreNumberGreaterThanOneThousand() {
        assertEquals("If a number greater than 1000 is provided than ignore it", 2, strCalc.add("2,1001"));
    }
}