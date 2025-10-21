package za.co.simulation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {
    @Test
    @DisplayName("This is an addition test.")
    void testAddition() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        int result = calculator.add(5,5);

        // Assert
        assertEquals(10, result, "5 + 5 = 10");
    }

    @Test
    @DisplayName("This is a Subtraction test.")
    void testSubtraction() {
        //Arrange
        Calculator calculator = new Calculator();
        // Act
        int result = calculator.subtract(5, 3);
        // Assert
        assertEquals(2, result, "5 - 3 = 2");
    }

    @Test
    @DisplayName("This is a Multiplication test.")
    void testMultiplication() {
        // Arrange
        Calculator calculator = new Calculator();
        // Act
        int result = calculator.multiply(2,2);
        // Assert
        assertEquals(4, result, "2 x 2 = 4");
    }

    @Test
    @DisplayName("This is a Division test.")
    void testDivision() {
        // Arrange
        Calculator calculator = new Calculator();
        // Act
        int result = calculator.divide(10, 2);
        // Assert
        assertEquals(5, result, "10 / 2 = 5");
    }
}
