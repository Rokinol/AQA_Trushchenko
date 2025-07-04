import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class TestTriangleArea {
    @Test
    public void testAreaWithValidInput() {
        assertEquals(TriangleArea.calculateArea(4, 5), 10.0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testAreaWithZeroInput() {
        TriangleArea.calculateArea(0, 5);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testAreaWithNegativeInput() {
        TriangleArea.calculateArea(4, -5);
    }
}
