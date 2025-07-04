import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestArithmeticOperations {
    @Test
    void testAdd() {
        assertEquals(5, ArithmeticOperations.add(2, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(2, ArithmeticOperations.subtract(5, 3));
    }

    @Test
    void testMultiply() {
        assertEquals(6, ArithmeticOperations.multiply(2, 3));
    }

    @Test
    void testDivide() {
        assertEquals(2.5, ArithmeticOperations.divide(5, 2));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            ArithmeticOperations.divide(10, 0);
        });
    }
}
