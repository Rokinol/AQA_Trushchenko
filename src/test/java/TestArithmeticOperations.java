import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TestArithmeticOperations {
    @Test
    public void testAdd() {
        assertEquals(ArithmeticOperations.add(3, 5), 8);
    }

    @Test
    public void testSubtract() {
        assertEquals(ArithmeticOperations.subtract(10, 4), 6);
    }

    @Test
    public void testMultiply() {
        assertEquals(ArithmeticOperations.multiply(7, 3), 21);
    }

    @Test
    public void testDivide() {
        assertEquals(ArithmeticOperations.divide(10, 2), 5.0);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivideByZero() {
        ArithmeticOperations.divide(10, 0);
    }
}
