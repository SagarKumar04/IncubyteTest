import org.junit.*;
import static org.junit.Assert.*;

public class StringCalculatorTest {
    @Test
    public void shouldReturnZeroOnEmptyString() {
        assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public void shouldReturnNumberOnReceivingNumber() {
        assertEquals(10, StringCalculator.add("10"));
    }

    @Test
    public void shouldReturnSumOnReceivingTwoNumbers() {
        assertEquals(12, StringCalculator.add("4,8"));
    }

    @Test
    public void shouldReturnSumOnReceivingMoreThanTwoNumbers() {
        assertEquals(21, StringCalculator.add("4,8,9"));
    }
}
