import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private static Calculator calculator;

    @BeforeAll
    static void setup() {
        calculator = new Calculator();
    }

    @Test
    void add() {
        Assertions.assertEquals(15, calculator.add(10, 5));
        Assertions.assertEquals(51, calculator.add(10, 5));
    }

    @Test
    void dif() {
        Assertions.assertEquals(15, calculator.dif(20, 5));
        Assertions.assertEquals(51, calculator.dif(20, 5));
    }

    @Test
    void div() {
        Assertions.assertEquals(15, calculator.div(45, 3));
        Assertions.assertEquals(51, calculator.div(45, 3));
    }

    @Test
    void times() {
        Assertions.assertEquals(15, calculator.times(5, 3));
        Assertions.assertEquals(51, calculator.times(5, 3));
    }

    @Test
    void solver() {
        Assertions.assertEquals(18 , calculator.solver());
    }
}