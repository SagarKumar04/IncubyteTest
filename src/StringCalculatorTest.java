import org.junit.*;
import static org.junit.Assert.*;

public class StringCalculatorTest {
    @Test
    public void shouldReturnZeroOnEmptyString() throws Exception {
        assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public void shouldReturnNumberOnReceivingNumber() throws Exception {
        assertEquals(10, StringCalculator.add("10"));
    }

    @Test
    public void shouldReturnSumOnReceivingTwoNumbers() throws Exception {
        assertEquals(12, StringCalculator.add("4,8"));
    }

    @Test
    public void shouldReturnSumOnReceivingMoreThanTwoNumbers() throws Exception {
        assertEquals(21, StringCalculator.add("4,8,9"));
    }

    @Test
    public void shouldAcceptNewLineAsValidDelimiter() throws Exception {
        assertEquals(21, StringCalculator.add("4\n8,9"));
    }

    @Test
    public void shouldAcceptDifferentDelimiters() throws Exception {
        assertEquals(27, StringCalculator.add("//;\n18;9"));
    }

    @Test
    public void shouldThrowErrorIfNegativeNumberIsPassed() {
        try {
            StringCalculator.add("4,-8");
            fail("Should have thrown an exception");
        }
        catch(Exception e) {
            String expectedMessage = "negatives not allowed";
            assertEquals("Exception message must be correct", expectedMessage, e.getMessage());
        }
    }

    @Test
    public void shouldIgnoreNumbersGreaterThan1000() throws Exception {
        assertEquals(2, StringCalculator.add("2,1001"));
    }
}
