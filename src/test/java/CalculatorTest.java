import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private static Calculator calculator;

    @BeforeAll
    static void setup() {
        calculator = new Calculator();
    }

    @Test
    void add() {
        Assertions.assertEquals(15, calculator.add(10, 5));
        Assertions.assertEquals(5, calculator.add(3, 2)); //Success
        Assertions.assertNotEquals(6, calculator.add(2, 1)); //Fail
    }

    @Test
    void dif() {
        Assertions.assertEquals(15, calculator.dif(20, 5));
        Assertions.assertEquals(6, calculator.dif(8, 2)); //Success
        Assertions.assertNotEquals(6, calculator.dif(7, 5)); //Fail
    }

    @Test
    void div() {
        Assertions.assertEquals(15, calculator.div(45, 3));
        Assertions.assertEquals(3, calculator.div(6, 2)); //Success
        Assertions.assertNotEquals(2, calculator.div(4, 1)); //Fail
    }

    @Test
    void times() {
        Assertions.assertEquals(15, calculator.times(5, 3));
        Assertions.assertEquals(6, calculator.times(2, 3)); //Success
        Assertions.assertNotEquals(8, calculator.times(1, 3)); //Fail
    }

    @Test
    void solver() {
        Assertions.assertEquals(3, calculator.solver()); //Success
        Assertions.assertNotEquals(5, calculator.solver()); //Fail
    }
}
