package gr.aueb.cf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addTwoIntegers() {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 20;
        int expectedResult = 30;
        int actualResult;

        actualResult = calculator.add(a, b);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void sub() {
        Calculator calculator = new Calculator();
        int a = 30;
        int b = 20;
        int expectedResult = 10;
        int actualResult;

        actualResult = calculator.sub(a, b);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void divPositiveScenario() throws Exception {
        Calculator calculator = new Calculator();
        int a = 30;
        int b = 10;
        int expectedResult = 3;
        int actualResult;

        actualResult = calculator.div(a, b);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void divNegativeScenario() throws Exception {
        Calculator calculator = new Calculator();
        int a = 30;
        int b = 0;

        assertThrows(Exception.class, () -> calculator.div(a, b));
    }
}