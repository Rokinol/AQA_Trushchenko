import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestTriangleArea {
    @Test
    void testAreaWithCorrectInput() {
        assertEquals(10.0, TriangleArea.calculateArea(5, 4));
    }
    @Test
    void testAreaWithZeroInput(){
        assertThrows(IllegalArgumentException.class, () -> TriangleArea.calculateArea(0,4));
    }
}
