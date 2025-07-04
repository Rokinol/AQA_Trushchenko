import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestFactorialCalculator {
    @Test
    void testFactorialOfZero(){
        assertEquals(1, FactorialCalculator.calculateFactorial(0));
    }
    @Test
    void  testFactorialOfFour(){
        assertEquals(24, FactorialCalculator.calculateFactorial(4));
    }
    @Test
    void testFactorialNegative(){
        assertThrows(IllegalAccessException.class, () -> FactorialCalculator.calculateFactorial(-1));
    }
}
