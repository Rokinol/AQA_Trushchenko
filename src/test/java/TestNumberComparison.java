import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class TestNumberComparison {
    @Test
    public void testFirstNumberIsGreater() {
        assertEquals(NumberComparison.compare(5, 3), "5 > 3");
    }

    @Test
    public void testSecondNumberIsGreater() {
        assertEquals(NumberComparison.compare(2, 4), "2 < 4");
    }

    @Test
    public void testNumbersAreEqual() {
        assertEquals(NumberComparison.compare(7, 7), "7 == 7");
    }
}