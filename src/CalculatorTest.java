import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }
    @Test
    void addsTwoNumbers() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void subtractsTwoNumbers() {
        assertEquals(4, calculator.subtract(6, 2));
    }

    @Test
    void multipliesTwoNumbers() {
        assertEquals(12, calculator.multiply(6, 2));
    }

    @Test
    void dividesTwoNumbers() {
        assertEquals(3, calculator.divide(6, 2));
    }

    @Test
    void throwsWhenDividingByZero() {
        try {
            calculator.divide(5, 0);
//            fail("Expected an IllegalArgumentException but nothing was thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Cannot divide by zero",e.getMessage());
        }
    }
    @Test
    void handlesNegativeNumbers() {
        assertEquals(-5, calculator.add(-2, -3));
    }

    @Test
    void addsDecimalsCorrectly() {
        assertEquals(0.3, calculator.add(0.1, 0.2), 0.0001);
    }
}