import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {
    @Test
    void testAddition() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        int result = calculator.add(5,5);

        // Assert
        assertEquals(10, result, "5 + 5 = 10");
    }

    @Test
    void testSubtraction() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(5, 3);
        assertEquals(2, result, "5 - 3 = 2");
    }

    @Test
    void testMultiplication() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(2,2);
        assertEquals(4, result, "2 x 2 = 4");
    }

    @Test
    void testDivision() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(10, 2);
        assertEquals(5, result, "10 / 2 = 5");
    }


}
