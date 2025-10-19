import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {
    @Test
    void testAddition() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        int result = calculator.add(2, 2);

        // Assert
        assertEquals(5, result, "2 + 3 should equal 5");
    }

    @Test
    void testSubtraction() {
        Calculator calculator = new Calculator();
        int result = calculator = calculator.subtract(5, 3);
        assertEquals(2, result, "5 - 3 should equal 2");
    }


}
