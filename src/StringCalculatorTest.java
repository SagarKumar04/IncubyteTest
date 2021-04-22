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
}
