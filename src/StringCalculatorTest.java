import org.junit.*;
import static org.junit.Assert.*;

public class StringCalculatorTest {
    @Test
    public void returnZeroOnEmptyString() {
        assertEquals(0, StringCalculator.add(""));
    }
}
