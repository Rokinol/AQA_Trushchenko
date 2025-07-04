import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestNumberComparison {
    @Test
    void testCompareWhenFirstGreater() {
        String result = NumberComparison.compare(5, 3);
        assertEquals("5 > 3", result);
    }

    @Test
    void testCompareWhenSecondGreater() {
        String result = NumberComparison.compare(2, 8);
        assertEquals("2 < 8", result);
    }

    @Test
    void testCompareWhenEqual() {
        String result = NumberComparison.compare(4, 4);
        assertEquals("4 == 4", result);
    }

    @Test
    void testCompareWithNegativeNumbers() {
        String result = NumberComparison.compare(-5, -2);
        assertEquals("-5 < -2", result);
    }

    @Test
    void testCompareWithZero() {
        String result = NumberComparison.compare(0, 0);
        assertEquals("0 == 0", result);
    }
}
