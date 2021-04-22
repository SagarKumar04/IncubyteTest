import org.junit.*;
import static org.junit.Assert.*;

public class StringCalculatorTest {
    @Test
    public void returnZeroOnEmptyString() {
        assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public void returnNumberOnReceivingNumber() {
        assertEquals(10, StringCalculator.add("10"));
    }

    @Test
    public void returnSumOnReceivingTwoNumbers() {
        assertEquals(12, StringCalculator.add("4,8"));
    }
}
