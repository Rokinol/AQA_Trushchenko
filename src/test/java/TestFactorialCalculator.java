import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class TestFactorialCalculator {
    @Test
    public void testFactorialOfZero() {
        assertEquals(FactorialCalculator.calculateFactorial(0), 1);
    }

    @Test
    public void testFactorialOfFour() {
        assertEquals(FactorialCalculator.calculateFactorial(4), 24);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialOfNegativeNumber() {
        FactorialCalculator.calculateFactorial(-1);
    }
}
